package sample;

import ecpay.logistics.integration.AllInOne;
import ecpay.logistics.integration.domain.CreateCVSObj;
import ecpay.logistics.integration.domain.PrintHILIFEC2COrderInfoObj;

public class SampleCode {
	private AllInOne all;
	
	public void initial(){
		//此步驟為透過AllInOne建構子來實體化此類別，順便輸入log4j.properties的位置路徑
		//若不需要產生log檔，可直接在log4j.properties更改設定，或是將此步驟所輸入的字串改為""，或不傳任何參數
		all = new AllInOne("XXX/OOO");
	}
	
	public String sampleCreateCVS(){
		initial();
		//實體化出所需要的domain物件
		CreateCVSObj obj = new CreateCVSObj();
		//建議從後端撈取交易訂單資料，物從前端輸入以免遭竄改
		obj.setMerchantTradeNo("XXX");
		obj.setMerchantTradeDate("XXXX/XX/XX XX:XX:XX");
		
		//可以從前端使用者填入資料
		obj.setSenderName("XXX");
		obj.setSenderCellPhone("09XXXXXXXX");
		
		//以上資料不完全，僅供參考如何放入資料
		
		//呼叫AllInOne中相應的method，該method會幫忙打API並回傳回應的結果
		String result = all.create(obj);
		return result;
	}
	
	public String samplePrintHiLifeCVS(){
		initial();
		//實體化出所需要的domain物件
		PrintHILIFEC2COrderInfoObj obj = new PrintHILIFEC2COrderInfoObj();
		//建議從後端DB撈取資料填入，勿從前端輸入以免遭竄改
		obj.setAllPayLogisticsID("XXX");
		obj.setCVSPaymentNo("XXX");
		
		//呼叫AllInOne中相應的method，產生html form字串(含JavaScript Submit)之後再放入前端即可
		String html = all.printHILIFEC2COrderInfo(obj);
		return html;
	}
}
