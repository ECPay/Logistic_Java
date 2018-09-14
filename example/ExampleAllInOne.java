package example;

import java.util.Hashtable;

import ecpay.logistics.integration.AllInOne;
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

public class ExampleAllInOne {
	public static AllInOne all;
	public static void main(String[] args){
		initial();
//		System.out.println("compare CheckMacValue method testing result: "+cmprChkMacValue());
//		System.out.println("expressMap: "+postExpressMap());
		System.out.println("createCVS: "+postCreateCVS());
//		System.out.println("createHome: "+postCreateHome());
//		System.out.println("returnHome: "+postReturnHome());
//		System.out.println("returnCVS: "+postReturnCVS());
//		System.out.println("logisticsCheckAccounts: "+postLogisticsCheckAccount());
//		System.out.println("returnHiLifeCVS: "+postReturnHiLifeCVS());
//		System.out.println("returnUniMartCVS: "+postReturnUniMartCVS());
//		System.out.println("updateShipmentInfo: "+postUpdateShipmentInfo());
//		System.out.println("updateStoreInfo: "+postUpdateStoreInfor());
//		System.out.println("cancelC2COrder: "+postCancelC2COrder());
//		System.out.println("queryLogisticsTradeInfo: "+postQueryLogisticsTradeInfo());
//		System.out.println("printTradeDocument: "+postPrintTradeDocument());
//		System.out.println("printUniMartC2COrderInfo: "+postPrintUniMartC2COrderInfo());
//		System.out.println("printFAMIC2COrderInfo: "+postPrintFAMIC2COrderInfo());
//		System.out.println("printHILIFEC2COrder: "+postPrintHILIFEC2COrderInfo());
//		System.out.println("createTestData: "+postCreateTestData());
	}
	
	private static void initial(){
		all = new AllInOne();
	}
	
	public static boolean cmprChkMacValue(){
		Hashtable<String, String> dict = new Hashtable<String, String>();
		dict.put("MerchantID", "2000132");
		dict.put("CheckMacValue", "50BE3989953C1734E32DD18EB23698241E035F9CBCAC74371CCCF09E0E15BD61");
		return all.compareCheckMacValue(dict);
	}
	
	public static String postExpressMap(){
		ExpressMapObj obj = new ExpressMapObj();
		obj.setLogisticsSubType("FAMI");
		obj.setIsCollection("N");
		obj.setServerReplyURL("https://www.yahoo.com.tw");
		return all.expressMap(obj);
	}
	
	public static String postCreateCVS(){
		CreateCVSObj obj = new CreateCVSObj();
		obj.setMerchantTradeNo("");
		obj.setMerchantTradeDate("2018/03/09 05:05:05");
		obj.setLogisticsSubType("UNIMART");
		obj.setGoodsAmount("20000");
		obj.setGoodsName("asd");
		obj.setSenderName("ด๚ธี");
		obj.setReceiverName("Ying");
		obj.setReceiverCellPhone("0911429215");
		obj.setServerReplyURL("https://www.yahoo.com.tw");
		obj.setReceiverStoreID("991182");
		return all.create(obj);
	}
	
	public static String postCreateHome(){
		CreateHomeObj obj = new CreateHomeObj();
		obj.setMerchantTradeNo("TestCreateHome");
		obj.setMerchantTradeDate("2017/04/04 04:04:04");
		obj.setLogisticsSubType("TCAT");
		obj.setGoodsAmount("5000");
		obj.setSenderName("Mark");
		obj.setSenderCellPhone("0911429215");
		obj.setReceiverName("Ying");
		obj.setReceiverCellPhone("0911842495");
		obj.setServerReplyURL("https://www.yahoo.com.tw");
		obj.setSenderZipCode("106");
		obj.setSenderAddress("hahahahaha");
		obj.setReceiverZipCode("220");
		obj.setReceiverAddress("hahahahaha");
		obj.setTemperature("0002");
		obj.setDistance("00");
		obj.setSpecification("0001");
		obj.setScheduledPickupTime("1");
		obj.setScheduledDeliveryTime("1");
		return all.create(obj);
	}
	
	public static String postReturnHome(){
		ReturnHomeObj obj = new ReturnHomeObj();
		obj.setLogisticsSubType("TCAT");
		obj.setServerReplyURL("https://www.yahoo.com.tw");
		obj.setSenderName("Mark");
		obj.setSenderZipCode("106");
		obj.setSenderAddress("hahahahaha");
		obj.setSenderCellPhone("0911429215");
		obj.setReceiverName("Ying");
		obj.setReceiverZipCode("104");
		obj.setReceiverAddress("hahahaha");
		obj.setReceiverCellPhone("0911842495");
		obj.setGoodsAmount("5000");
		obj.setTemperature("0002");
		obj.setDistance("00");
		obj.setSpecification("0001");
		obj.setScheduledPickupTime("1");
		obj.setScheduledDeliveryTime("1");
		obj.setPackageCount("1");
		return all.returnHome(obj);
	}
	
