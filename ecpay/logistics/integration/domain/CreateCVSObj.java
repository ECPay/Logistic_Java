package ecpay.logistics.integration.domain;

/**
 * CVS超商取貨物流訂單產生物件
 * @author mark.chiu
 *
 */
public class CreateCVSObj {
	
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
	 * MerchantTradeDate
	 * 廠商交易時間
	 */
	private String MerchantTradeDate = "";
	
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
	 * GoodsAmount
	 * 商品金額
	 */
	private String GoodsAmount = "";
	
	/**
	 * CollectionAmount
	 * 代收金額
	 */
	private String CollectionAmount = "";
	
	/**
	 * IsCollection
	 * 是否代收貨款
	 */
	private String IsCollection = "";
	
	/**
	 * GoodsName
	 * 商品名稱
	 */
	private String GoodsName = "";
	
	/**
	 * SenderName
	 * 寄件人姓名
	 */
	private String SenderName = "";
	
	/**
	 * SenderPhone
	 * 寄件人電話
	 */
	private String SenderPhone = "";
	
	/**
	 * SenderCellPhone
	 * 寄件人手機
	 */
	private String SenderCellPhone = "";
	
	/**
	 * ReceiverName
	 * 收件人姓名
	 */
	private String ReceiverName = "";
	
	/**
	 * ReceiverPhone
	 * 收件人電話
	 */
	private String ReceiverPhone = "";
	
	/**
	 * ReceiverCellPhone
	 *  收件人手機
	 */
	private String ReceiverCellPhone = "";
	
	/**
	 * ReceiverEmail
	 * 收件人 email
	 */
	private String ReceiverEmail = "";
	
	/**
	 * TradeDesc
	 * 交易描述
	 */
	private String TradeDesc = "";
	
	/**
	 * ServerReplyURL
	 * Server 端回覆網址
	 */
	private String ServerReplyURL = "";
	
	/**
	 * ClientReplyURL
	 * Client 端回覆網址
	 */
	private String ClientReplyURL = "";
	
	/**
	 * LogisticsC2CReplyURL
	 * Server 端物流回傳網址
	 */
	private String LogisticsC2CReplyURL = "";
	
	/**
	 * Remark
	 * 備註
	 */
	private String Remark = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號
	 */
	private String PlatformID = "";
	
	/**
	 * ReceiverStoreID
	 * 收件人門市代號
	 */
	private String ReceiverStoreID = "";
	
	/**
	 * ReturnStoreID
	 * 退貨門市代號 
	 */
	private String ReturnStoreID = "";
	
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
	 * 取得MerchantTradeNo 廠商交易編號 1.廠商交易編號均為唯一值，不可重複使用(英數字大小寫混和) 2.廠商交易編號可為空，系統會自動產生一組廠商訂單編號。 
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 設定MerchantTradeNo 廠商交易編號 1.廠商交易編號均為唯一值，不可重複使用(英數字大小寫混和) 2.廠商交易編號可為空，系統會自動產生一組廠商訂單編號。 
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * 取得MerchantTradeDate 廠商交易時間 格式為：yyyy/MM/dd HH:mm:ss
	 * @return MerchantTradeDate
	 */
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}
	/**
	 * 設定MerchantTradeDate 廠商交易時間 格式為：yyyy/MM/dd HH:mm:ss
	 * @param merchantTradeDate
	 */
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}
	/**
	 * 取得LogisticsType 物流類型 CVS:超商取貨  Home:宅配 
	 * @return LogisticsType
	 */
	public String getLogisticsType() {
		return LogisticsType;
	}
