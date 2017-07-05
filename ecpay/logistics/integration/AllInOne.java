package ecpay.logistics.integration;

import java.util.Hashtable;
import java.util.Set;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import ecpay.logistics.integration.domain.CancelC2COrderObj;
import ecpay.logistics.integration.domain.CreateCVSObj;
import ecpay.logistics.integration.domain.CreateHomeObj;
import ecpay.logistics.integration.domain.CreateTestDataObj;
import ecpay.logistics.integration.domain.ExpressMapObj;
import ecpay.logistics.integration.domain.LogisticsCheckAccountsObj;
import ecpay.logistics.integration.domain.PrintFAMIC2COrderInfoObj;
import ecpay.logistics.integration.domain.PrintHILIFEC2COrderInfoObj;
import ecpay.logistics.integration.domain.PrintTradeDocumentObj;
import ecpay.logistics.integration.domain.PrintUniMartC2COrderInfoObj;
import ecpay.logistics.integration.domain.QueryLogisticsTradeInfoObj;
import ecpay.logistics.integration.domain.ReturnCVSObj;
import ecpay.logistics.integration.domain.ReturnHiLifeCVSObj;
import ecpay.logistics.integration.domain.ReturnHomeObj;
import ecpay.logistics.integration.domain.ReturnUniMartCVSObj;
import ecpay.logistics.integration.domain.UpdateShipmentInfoObj;
import ecpay.logistics.integration.domain.UpdateStoreInfoObj;
import ecpay.logistics.integration.ecpayOperator.EcpayFunction;
import ecpay.logistics.integration.errorMsg.ErrorMessage;
import ecpay.logistics.integration.exception.EcpayException;
import ecpay.logistics.integration.verification.VerifyCancelC2COrder;
import ecpay.logistics.integration.verification.VerifyCreate;
import ecpay.logistics.integration.verification.VerifyCreateTestData;
import ecpay.logistics.integration.verification.VerifyLogisticsCheckAccounts;
import ecpay.logistics.integration.verification.VerifyMap;
import ecpay.logistics.integration.verification.VerifyPrintFAMIC2COrderInfo;
import ecpay.logistics.integration.verification.VerifyPrintHILIFEC2COrderInfo;
import ecpay.logistics.integration.verification.VerifyPrintTradeDocument;
import ecpay.logistics.integration.verification.VerifyPrintUniMartC2COrderInfo;
import ecpay.logistics.integration.verification.VerifyQueryLogisticsTradeInfo;
import ecpay.logistics.integration.verification.VerifyReturnCVS;
import ecpay.logistics.integration.verification.VerifyReturnHiLifeCVS;
import ecpay.logistics.integration.verification.VerifyReturnHome;
import ecpay.logistics.integration.verification.VerifyReturnUniMartCVS;
import ecpay.logistics.integration.verification.VerifyUpdateShipmentInfo;
import ecpay.logistics.integration.verification.VerifyUpdateStoreInfo;

/**
 * 綠界物流全功能類別
 * @author mark.chiu
 *
 */
public class AllInOne extends AllInOneBase{
	private final static Logger log = Logger.getLogger(AllInOne.class.getName());
	
	public AllInOne(String log4jPropertiesPath){
		super();
		if(log4jPropertiesPath != "" && log4jPropertiesPath != null){
			if(log4jPropertiesPath.substring(log4jPropertiesPath.length()-1) == "/")
				PropertyConfigurator.configure(log4jPropertiesPath+"log4j.properties");
			else
				PropertyConfigurator.configure(log4jPropertiesPath+"/log4j.properties");
		} else{
			Logger.getRootLogger().setLevel(Level.OFF);
		}
	}
	
	public AllInOne(){
		Logger.getRootLogger().setLevel(Level.OFF);
	}
	
