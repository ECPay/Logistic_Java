package ecpay.logistics.integration.domain;

/**
 * 電子地圖串接物件
 * @author mark.chiu
 *
 */
public class ExpressMapObj {
	
	/**
	 * MerchantID
	 * 廠商編號
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * 廠商交易編號
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * LogisticsType
	 * 物流類型
	 */
	private String LogisticsType = "CVS";
	
	/**
	 * LogisticsSubType
	 * 物流子類型
	 */
	private String LogisticsSubType = "";
	
	/**
	 * IsCollection
	 * 是否代收貨款
	 */
	private String IsCollection = "";
	
	/**
	 * ServerReplyURL
	 * Server 端回覆網址
	 */
	private String ServerReplyURL = "";
	
	/**
	 * ExtraData
	 * 額外資訊
	 */
	private String ExtraData = "";
	
	/**
	 * Device
	 * 使用設備
	 */
	private String Device = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 廠商編號，由綠界科技提供
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 廠商編號，由綠界科技提供
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得MerchantTradeNo 廠商交易編號 1. 廠商交易編號均為唯一值，不可重複使用。 2. 英數字大小寫混合。
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 設定MerchantTradeNo 廠商交易編號 1. 廠商交易編號均為唯一值，不可重複使用。 2. 英數字大小寫混合。
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * 取得LogisticsType 物流類型 
	 * @return LogisticsType
	 */
	public String getLogisticsType() {
		return LogisticsType;
	}
//	public void setLogisticsType(String logisticsType) {
//		LogisticsType = logisticsType;
//	}
	/**
	 * 取得LogisticsSubType 物流子類型
	 * ---B2C---
	 * FAMI：全家 
	 * UNIMART：統一超商 
	 * HILIFE：萊爾富
	 * ---C2C---
	 * FAMIC2C：全家店到店 
	 * UNIMARTC2C：統一超商交貨便
	 * HILIFEC2C:萊爾富店到店
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
	 * ---C2C---
	 * FAMIC2C：全家店到店 
	 * UNIMARTC2C：統一超商交貨便
	 * HILIFEC2C:萊爾富店到店
	 * @param logisticsSubType
	 */
	public void setLogisticsSubType(String logisticsSubType) {
		LogisticsSubType = logisticsSubType;
	}
	/**
	 * 取得IsCollection 是否代收貨款  N：不代收貨款。 Y：代收貨款。
	 * @return IsCollection
	 */
	public String getIsCollection() {
		return IsCollection;
	}
	/**
	 * 設定IsCollection 是否代收貨款  N：不代收貨款。 Y：代收貨款。
	 * @param isCollection
	 */
	public void setIsCollection(String isCollection) {
		IsCollection = isCollection;
	}
	/**
	 * 取得ServerReplyURL Server 端回覆網址 取得超商店鋪代號等資訊後，會回傳到此網址。
	 * @return ServerReplyURL
	 */
	public String getServerReplyURL() {
		return ServerReplyURL;
	}
	/**
	 * 設定ServerReplyURL 端回覆網址 取得超商店鋪代號等資訊後，會回傳到此網址。
	 * @param serverReplyURL
	 */
	public void setServerReplyURL(String serverReplyURL) {
		ServerReplyURL = serverReplyURL;
	}
	/**
	 * 取得ExtraData 額外資訊 供廠商傳遞保留的資訊，在回傳參數中，會原值回傳
	 * @return ExtraData
	 */
	public String getExtraData() {
		return ExtraData;
	}
	/**
	 * 設定ExtraData 額外資訊 供廠商傳遞保留的資訊，在回傳參數中，會原值回傳
	 * @param extraData
	 */
	public void setExtraData(String extraData) {
		ExtraData = extraData;
	}
	/**
	 * 取得Device 使用設備 0：PC（預設值） 1：Mobile
	 * @return Device
	 */
	public String getDevice() {
		return Device;
	}
	/**
	 * 設定Device 使用設備 0：PC（預設值） 1：Mobile
	 * @param device
	 */
	public void setDevice(String device) {
		Device = device;
	}
	@Override
	public String toString() {
		return "ExpressMapObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", LogisticsType="
				+ LogisticsType + ", LogisticsSubType=" + LogisticsSubType + ", IsCollection=" + IsCollection
				+ ", ServerReplyURL=" + ServerReplyURL + ", ExtraData=" + ExtraData + ", Device=" + Device + "]";
	}
}