//	/**
//	 * 設定LogisticsType 物流類型 CVS:超商取貨  Home:宅配 
//	 * @param logisticsType
//	 */
//	public void setLogisticsType(String logisticsType) {
//		LogisticsType = logisticsType;
//	}
	/**
	 * 取得LogisticsSubType 物流子類型
	 * ---B2C---
	 * FAMI:全家 
	 * UNIMART:統一超商
	 * HILIFE:萊爾富
	 * ---C2C---
	 * FAMIC2C:全家店到店 
	 * UNIMARTC2C:統一超商交貨便 HILIFEC2C:萊爾富店到店
	 * ---HOME---
	 * TCAT:黑貓 
	 * ECAN:宅配通 
	 * @return LogisticsSubType
	 */
	public String getLogisticsSubType() {
		return LogisticsSubType;
	}
	/**
	 * 設定LogisticsSubType 物流子類型
	 * ---B2C---
	 * FAMI:全家 
	 * UNIMART:統一超商
	 * HILIFE:萊爾富
	 * ---C2C---
	 * FAMIC2C:全家店到店 
	 * UNIMARTC2C:統一超商交貨便 HILIFEC2C:萊爾富店到店
	 * ---HOME---
	 * TCAT:黑貓 
	 * ECAN:宅配通 
	 * @param logisticsSubType
	 */
	public void setLogisticsSubType(String logisticsSubType) {
		LogisticsSubType = logisticsSubType;
	}
	/**
	 * 取得GoodsAmount 商品金額 
	 * @return GoodsAmount
	 */
	public String getGoodsAmount() {
		return GoodsAmount;
	}
	/**
	 * 設定GoodsAmount 商品金額 
	 * @param goodsAmount
	 */
	public void setGoodsAmount(String goodsAmount) {
		GoodsAmount = goodsAmount;
	}
	/**
	 * 取得CollectionAmount 代收金額 物流子類型為 UNIMARTC2C(統一超商交貨便)時，代收金額需要與商品金額一致。
	 * @return CollectionAmount
	 */
	public String getCollectionAmount() {
		return CollectionAmount;
	}
	/**
	 * 設定CollectionAmount 代收金額 物流子類型為 UNIMARTC2C(統一超商交貨便)時，代收金額需要與商品金額一致。
	 * @param collectionAmount
	 */
	public void setCollectionAmount(String collectionAmount) {
		CollectionAmount = collectionAmount;
	}
	/**
	 * 取得IsCollection 是否代收貨款 N:不代收貨款，為預設值。 Y:代收貨款，則代收貨款金額為商品金額。 
	 * @return IsCollection
	 */
	public String getIsCollection() {
		return IsCollection;
	}
	/**
	 * 設定IsCollection 是否代收貨款 N:不代收貨款，為預設值。 Y:代收貨款，則代收貨款金額為商品金額。 
	 * @param isCollection
	 */
	public void setIsCollection(String isCollection) {
		IsCollection = isCollection;
	}
	/**
	 * 取得GoodsName 商品名稱
	 * ---B2C--- 
	 * FAMI：全家(可為空)
	 * UNIMART：統一超商(可為空)
	 * HILIFE：萊爾富(可為空)
	 * ---C2C---
	 * FAMIC2C：全家店到店(可為空)
	 * UNIMARTC2C：統一超商交貨便(不可為空)
	 * HILIFEC2C：萊爾富店到店(不可為空)
	 * ---HOME---
	 * 黑貓(可為空) 
	 * @return GoodsName
	 */
	public String getGoodsName() {
		return GoodsName;
	}
	/**
	 * 設定GoodsName 商品名稱
	 * ---B2C--- 
	 * FAMI：全家(可為空)
	 * UNIMART：統一超商(可為空)
	 * HILIFE：萊爾富(可為空)
	 * ---C2C---
	 * FAMIC2C：全家店到店(可為空)
	 * UNIMARTC2C：統一超商交貨便(不可為空)
	 * HILIFEC2C：萊爾富店到店(不可為空)
	 * ---HOME---
	 * 黑貓(可為空)
	 * @param goodsName
	 */
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	/**
	 * 取得SenderName 寄件人姓名 1. 字元限制為 10 個字元(最多 5 個中文字、10 個英文字)、不可有空白，若帶有空白系統自動去除。 2. C2C 店到店未取退回原寄件門市，須出示身分證件領取，請勿填寫公司名稱，避免無法領取退件。
	 * @return SenderName
	 */
	public String getSenderName() {
		return SenderName;
	}
	/**
	 * 設定SenderName 寄件人姓名 1. 字元限制為 10 個字元(最多 5 個中文字、10 個英文字)、不可有空白，若帶有空白系統自動去除。 2. C2C 店到店未取退回原寄件門市，須出示身分證件領取，請勿填寫公司名稱，避免無法領取退件。
	 * @param senderName
	 */
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	/**
	 * 取得SenderPhone 寄件人電話 若為宅配，則與手機擇一不可為空
	 * @return SenderPhone
	 */
	public String getSenderPhone() {
		return SenderPhone;
	}
	/**
	 * 設定SenderPhone 寄件人電話 若為宅配，則與手機擇一不可為空
	 * @param senderPhone
	 */
	public void setSenderPhone(String senderPhone) {
		SenderPhone = senderPhone;
	}
	/**
	 * 取得SenderCellPhone 寄件人手機 物流子類型 UNIMARTC2C(統一超商交貨便) 、HILIFEC2C(萊爾富店到店)時不可為空 
	 * @return SenderCellPhone
	 */
	public String getSenderCellPhone() {
		return SenderCellPhone;
	}
	/**
	 * 設定SenderCellPhone 寄件人手機 物流子類型 UNIMARTC2C(統一超商交貨便) 、HILIFEC2C(萊爾富店到店)時不可為
	 * @param senderCellPhone
	 */
	public void setSenderCellPhone(String senderCellPhone) {
		SenderCellPhone = senderCellPhone;
	}
	/**
	 * 取得ReceiverName 收件人姓名 字元限制為 10 個字元(最多 5 個中文字、10 個英文字)、不可有空白，若帶有空白系統自動去除。
	 * @return ReceiverName
	 */
	public String getReceiverName() {
		return ReceiverName;
	}
	/**
	 * 設定ReceiverName 收件人姓名 字元限制為 10 個字元(最多 5 個中文字、10 個英文字)、不可有空白，若帶有空白系統自動去除。
	 * @param receiverName
	 */
	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}
	/**
	 * 取得ReceiverPhone 收件人電話 若為宅配時，則與手機擇一不可為空
	 * @return ReceiverPhone
	 */
	public String getReceiverPhone() {
		return ReceiverPhone;
	}
	/**
	 * 設定ReceiverPhone 收件人電話 若為宅配時，則與手機擇一不可為空
	 * @param receiverPhone
	 */
	public void setReceiverPhone(String receiverPhone) {
		ReceiverPhone = receiverPhone;
	}
	/**
	 * 取得ReceiverCellPhone 收件人手機 物流子類型 UNIMART、FAMI、HILIFE 時不可為空UNIMARTC2C、HILIFEC2C 時不可為空。
	 * @return ReceiverCellPhone
	 */
	public String getReceiverCellPhone() {
		return ReceiverCellPhone;
	}
	/**
	 * 設定ReceiverCellPhone 收件人手機 物流子類型 UNIMART、FAMI、HILIFE 時不可為空UNIMARTC2C、HILIFEC2C 時不可為空。
	 * @param receiverCellPhone
	 */
	public void setReceiverCellPhone(String receiverCellPhone) {
		ReceiverCellPhone = receiverCellPhone;
	}
	/**
	 * 取得ReceiverEmail 收件人 email
	 * @return ReceiverEmail
	 */
	public String getReceiverEmail() {
		return ReceiverEmail;
	}
	/**
	 * 設定ReceiverEmail 收件人 email
	 * @param receiverEmail
	 */
	public void setReceiverEmail(String receiverEmail) {
		ReceiverEmail = receiverEmail;
	}
	/**
	 * 取得TradeDesc 交易描述
	 * @return TradeDesc
	 */
	public String getTradeDesc() {
		return TradeDesc;
	}
	/**
	 * 設定TradeDesc 交易描述
	 * @param tradeDesc
	 */
	public void setTradeDesc(String tradeDesc) {
		TradeDesc = tradeDesc;
	}
	/**
	 * 取得ServerReplyURL Server 端回覆網址 物流狀態都會透過此 URL 通知
	 * @return ServerReplyURL
	 */
	public String getServerReplyURL() {
		return ServerReplyURL;
	}
	/**
	 * 設定ServerReplyURL Server 端回覆網址 物流狀態都會透過此 URL 通知
	 * @param serverReplyURL
	 */
	public void setServerReplyURL(String serverReplyURL) {
		ServerReplyURL = serverReplyURL;
	}
	/**
	 * 取得ClientReplyURL Client 端回覆網址 此參數不為空時，當物流訂單建立後會將頁面導至此 URL
	 * @return ClientReplyURL
	 */
	public String getClientReplyURL() {
		return ClientReplyURL;
	}
	/**
	 * 設定ClientReplyURL Client 端回覆網址 此參數不為空時，當物流訂單建立後會將頁面導至此 URL
	 * @param clientReplyURL
	 */
	public void setClientReplyURL(String clientReplyURL) {
		ClientReplyURL = clientReplyURL;
	}
	/**
	 * 取得LogisticsC2CReplyURL Server 端物流回傳網址 當 User 選擇取貨門市有問題時，會透過此 URL 通知特店，請特店通知 User 重新選擇門市。 物流子類型為 UNIMARTC2C(統一超商交貨便)時，此欄位不可為空
	 * @return LogisticsC2CReplyURL
	 */
	public String getLogisticsC2CReplyURL() {
		return LogisticsC2CReplyURL;
	}
	/**
	 * 設定LogisticsC2CReplyURL Server 端物流回傳網址 當 User 選擇取貨門市有問題時，會透過此 URL 通知特店，請特店通知 User 重新選擇門市。 物流子類型為 UNIMARTC2C(統一超商交貨便)時，此欄位不可為空
	 * @param logisticsC2CReplyURL
	 */
	public void setLogisticsC2CReplyURL(String logisticsC2CReplyURL) {
		LogisticsC2CReplyURL = logisticsC2CReplyURL;
	}
	/**
	 * 取得Remark 備註
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * 設定Remark 備註
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * 取得ReceiverStoreID 收件人門市代號
	 * @return ReceiverStoreID
	 */
	public String getReceiverStoreID() {
		return ReceiverStoreID;
	}
	/**
	 * 設定ReceiverStoreID 收件人門市代號
	 * @param receiverStoreID
	 */
	public void setReceiverStoreID(String receiverStoreID) {
		ReceiverStoreID = receiverStoreID;
	}
	/**
	 * 取得ReturnStoreID 退貨門市代號 若沒有設定 ReturnStoreID，當貨品退貨時，會返回原寄件門市，若有設定則會送至指定的退貨門市。 僅 C2C 適用，B2C 請勿帶此參數。
	 * @return ReturnStoreID
	 */
	public String getReturnStoreID() {
		return ReturnStoreID;
	}
	/**
	 * 設定ReturnStoreID 退貨門市代號 若沒有設定 ReturnStoreID，當貨品退貨時，會返回原寄件門市，若有設定則會送至指定的退貨門市。 僅 C2C 適用，B2C 請勿帶此參數。
	 * @param returnStoreID
	 */
	public void setReturnStoreID(String returnStoreID) {
		ReturnStoreID = returnStoreID;
	}
	@Override
	public String toString() {
		return "CreateCVSObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo
				+ ", MerchantTradeDate=" + MerchantTradeDate + ", LogisticsType=" + LogisticsType
				+ ", LogisticsSubType=" + LogisticsSubType + ", GoodsAmount=" + GoodsAmount + ", CollectionAmount="
				+ CollectionAmount + ", IsCollection=" + IsCollection + ", GoodsName=" + GoodsName + ", SenderName="
				+ SenderName + ", SenderPhone=" + SenderPhone + ", SenderCellPhone=" + SenderCellPhone
				+ ", ReceiverName=" + ReceiverName + ", ReceiverPhone=" + ReceiverPhone + ", ReceiverCellPhone="
				+ ReceiverCellPhone + ", ReceiverEmail=" + ReceiverEmail + ", TradeDesc=" + TradeDesc
				+ ", ServerReplyURL=" + ServerReplyURL + ", ClientReplyURL=" + ClientReplyURL
				+ ", LogisticsC2CReplyURL=" + LogisticsC2CReplyURL + ", Remark=" + Remark + ", PlatformID=" + PlatformID
				+ ", ReceiverStoreID=" + ReceiverStoreID + ", ReturnStoreID=" + ReturnStoreID + "]";
	}
}
