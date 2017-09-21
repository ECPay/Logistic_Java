package ecpay.logistics.integration.domain;

/**
 * 取消訂單(統一超商C2C)物件
 * @author mark.chiu
 *
 */
public class CancelC2COrderObj {
	
	/**
	 * MerchantID
	 * 廠商編號
	 */
	private String MerchantID = "";
	
	/**
	 * AllPayLogisticsID
	 * 物流交易編號
	 */
	private String AllPayLogisticsID = "";
	
	/**
	 * CVSPaymentNo
	 * 寄貨編號
	 */
	private String CVSPaymentNo = "";
	
	/**
	 * CVSValidationNo
	 * 驗證碼
	 */
	private String CVSValidationNo = "";
	
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
	 * 取得AllPayLogisticsID 物流交易編號
	 * @return AllPayLogisticsID
	 */
	public String getAllPayLogisticsID() {
		return AllPayLogisticsID;
	}
	/**
	 * 設定AllPayLogisticsID 物流交易編號
	 * @param allPayLogisticsID
	 */
	public void setAllPayLogisticsID(String allPayLogisticsID) {
		AllPayLogisticsID = allPayLogisticsID;
	}
	/**
	 * 取得CVSPaymentNo 寄貨編號
	 * @return CVSPaymentNo
	 */
	public String getCVSPaymentNo() {
		return CVSPaymentNo;
	}
	/**
	 * 設定CVSPaymentNo 寄貨編號
	 * @param cVSPaymentNo
	 */
	public void setCVSPaymentNo(String cVSPaymentNo) {
		CVSPaymentNo = cVSPaymentNo;
	}
	/**
	 * 取得CVSValidationNo 驗證碼
	 * @return CVSValidationNo
	 */
	public String getCVSValidationNo() {
		return CVSValidationNo;
	}
	/**
	 * 設定CVSValidationNo 驗證碼
	 * @param cVSValidationNo
	 */
	public void setCVSValidationNo(String cVSValidationNo) {
		CVSValidationNo = cVSValidationNo;
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
		return "CancelC2COrderObj [MerchantID=" + MerchantID + ", AllPayLogisticsID=" + AllPayLogisticsID
				+ ", CVSPaymentNo=" + CVSPaymentNo + ", CVSValidationNo=" + CVSValidationNo + ", PlatformID="
				+ PlatformID + "]";
	}
}
