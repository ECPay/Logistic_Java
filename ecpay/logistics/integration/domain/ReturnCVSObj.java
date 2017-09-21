package ecpay.logistics.integration.domain;

/**
 * 超商取貨逆物流訂單物件
 * @author mark.chiu
 *
 */
public class ReturnCVSObj {
	
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
	 * ServerReplyURL
	 * Server 端回覆網址
	 */
	private String ServerReplyURL = "";
	
	/**
	 * GoodsName
	 * 商品名稱
	 */
	private String GoodsName = "";
	
	/**
	 * GoodsAmount
	 * 商品金額
	 */
	private String GoodsAmount = "";
	
	/**
	 * CollectionAmount
	 * 代收金額
	 */
	private String CollectionAmount = "0";
	
	/**
	 * ServiceType
	 * 服務型態代碼
	 */
	private String ServiceType = "4";
	
	/**
	 * SenderName
	 * 寄件人姓名
	 */
	private String SenderName = "";
	
	/**
	 * SenderPhone
	 * 退貨人電話
	 */
	private String SenderPhone = "";
	
	/**
	 * Remark
	 * 備註
	 */
	private String Remark = "";
	
	/**
	 * Quantity
	 * 數量
	 */
	private String Quantity = "";
	
	/**
	 * Cost
	 * 成本
	 */
	private String Cost = "";
	
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
	 * 取得AllPayLogisticsID 綠界科技的物流交易編號 僅限數字，不可使用特殊符號、英文
	 * @return AllPayLogisticsID
	 */
	public String getAllPayLogisticsID() {
		return AllPayLogisticsID;
	}
	/**
	 * 設定AllPayLogisticsID 綠界科技的物流交易編號 僅限數字，不可使用特殊符號、英文
	 * @param allPayLogisticsID
	 */
	public void setAllPayLogisticsID(String allPayLogisticsID) {
		AllPayLogisticsID = allPayLogisticsID;
	}
	/**
	 * 取得ServerReplyURL Server 端回覆網址 逆物流狀態都會透過此 URL 通知。
	 * @return ServerReplyURL
	 */
	public String getServerReplyURL() {
		return ServerReplyURL;
	}
	/**
	 * 設定ServerReplyURL Server 端回覆網址  逆物流狀態都會透過此 URL 通知。
	 * @param serverReplyURL
	 */
	public void setServerReplyURL(String serverReplyURL) {
		ServerReplyURL = serverReplyURL;
	}
	/**
	 * 取得GoodsName 商品名稱 若有多個商品請用#分隔，不可有單引號或雙引號。
	 * @return GoodsName
	 */
	public String getGoodsName() {
		return GoodsName;
	}
	/**
	 * 設定GoodsName 商品名稱 若有多個商品請用#分隔，不可有單引號或雙引號。
	 * @param goodsName
	 */
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	/**
	 * 取得GoodsAmount 商品金額 金額範圍為 1~20,000 元 商品遺失賠償依據，僅可使用數字
	 * @return GoodsAmount
	 */
	public String getGoodsAmount() {
		return GoodsAmount;
	}
	/**
	 * 設定GoodsAmount 商品金額 金額範圍為 1~20,000 元 商品遺失賠償依據，僅可使用數字
	 * @param goodsAmount
	 */
	public void setGoodsAmount(String goodsAmount) {
		GoodsAmount = goodsAmount;
	}
	/**
	 * 取得CollectionAmount 代收金額
	 * @return CollectionAmount
	 */
	public String getCollectionAmount() {
		return CollectionAmount;
	}
//	/**
//	 * 設定CollectionAmount 代收金額
//	 * @param collectionAmount
//	 */
//	public void setCollectionAmount(String collectionAmount) {
//		CollectionAmount = collectionAmount;
//	}
	/**
	 * 取得ServiceType 服務型態代碼
	 * @return ServiceType
	 */
	public String getServiceType() {
		return ServiceType;
	}
//	/**
//	 * 設定ServiceType
//	 * @param serviceType
//	 */
//	public void setServiceType(String serviceType) {
//		ServiceType = serviceType;
//	}
	/**
	 * 取得SenderName 寄件人姓名
	 * @return SenderName
	 */
	public String getSenderName() {
		return SenderName;
	}
	/**
	 * 設定SenderName 寄件人姓名
	 * @param senderName
	 */
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	/**
	 * 取得SenderPhone 退貨人電話
	 * @return SenderPhone
	 */
	public String getSenderPhone() {
		return SenderPhone;
	}
	/**
	 * 設定SenderPhone 退貨人電話
	 * @param senderPhone
	 */
	public void setSenderPhone(String senderPhone) {
		SenderPhone = senderPhone;
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
	 * 取得Quantity 數量 若有多個商品請用#分隔
	 * @return Quantity
	 */
	public String getQuantity() {
		return Quantity;
	}
	/**
	 * 設定Quantity 數量 若有多個商品請用#分隔
	 * @param quantity
	 */
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	/**
	 * 取得Cost 成本  若有多個商品請用#分隔
	 * @return Cost
	 */
	public String getCost() {
		return Cost;
	}
	/**
	 * 設定Cost 成本  若有多個商品請用#分隔
	 * @param cost
	 */
	public void setCost(String cost) {
		Cost = cost;
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
		return "ReturnCVSObj [MerchantID=" + MerchantID + ", AllPayLogisticsID=" + AllPayLogisticsID
				+ ", ServerReplyURL=" + ServerReplyURL + ", GoodsName=" + GoodsName + ", GoodsAmount=" + GoodsAmount
				+ ", CollectionAmount=" + CollectionAmount + ", ServiceType=" + ServiceType + ", SenderName="
				+ SenderName + ", SenderPhone=" + SenderPhone + ", Remark=" + Remark + ", Quantity=" + Quantity
				+ ", Cost=" + Cost + ", PlatformID=" + PlatformID + "]";
	}
}
