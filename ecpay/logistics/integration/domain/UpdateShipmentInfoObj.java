package ecpay.logistics.integration.domain;

/**
 * 提供廠商修改出貨日期、取貨門市(統一超商B2C)物件
 * @author mark.chiu
 *
 */
public class UpdateShipmentInfoObj {
	
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
	 * ShipmentDate
	 * 物流訂單出貨日期
	 */
	private String ShipmentDate = "";
	
	/**
	 * ReceiverStoreID
	 * 物流訂單取貨門市
	 */
	private String ReceiverStoreID = "";
	
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
	 * 取得ShipmentDate 物流訂單出貨日期 物流訂單出貨日期、物流訂單取貨門市需擇一必填
	 * @return ShipmentDate
	 */
	public String getShipmentDate() {
		return ShipmentDate;
	}
	/**
	 * 設定ShipmentDate 物流訂單出貨日期 物流訂單出貨日期、物流訂單取貨門市需擇一必填
	 * @param shipmentDate
	 */
	public void setShipmentDate(String shipmentDate) {
		ShipmentDate = shipmentDate;
	}
	/**
	 * 取得ReceiverStoreID 物流訂單取貨門市 物流訂單出貨日期、物流訂單取貨門市需擇一必填
	 * @return ReceiverStoreID
	 */
	public String getReceiverStoreID() {
		return ReceiverStoreID;
	}
	/**
	 * 設定ReceiverStoreID 物流訂單取貨門市 物流訂單出貨日期、物流訂單取貨門市需擇一必填
	 * @param receiverStoreID
	 */
	public void setReceiverStoreID(String receiverStoreID) {
		ReceiverStoreID = receiverStoreID;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID 請帶賣家所綁定的MerchantID
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號 由綠界科技提供，此參數為專案合作的平台商使用，一般廠商介接請放空值。若為專案合作的平台商使用時，MerchantID 請帶賣家所綁定的MerchantID
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	@Override
	public String toString() {
		return "UpdateShipmentInfoObj [MerchantID=" + MerchantID + ", AllPayLogisticsID=" + AllPayLogisticsID
				+ ", ShipmentDate=" + ShipmentDate + ", ReceiverStoreID=" + ReceiverStoreID + ", PlatformID="
				+ PlatformID + "]";
	}
}
