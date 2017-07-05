package ecpay.logistics.integration.domain;

/**
 * 列印繳款單(統一超商 C2C)物件
 * @author mark.chiu
 *
 */
public class PrintUniMartC2COrderInfoObj {
	
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
	 * 取得CVSPaymentNo 寄貨編號 若為統一超商時，寄貨編號為廠商管理後台-物流管理中對應欄位為「交貨便代碼/店到店編號」減去後四碼。例如：G65445297175，統一超商正確寄貨編號為 G6544529。
	 * @return CVSPaymentNo
	 */
	public String getCVSPaymentNo() {
		return CVSPaymentNo;
	}
	/**
	 * 設定CVSPaymentNo 寄貨編號 若為統一超商時，寄貨編號為廠商管理後台-物流管理中對應欄位為「交貨便代碼/店到店編號」減去後四碼。例如：G65445297175，統一超商正確寄貨編號為 G6544529。
	 * @param cVSPaymentNo
	 */
	public void setCVSPaymentNo(String cVSPaymentNo) {
		CVSPaymentNo = cVSPaymentNo;
	}
	/**
	 * 取得CVSValidationNo 驗證碼 若為統一超商時，為廠商管理後台-物流管理中對應欄位為「交貨便代碼/店到店編號」後四碼。例如：G65445297175，統一超商正確驗證碼號為 7175。
	 * @return CVSValidationNo
	 */
	public String getCVSValidationNo() {
		return CVSValidationNo;
	}
	/**
	 * 設定CVSValidationNo 驗證碼 若為統一超商時，為廠商管理後台-物流管理中對應欄位為「交貨便代碼/店到店編號」後四碼。例如：G65445297175，統一超商正確驗證碼號為 7175。
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
		return "PrintUniMartC2COrderInfoObj [MerchantID=" + MerchantID + ", AllPayLogisticsID=" + AllPayLogisticsID
				+ ", CVSPaymentNo=" + CVSPaymentNo + ", CVSValidationNo=" + CVSValidationNo + ", PlatformID="
				+ PlatformID + "]";
	}
}
