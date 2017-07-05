package sample;

import ecpay.logistics.integration.AllInOne;
import ecpay.logistics.integration.domain.CreateCVSObj;
import ecpay.logistics.integration.domain.PrintHILIFEC2COrderInfoObj;

public class SampleCode {
	private AllInOne all;
	
	public void initial(){
		//���B�J���z�LAllInOne�غc�l�ӹ���Ʀ����O�A���K��Jlog4j.properties����m���|
		//�Y���ݭn����log�ɡA�i�����blog4j.properties���]�w�A�άO�N���B�J�ҿ�J���r��אּ""�A�Τ��ǥ���Ѽ�
		all = new AllInOne("XXX/OOO");
	}
	
	public String sampleCreateCVS(){
		initial();
		//����ƥX�һݭn��domain����
		CreateCVSObj obj = new CreateCVSObj();
		//��ĳ�q��ݼ�������q���ơA���q�e�ݿ�J�H�K�D«��
		obj.setMerchantTradeNo("XXX");
		obj.setMerchantTradeDate("XXXX/XX/XX XX:XX:XX");
		
		//�i�H�q�e�ݨϥΪ̶�J���
		obj.setSenderName("XXX");
		obj.setSenderCellPhone("09XXXXXXXX");
		
		//�H�W��Ƥ������A�ȨѰѦҦp���J���
		
		//�I�sAllInOne��������method�A��method�|������API�æ^�Ǧ^�������G
		String result = all.create(obj);
		return result;
	}
	
	public String samplePrintHiLifeCVS(){
		initial();
		//����ƥX�һݭn��domain����
		PrintHILIFEC2COrderInfoObj obj = new PrintHILIFEC2COrderInfoObj();
		//��ĳ�q���DB������ƶ�J�A�űq�e�ݿ�J�H�K�D«��
		obj.setAllPayLogisticsID("XXX");
		obj.setCVSPaymentNo("XXX");
		
		//�I�sAllInOne��������method�A����html form�r��(�tJavaScript Submit)����A��J�e�ݧY�i
		String html = all.printHILIFEC2COrderInfo(obj);
		return html;
	}
}
