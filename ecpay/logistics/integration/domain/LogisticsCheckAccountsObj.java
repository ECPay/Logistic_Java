package ecpay.logistics.integration.domain;

/**
 * 全家逆物流核帳(全家超商B2C)物件
 * @author mark.chiu
 *
 */
public class LogisticsCheckAccountsObj {
	
	/**
	 * MerchantID
	 * 廠商編號
	 */
	private String MerchantID = "";
	
	/**
	 * RtnMerchantTradeNo
	 * 物流退貨訂單編號
	 */
	private String RtnMerchantTradeNo = "";
	
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
	 * 取得RtnMerchantTradeNo 物流退貨訂單編號
	 * @return RtnMerchantTradeNo
	 */
	public String getRtnMerchantTradeNo() {
		return RtnMerchantTradeNo;
	}
	/**
	 * 設定RtnMerchantTradeNo 物流退貨訂單編號
	 * @param rtnMerchantTradeNo
	 */
	public void setRtnMerchantTradeNo(String rtnMerchantTradeNo) {
		RtnMerchantTradeNo = rtnMerchantTradeNo;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID 請帶賣家所綁定的MerchantID。
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID 請帶賣家所綁定的MerchantID。
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	@Override
	public String toString() {
		return "LogisticsCheckAccountsObj [MerchantID=" + MerchantID + ", RtnMerchantTradeNo=" + RtnMerchantTradeNo
				+ ", PlatformID=" + PlatformID + "]";
	}
}
