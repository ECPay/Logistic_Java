package ecpay.logistics.integration.domain;

/**
 * 產生托運單(宅配)/一段標(超商取貨)格式(B2C)物件
 * @author mark.chiu
 *
 */
public class PrintTradeDocumentObj {
	
	/**
	 * MerchantID
	 *  廠商編號
	 */
	private String MerchantID = "";
	
	/**
	 * AllPayLogisticsID
	 * 綠界科技的 物流交易編號
	 */
	private String AllPayLogisticsID = "";
	
	/**
	 * PlatformID
	 * 特約合作平 台商代號 
	 */
	private String PlatformID = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 廠商編號 由綠界科技提供
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 廠商編號 由綠界科技提供
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得AllPayLogisticsID 綠界科技的 物流交易編號
	 * 1. 可支援列印單筆托運單/一段標及 (B2C)批次列印多筆一段標。
	 * 2. 宅配不支援批次列印多筆託運單/一段標。
	 * 3. 若為批次列印多筆一段標(B2C)，須以(,)半型逗號加以分隔。例如：10011,10012
	 * 註: 萊爾富一段標不可與其他超商一段標混合列印使用。
	 * @return AllPayLogisticsID
	 */
	public String getAllPayLogisticsID() {
		return AllPayLogisticsID;
	}
	/**
	 * 設定AllPayLogisticsID 綠界科技的 物流交易編號
	 * 1. 可支援列印單筆托運單/一段標及 (B2C)批次列印多筆一段標。
	 * 2. 宅配不支援批次列印多筆託運單/一段標。
	 * 3. 若為批次列印多筆一段標(B2C)，須以(,)半型逗號加以分隔。例如：10011,10012
	 * 註: 萊爾富一段標不可與其他超商一段標混合列印使用。
	 * @param allPayLogisticsID
	 */
	public void setAllPayLogisticsID(String allPayLogisticsID) {
		AllPayLogisticsID = allPayLogisticsID;
	}
	/**
	 * 取得PlatformID 特約合作平 台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID請帶賣家所綁定的 MerchantID。
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平 台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID請帶賣家所綁定的 MerchantID。
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	@Override
	public String toString() {
		return "PrintTradeDocumentObj [MerchantID=" + MerchantID + ", AllPayLogisticsID=" + AllPayLogisticsID
				+ ", PlatformID=" + PlatformID + "]";
	}
}
