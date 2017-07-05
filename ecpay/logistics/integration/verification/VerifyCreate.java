package ecpay.logistics.integration.verification;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import ecpay.logistics.integration.ecpayOperator.LogisticsVerifyBase;
import ecpay.logistics.integration.errorMsg.ErrorMessage;
import ecpay.logistics.integration.exception.EcpayException;

public class VerifyCreate extends LogisticsVerifyBase{
	public VerifyCreate(){
		super();
	}
	
	public String getAPIUrl(String mode) throws EcpayException{
		Element ele = (Element)doc.getElementsByTagName("Create").item(0);
		String url = "";
		NodeList nodeList = ele.getElementsByTagName("url");
		for(int i = 0; i < nodeList.getLength(); i++){
			ele = (Element)nodeList.item(i);
			if(ele.getAttribute("type").equalsIgnoreCase(mode)){
				url = ele.getTextContent();
				System.out.println(url);
				break;
			}
		}
		if(url == "")
			throw new EcpayException(ErrorMessage.OperatingMode_ERROR);
		return url;
	}
	
	public void verifyParams(Object obj){
		Class<?> cls = obj.getClass();
		Method method;
		String objValue;
		List<String> fieldNames = new ArrayList<String>();
		for(Field field : cls.getDeclaredFields()){
			fieldNames.add(field.getName());
		}
		Element ele = (Element)doc.getElementsByTagName("Create").item(0);
		NodeList nodeList = ele.getElementsByTagName("param");
		for(int i = 0; i < nodeList.getLength(); i++){
			Element tmpEle = (Element)nodeList.item(i);
			if(fieldNames.contains(tmpEle.getAttribute("name"))){
				try{
					method = cls.getMethod("get"+tmpEle.getAttribute("name"), null);
					objValue = method.invoke(obj, null).toString();
				} catch(Exception e){
					throw new EcpayException(ErrorMessage.OBJ_MISSING_FIELD);
				}
				requireCheck(tmpEle.getAttribute("name"), objValue, tmpEle.getAttribute("require").toString());
				valueCheck(tmpEle.getAttribute("type"), objValue, tmpEle);
			} else{
				continue;
			}
		}
	}
}