	/**
	 * 檢查Hashtable中的檢查碼是否正確(確保資料未被竄改)
	 * @param Hashtable params
	 * @return boolean 
	 */
	public boolean compareCheckMacValue(Hashtable<String, String> params){
		String checkMacValue = "";
		if(!params.containsKey("CheckMacValue")){
			throw new EcpayException(ErrorMessage.HASHTABLE_WITHOUT_CHKMACVALUE);
		}
		try {
			checkMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, params);
		} catch (EcpayException e) {
			throw new EcpayException(ErrorMessage.GEN_CHECK_MAC_VALUE_FAIL);
		}
		if(checkMacValue.equals(params.get("CheckMacValue"))){
			return true;
		} else{
			return false;
		}
	}
	
	/**
	 * 電子地圖串接(此 API 為超商取貨時選擇取貨分店時使用) 
	 * @param obj
	 * @return string
	 */
	public String expressMap(ExpressMapObj obj){
		obj.setMerchantID(MerchantID);
		log.info("ExpressMap params: "+obj.toString());
		VerifyMap verify = new VerifyMap();
		mapUrl = verify.getAPIUrl(operatingMode);
		verify.verifyParams(obj);
		return genHtmlCode(obj, mapUrl, false);
	}
	
	/**
	 * 物流訂單產生
	 * @param obj
	 * @return string
	 */
	public String create(Object obj){
		boolean isFormPost;
		if(obj instanceof CreateCVSObj){
			((CreateCVSObj) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((CreateCVSObj) obj).getMerchantID().isEmpty()){
				((CreateCVSObj) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((CreateCVSObj) obj).getMerchantID().isEmpty()){
			} else{
				((CreateCVSObj) obj).setMerchantID(MerchantID);
			}
			isFormPost = ((CreateCVSObj) obj).getClientReplyURL().isEmpty()? false: true;
		} else if(obj instanceof CreateHomeObj){
			((CreateHomeObj) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((CreateHomeObj) obj).getMerchantID().isEmpty()){
				((CreateHomeObj) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((CreateHomeObj) obj).getMerchantID().isEmpty()){
			} else{
				((CreateHomeObj) obj).setMerchantID(MerchantID);
			}
			isFormPost = ((CreateHomeObj) obj).getClientReplyURL().isEmpty()? false: true;
		} else
			throw new EcpayException(ErrorMessage.UNDIFINED_OBJECT);
		String result = "";
		try{
			VerifyCreate verify = new VerifyCreate();
			createUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			verify.verifyCreate(obj);
			if(isFormPost){
				result = genHtmlCode(obj, createUrl, true);
			} else{
				String CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
				log.info("Create generate CheckMacValue: "+CheckMacValue);
				String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
				log.info("Create post String: "+httpValue);
				result = EcpayFunction.httpPost(createUrl, httpValue, "UTF-8");
			}
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		System.out.println(result);
		return result;
	}
	
	/**
	 * 宅配逆物流訂單
	 * @param obj
	 * @return string
	 */
	public String returnHome(ReturnHomeObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("ReturnHome params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyReturnHome verify = new VerifyReturnHome();
			returnHomeUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			verify.verifyReturnHome(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("ReturnHome generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("ReturnHome post String: "+httpValue);
			result = EcpayFunction.httpPost(returnHomeUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 超商取貨逆物流訂單(全家超商 B2C)
	 * @param obj
	 * @return string
	 */
	public String returnCVS(ReturnCVSObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("ReturnCVS params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyReturnCVS verify = new VerifyReturnCVS();
			returnCVSUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			verify.verifyReturnCVS(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("ReturnCVS generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("ReturnCVS post String: "+httpValue);
			result = EcpayFunction.httpPost(returnCVSUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 全家逆物流核帳(全家超商 B2C)
	 * @param obj
	 * @return string
	 */
	public String logisticsCheckAccounts(LogisticsCheckAccountsObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("LogisticsCheckAccounts params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyLogisticsCheckAccounts verify = new VerifyLogisticsCheckAccounts();
			logisticsCheckAccountsUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("LogisticsCheckAccounts generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("LogisticsCheckAccounts post string: "+httpValue);
			result = EcpayFunction.httpPost(logisticsCheckAccountsUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 超商取貨逆物流訂單(萊爾富超商 B2C)
	 * @param obj
	 * @return string
	 */
	public String returnHiLifeCVS(ReturnHiLifeCVSObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("ReturnHiLifeCVS params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyReturnHiLifeCVS verify = new VerifyReturnHiLifeCVS();
			returnHiLifeCVSUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			verify.verifyReturnHiLifeCVS(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("ReturnHiLifeCVS generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("ReturnHiLifeCVS post string: "+httpValue);
			result = EcpayFunction.httpPost(returnHiLifeCVSUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 超商取貨逆物流訂單(統一超商 B2C)
	 * @param obj
	 * @return string
	 */
	public String returnUniMartCVS(ReturnUniMartCVSObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("ReturnUniMartCVS params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyReturnUniMartCVS verify = new VerifyReturnUniMartCVS();
			returnUniMartCVSUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			verify.verifyReturnUniMartCVS(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("ReturnUniMartCVS generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("ReturnUniMartCVS post string: "+httpValue);
			result = EcpayFunction.httpPost(returnUniMartCVSUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 提供廠商修改出貨日期、取貨門市(統一超商 B2C)
	 * @param obj
	 * @return string
	 */
	public String updateShipmentInfo(UpdateShipmentInfoObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("UpdateShipmentInfo params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyUpdateShipmentInfo verify = new VerifyUpdateShipmentInfo();
			updateShipmentInfoUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			verify.verifyUpdateShipmentInfo(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("UpdateShipmentInfo generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("UpdateShipmentInfo post string: "+httpValue);
			result = EcpayFunction.httpPost(updateShipmentInfoUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 更新門市(統一超商C2C)
	 * @param obj
	 * @return string
	 */
	public String updateStoreInfo(UpdateStoreInfoObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("UpdateStoreInfo params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyUpdateStoreInfo verify = new VerifyUpdateStoreInfo();
			updateStoreInfoUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			verify.verifyUpdateStoreInfo(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("UpdateStoreInfo generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("UpdateStoreInfo post string: "+httpValue);
			result = EcpayFunction.httpPost(updateStoreInfoUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 取消訂單(統一超商C2C)
	 * @param obj
	 * @return string
	 */
	public String cancelC2COrder(CancelC2COrderObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("CancelC2COrder params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyCancelC2COrder verify = new VerifyCancelC2COrder();
			cancelC2COrderUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("CancelC2COrder generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("CancelC2COrder post string: "+httpValue);
			result = EcpayFunction.httpPost(cancelC2COrderUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 物流訂單查詢
	 * @param obj
	 * @return string
	 */
	public String queryLogisticsTradeInfo(QueryLogisticsTradeInfoObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		obj.setTimeStamp(EcpayFunction.genUnixTimeStamp());
		log.info("QueryLogisticsTradeInfo params: "+obj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyQueryLogisticsTradeInfo verify = new VerifyQueryLogisticsTradeInfo();
			queryLogisticsTradeInfoUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("QueryLogisticsTradeInfo generate CheckMacValue: "+CheckMacValue);
			String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
			log.info("QueryLogisticsTradeInfo post string: "+httpValue);
			result = EcpayFunction.httpPost(queryLogisticsTradeInfoUrl, httpValue, "UTF-8");
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 產生托運單(宅配)/一段標(超商取貨)格式(B2C)
	 * @param obj
	 * @return string
	 */
	public String printTradeDocument(PrintTradeDocumentObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("PrintTradeDocument params: "+obj.toString());
		VerifyPrintTradeDocument verify = new VerifyPrintTradeDocument();
		printTradeDocumentUrl = verify.getAPIUrl(operatingMode);
		verify.verifyParams(obj);
		return genHtmlCode(obj, printTradeDocumentUrl, true);
	}
	
	/**
	 * 列印繳款單(統一超商 C2C)
	 * @param obj
	 * @return string
	 */
	public String printUniMartC2COrderInfo(PrintUniMartC2COrderInfoObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("PrintUniMartC2COrderInfo params: "+obj.toString());
		VerifyPrintUniMartC2COrderInfo verify = new VerifyPrintUniMartC2COrderInfo();
		printUniMartC2COrderInfoUrl = verify.getAPIUrl(operatingMode);
		verify.verifyParams(obj);
		return genHtmlCode(obj, printUniMartC2COrderInfoUrl, true);
	}
	
	/**
	 * 全家列印小白單(全家超商 C2C)
	 * @param obj
	 * @return string
	 */
	public String printFAMIC2COrderInfo(PrintFAMIC2COrderInfoObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("PrintFAMIC2COrderInfo params: "+obj.toString());
		VerifyPrintFAMIC2COrderInfo verify = new VerifyPrintFAMIC2COrderInfo();
		printFAMIC2COrderInfoUrl = verify.getAPIUrl(operatingMode);
		verify.verifyParams(obj);
		return genHtmlCode(obj, printFAMIC2COrderInfoUrl, true);
	}
	
	/**
	 * 萊爾富列印小白單(萊爾富超商 C2C)
	 * @param obj
	 * @return string
	 */
	public String printHILIFEC2COrderInfo(PrintHILIFEC2COrderInfoObj obj){
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("PrintHILIFEC2COrderInfo params: "+obj.toString());
		VerifyPrintHILIFEC2COrderInfo verify = new VerifyPrintHILIFEC2COrderInfo();
		printHILIFEC2COrderInfoUrl = verify.getAPIUrl(operatingMode);
		verify.verifyParams(obj);
		return genHtmlCode(obj, printHILIFEC2COrderInfoUrl, true);
	}
	
	/**
	 * 產生 B2C 測標資料
	 * @param obj
	 * @return string
	 */
	public String createTestData(CreateTestDataObj obj){
		boolean isFormPost = obj.getClientReplyURL().isEmpty()? false: true;
		obj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && obj.getMerchantID().isEmpty()){
			obj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !obj.getMerchantID().isEmpty()){
		} else{
			obj.setMerchantID(MerchantID);
		}
		log.info("CreateTestData params: "+obj.toString());
		String result = "";
		try{
			VerifyCreateTestData verify = new VerifyCreateTestData();
			createTestDataUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			if(isFormPost){
				result = genHtmlCode(obj, createTestDataUrl, true);
			} else{
				String CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, obj);
				log.info("CreateTestData generate CheckMacValue: "+CheckMacValue);
				String httpValue = EcpayFunction.genHttpValue(obj, CheckMacValue);
				log.info("CreateTestData post string: "+httpValue);
				result = EcpayFunction.httpPost(createTestDataUrl, httpValue, "UTF-8");
			}
			
		} catch(EcpayException e){
			e.ShowExceptionMessage();
			log.error(e.getNewExceptionMessage());
			throw new EcpayException(e.getNewExceptionMessage());
		}
		return result;
	}
	
	private String genHtmlCode(Object obj, String url, boolean needCheckMacValue){
		StringBuilder builder = new StringBuilder();
		Hashtable<String, String> fieldValue = EcpayFunction.objToHashtable(obj);
		if(needCheckMacValue == true){
			String CheckMacValue = EcpayFunction.genCheckMacValue(HashKey, HashIV, fieldValue);
			fieldValue.put("CheckMacValue", CheckMacValue);
		}
		Set<String> key = fieldValue.keySet();
		String[] name = key.toArray(new String[key.size()]);
		builder.append("<form id=\"postForm\" action=\""+url+"\" method=\"post\">");
		for(int i = 0; i < name.length; i++)
			builder.append("<input type=\"hidden\" name=\""+name[i]+"\" value=\""+fieldValue.get(name[i])+"\">");
		builder.append("<script language=\"JavaScript\">");
		builder.append("postForm.submit()");
		builder.append("</script>");
		builder.append("</form>");
		return builder.toString();
	}
}
