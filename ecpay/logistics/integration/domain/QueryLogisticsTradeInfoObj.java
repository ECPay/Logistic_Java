package ecpay.logistics.integration.domain;

/**
 * 物流訂單查詢物件
 * @author mark.chiu
 *
 */
public class QueryLogisticsTradeInfoObj {
	
	/**
	 * MerchantID
	 * 廠商編號
	 */
	private String MerchantID = "";
	
	/**
	 * AllPayLogisticsID
	 * 綠界科技的物流交易編號
	 */
	private String AllPayLogisticsID = "";
	
	/**
	 * TimeStamp
	 * 驗證時間
	 */
	private String TimeStamp = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號
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
	 * 取得AllPayLogisticsID 綠界科技的物流交易編號
	 * @return AllPayLogisticsID
	 */
	public String getAllPayLogisticsID() {
		return AllPayLogisticsID;
	}
	/**
	 * 設定AllPayLogisticsID 綠界科技的物流交易編號
	 * @param allPayLogisticsID
	 */
	public void setAllPayLogisticsID(String allPayLogisticsID) {
		AllPayLogisticsID = allPayLogisticsID;
	}
	/**
	 * 取得TimeStamp 驗證時間 將當下的時間轉為 UnixTimeStamp 用於驗證此次介接的時間區間。綠界科技驗證時間區間暫訂為 3 分鐘內有效，超過則此次介接無效。
	 * @return TimeStamp
	 */
	public String getTimeStamp() {
		return TimeStamp;
	}
	/**
	 * 設定TimeStamp 驗證時間 將當下的時間轉為 UnixTimeStamp 用於驗證此次介接的時間區間。綠界科技驗證時間區間暫訂為 3 分鐘內有效，超過則此次介接無效。
	 * @param timeStamp
	 */
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	/**
	 * 取得getPlatformID 特約合作平台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID 請帶賣家所綁定的MerchantID。
	 * @return getPlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定getPlatformID 特約合作平台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID 請帶賣家所綁定的MerchantID。
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	@Override
	public String toString() {
		return "QueryLogisticsTradeInfoObj [MerchantID=" + MerchantID + ", AllPayLogisticsID=" + AllPayLogisticsID
				+ ", TimeStamp=" + TimeStamp + ", PlatformID=" + PlatformID + "]";
	}
}