	public static String postReturnCVS(){
		ReturnCVSObj obj = new ReturnCVSObj();
		obj.setAllPayLogisticsID("10035");
		obj.setServerReplyURL("https://www.yahoo.com.tw");
		obj.setGoodsAmount("5000");
		obj.setSenderName("Mark");
		return all.returnCVS(obj);
	}
	
	public static String postLogisticsCheckAccount(){
		LogisticsCheckAccountsObj obj = new LogisticsCheckAccountsObj();
		obj.setRtnMerchantTradeNo("1706271531582");
		return all.logisticsCheckAccounts(obj);
	}
	
	public static String postReturnHiLifeCVS(){
		ReturnHiLifeCVSObj obj = new ReturnHiLifeCVSObj();
		obj.setAllPayLogisticsID("10035");
		obj.setServerReplyURL("https://www.yahoo.com.tw");
		obj.setGoodsAmount("1000");
		obj.setSenderName("Mark");
		obj.setSenderPhone("0911429215");
		return all.returnHiLifeCVS(obj);
	}
	
	public static String postReturnUniMartCVS(){
		ReturnUniMartCVSObj obj = new ReturnUniMartCVSObj();
		obj.setAllPayLogisticsID("");
		obj.setServerReplyURL("https://www.yahoo.com.tw");
		obj.setGoodsAmount("100");
		obj.setSenderName("Mark");
		return all.returnUniMartCVS(obj);
	}
	
	public static String postUpdateShipmentInfo(){
		UpdateShipmentInfoObj obj = new UpdateShipmentInfoObj();
		obj.setAllPayLogisticsID("10035");
		obj.setReceiverStoreID("991182");
		return all.updateShipmentInfo(obj);
	}
	
	public static String postUpdateStoreInfor(){
		UpdateStoreInfoObj obj = new UpdateStoreInfoObj();
		obj.setAllPayLogisticsID("49050");
		obj.setCVSPaymentNo("G6551191");
		obj.setCVSValidationNo("4718");
		obj.setReceiverStoreID("870766");
		obj.setStoreType("01");
		return all.updateStoreInfo(obj);
	}
	
	public static String postCancelC2COrder(){
		CancelC2COrderObj obj = new CancelC2COrderObj();
		obj.setAllPayLogisticsID("49051");
		obj.setCVSPaymentNo("G6551192");
		obj.setCVSValidationNo("2029");
		return all.cancelC2COrder(obj);
	}
	
	public static String postQueryLogisticsTradeInfo(){
		QueryLogisticsTradeInfoObj obj = new QueryLogisticsTradeInfoObj();
		obj.setAllPayLogisticsID("49051");
		return all.queryLogisticsTradeInfo(obj);
	}
	
	public static String postPrintTradeDocument(){
		PrintTradeDocumentObj obj = new PrintTradeDocumentObj();
		obj.setAllPayLogisticsID("49051");
		return all.printTradeDocument(obj);
	}
	
	public static String postPrintUniMartC2COrderInfo(){
		PrintUniMartC2COrderInfoObj obj = new PrintUniMartC2COrderInfoObj();
		obj.setAllPayLogisticsID("49053");
		obj.setCVSPaymentNo("G6551193");
		obj.setCVSValidationNo("2073");
		return all.printUniMartC2COrderInfo(obj);
	}
	
	public static String postPrintFAMIC2COrderInfo(){
		PrintFAMIC2COrderInfoObj obj = new PrintFAMIC2COrderInfoObj();
		obj.setAllPayLogisticsID("49054");
		obj.setCVSPaymentNo("07903971454");
		return all.printFAMIC2COrderInfo(obj);
	}
	
	public static String postPrintHILIFEC2COrderInfo(){
		PrintHILIFEC2COrderInfoObj obj = new PrintHILIFEC2COrderInfoObj();
		obj.setAllPayLogisticsID("49066");
		obj.setCVSPaymentNo("76RE05280526");
		return all.printHILIFEC2COrderInfo(obj);
	}
	
	public static String postCreateTestData(){
		CreateTestDataObj obj = new CreateTestDataObj();
		obj.setLogisticsSubType("FAMI");
		return all.createTestData(obj);
	}
}
