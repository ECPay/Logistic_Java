package ecpay.logistics.integration.domain;

/**
 * 產生 B2C 測標資料物件
 * @author mark.chiu
 *
 */
public class CreateTestDataObj {
	
	/**
	 * MerchantID
	 * 廠商編號
	 */
	private String MerchantID = "";
	
	/**
	 * ClientReplyURL
	 * Client 端回覆網址
	 */
	private String ClientReplyURL = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號
	 */
	private String PlatformID = "";
	
	/**
	 * LogisticsSubType
	 * 物流子類型
	 */
	private String LogisticsSubType = "";
	
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
	 * 取得ClientReplyURL Client 端回覆網址 此參數不為空時，當物流訂單建立後會將頁面導至此 URL。 
	 * @return ClientReplyURL
	 */
	public String getClientReplyURL() {
		return ClientReplyURL;
	}
	/**
	 * 設定ClientReplyURL Client 端回覆網址 此參數不為空時，當物流訂單建立後會將頁面導至此 URL。 
	 * @param clientReplyURL
	 */
	public void setClientReplyURL(String clientReplyURL) {
		ClientReplyURL = clientReplyURL;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID 請帶賣家所綁定的MerchantID。
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號 由綠界科技提供，此參數為專案合作的 平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID 請帶賣家所綁定的MerchantID。
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * 取得LogisticsSubType 物流子類型
	 * ---B2C--- 
	 * FAMI：全家
	 * UNIMART：統一超商
	 * HILIFE：萊爾富
	 * @return LogisticsSubType
	 */
	public String getLogisticsSubType() {
		return LogisticsSubType;
	}
	/**
	 * 設定LogisticsSubType 物流子類型
	 * ---B2C--- 
	 * FAMI：全家
	 * UNIMART：統一超商
	 * HILIFE：萊爾富
	 * @param logisticsSubType
	 */
	public void setLogisticsSubType(String logisticsSubType) {
		LogisticsSubType = logisticsSubType;
	}
	@Override
	public String toString() {
		return "CreateTestDataObj [MerchantID=" + MerchantID + ", ClientReplyURL=" + ClientReplyURL + ", PlatformID="
				+ PlatformID + ", LogisticsSubType=" + LogisticsSubType + "]";
	}
}
