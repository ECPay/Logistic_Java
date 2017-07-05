package ecpay.logistics.integration.domain;

/**
 * 宅配逆物流訂單物件
 * @author mark.chiu
 *
 */
public class ReturnHomeObj {
	
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
	 * LogisticsSubType
	 * 物流子類型
	 */
	private String LogisticsSubType = "";
	
	/**
	 * ServerReplyURL
	 * Server 端回覆網址
	 */
	private String ServerReplyURL = "";
	
	/**
	 * SenderName
	 * 退貨人姓名
	 */
	private String SenderName = "";
	
	/**
	 * SenderPhone
	 * 退貨人電話 
	 */
	private String SenderPhone = "";
	
	/**
	 * SenderCellPhone
	 * 退貨人手機
	 */
	private String SenderCellPhone = "";
	
	/**
	 * SenderZipCode
	 * 退貨人郵遞區號 
	 */
	private String SenderZipCode = "";
	
	/**
	 * SenderAddress
	 * 退貨人地址
	 */
	private String SenderAddress = "";
	
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
	 * 收件人手機
	 */
	private String ReceiverCellPhone = "";
	
	/**
	 * ReceiverZipCode
	 * 收件人郵遞區號 
	 */
	private String ReceiverZipCode = "";
	
	/**
	 * ReceiverAddress
	 * 收件人地址
	 */
	private String ReceiverAddress = "";
	
	/**
	 * GoodsAmount
	 * 商品金額
	 */
	private String GoodsAmount = "";
	
	/**
	 * GoodsName
	 * 物品名稱
	 */
	private String GoodsName = "";
	
	/**
	 * Temperature
	 * 溫層 
	 */
	private String Temperature = "";
	
	/**
	 * Distance
	 * 距離
	 */
	private String Distance = "";
	
	/**
	 * Specification
	 * 規格
	 */
	private String Specification = "";
	
	/**
	 * ScheduledPickupTime
	 * 預定取件時段
	 */
	private String ScheduledPickupTime = "";
	
	/**
	 * ScheduledDeliveryTime
	 * 預定送達時段
	 */
	private String ScheduledDeliveryTime = "";
	
	/**
	 * ScheduledDeliveryDate
	 * 指定送達日
	 */
	private String ScheduledDeliveryDate = "";
	
	/**
	 * PackageCount
	 * 包裹件數
	 */
	private String PackageCount = "";
	
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
	 * 取得AllPayLogisticsID 綠界科技的物流交易編號 與物流子類型[LogisticsSubType]擇一不可為空。僅限數字，不可使用特殊符號、英文
	 * @return AllPayLogisticsID
	 */
	public String getAllPayLogisticsID() {
		return AllPayLogisticsID;
	}
	/**
	 * 設定AllPayLogisticsID 綠界科技的物流交易編號 與物流子類型[LogisticsSubType]擇一不可為空。僅限數字，不可使用特殊符號、英文
	 * @param allPayLogisticsID
	 */
	public void setAllPayLogisticsID(String allPayLogisticsID) {
		AllPayLogisticsID = allPayLogisticsID;
	}
	/**
	 * 取得LogisticsSubType 物流子類型
	 * ---HOME--- 
	 * TCAT:黑貓
	 * ECAN:宅配通
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。
	 * @return LogisticsSubType
	 */
	public String getLogisticsSubType() {
		return LogisticsSubType;
	}
	/**
	 * 設定LogisticsSubType 物流子類型
	 * ---HOME--- 
	 * TCAT:黑貓
	 * ECAN:宅配通
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。
	 * @param logisticsSubType
	 */
	public void setLogisticsSubType(String logisticsSubType) {
		LogisticsSubType = logisticsSubType;
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
	 * 取得SenderName 退貨人姓名
	 * 1. 若 AllPayLogisticsID 有值且該訂單為相同的「物流子類型」時，退貨收件人與寄件人資訊會與原訂單相反且自動帶入宅配規格、溫層、距離、品名。 
	 * 2. 若資訊與關連物流交易不同時，可自行輸入 
	 * ※注意事項: 
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。 
	 * 4. 長度限制最多 10 個字元(中文 5 個字, 英文 10 個字)。 
	 * @return SenderName
	 */
	public String getSenderName() {
		return SenderName;
	}
	/**
	 * 設定SenderName 退貨人姓名
	 * 1. 若 AllPayLogisticsID 有值且該訂單為相同的「物流子類型」時，退貨收件人與寄件人資訊會與原訂單相反且自動帶入宅配規格、溫層、距離、品名。 
	 * 2. 若資訊與關連物流交易不同時，可自行輸入 
	 * ※注意事項: 
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。 
	 * 4. 長度限制最多 10 個字元(中文 5 個字, 英文 10 個字)。 
	 * @param senderName
	 */
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	/**
	 * 取得SenderPhone 退貨人電話
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位與退貨人手機[SenderCellPhone]擇一不可為空) 
	 * 4. 允許數字+特殊符號；特殊符號僅限()-#
	 * @return SenderPhone
	 */
	public String getSenderPhone() {
		return SenderPhone;
	}
	/**
	 * 設定SenderPhone 退貨人電話
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位與退貨人手機[SenderCellPhone]擇一不可為空) 
	 * 4. 允許數字+特殊符號；特殊符號僅限()-#
	 * @param senderPhone
	 */
	public void setSenderPhone(String senderPhone) {
		SenderPhone = senderPhone;
	}
	/**
	 * 取得SenderCellPhone 退貨人手機
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位與退貨人電話[SenderPhone]擇一不可為空) 
	 * 4. 只允許數字、10 碼、09 開頭
	 * @return SenderCellPhone
	 */
	public String getSenderCellPhone() {
		return SenderCellPhone;
	}
	/**
	 * 設定SenderCellPhone 退貨人手機
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位與退貨人電話[SenderPhone]擇一不可為空) 
	 * 4. 只允許數字、10 碼、09 開頭
	 * @param senderCellPhone
	 */
	public void setSenderCellPhone(String senderCellPhone) {
		SenderCellPhone = senderCellPhone;
	}
	/**
	 * 取得SenderZipCode 退貨人郵遞區號
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。 
	 * @return SenderZipCode
	 */
	public String getSenderZipCode() {
		return SenderZipCode;
	}
	/**
	 * 設定SenderZipCode 退貨人郵遞區號
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。 
	 * @param senderZipCode
	 */
	public void setSenderZipCode(String senderZipCode) {
		SenderZipCode = senderZipCode;
	}
	/**
	 * 取得SenderAddress 退貨人地址
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位字元限制需大於 6 個字元，且不可超過 60 個字元。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位字元限制需大於 6 個字元，且不可超過 60 個字元。
	 * @return SenderAddress
	 */
	public String getSenderAddress() {
		return SenderAddress;
	}
	/**
	 * 設定SenderAddress 退貨人地址
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位字元限制需大於 6 個字元，且不可超過 60 個字元。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位字元限制需大於 6 個字元，且不可超過 60 個字元。
	 * @param senderAddress
	 */
	public void setSenderAddress(String senderAddress) {
		SenderAddress = senderAddress;
	}
	/**
	 * 取得ReceiverName 收件人姓名
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。 
	 * 4. 字元限制為 10 個字元(最多 5 個中文字、10 個英文字) 、不可有空白，若帶有空白系統自動去除。
	 * @return ReceiverName
	 */
	public String getReceiverName() {
		return ReceiverName;
	}
	/**
	 * 設定ReceiverName 收件人姓名
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。 
	 * 4. 字元限制為 10 個字元(最多 5 個中文字、10 個英文字) 、不可有空白，若帶有空白系統自動去除。
	 * @param receiverName
	 */
	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}
	/**
	 * 取得ReceiverPhone 收件人電話
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位與收件人手機[ReceiverCellPhone]擇一不可為空) 
	 * 4. 允許數字+特殊符號；特殊符號僅限()-#
	 * @return ReceiverPhone
	 */
	public String getReceiverPhone() {
		return ReceiverPhone;
	}
	/**
	 * 設定ReceiverPhone 收件人電話
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位與收件人手機[ReceiverCellPhone]擇一不可為空) 
	 * 4. 允許數字+特殊符號；特殊符號僅限()-#
	 * @param receiverPhone
	 */
	public void setReceiverPhone(String receiverPhone) {
		ReceiverPhone = receiverPhone;
	}
	/**
	 * 取得ReceiverCellPhone 收件人手機
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位與收件人電話[ReceiverPhone]擇一不可為空) 
	 * 4. 只允許數字、10 碼、09 開頭
	 * @return ReceiverCellPhone
	 */
	public String getReceiverCellPhone() {
		return ReceiverCellPhone;
	}
	/**
	 * 設定ReceiverCellPhone 收件人手機
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位與收件人電話[ReceiverPhone]擇一不可為空) 
	 * 4. 只允許數字、10 碼、09 開頭
	 * @param receiverCellPhone
	 */
	public void setReceiverCellPhone(String receiverCellPhone) {
		ReceiverCellPhone = receiverCellPhone;
	}
	/**
	 * 取得ReceiverZipCode 收件人郵遞區號
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。 
	 * @return ReceiverZipCode
	 */
	public String getReceiverZipCode() {
		return ReceiverZipCode;
	}
	/**
	 * 設定ReceiverZipCode 收件人郵遞區號
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位不可為空值。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位不可為空值。 
	 * @param receiverZipCode
	 */
	public void setReceiverZipCode(String receiverZipCode) {
		ReceiverZipCode = receiverZipCode;
	}
	/**
	 * 取得ReceiverAddress 收件人地址
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位字元限制需大於 6 個字元，且不可超過 60 個字元。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位字元限制需大於 6 個字元，且不可超過 60 個字元。
	 * @return ReceiverAddress
	 */
	public String getReceiverAddress() {
		return ReceiverAddress;
	}
	/**
	 * 設定ReceiverAddress 收件人地址
	 * 1. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為宅配(Home)本欄位可為空值。 
	 * 2. 若物流交易編號[AllPayLogisticsID]不為空值時，且原物流類型[LogisticsType]為 CVS:超商取貨，本欄位字元限制需大於 6 個字元，且不可超過 60 個字元。 
	 * 3. 若物流交易編號[AllPayLogisticsID]為空值時，本欄位字元限制需大於 6 個字元，且不可超過 60 個字元。
	 * @param receiverAddress
	 */
	public void setReceiverAddress(String receiverAddress) {
		ReceiverAddress = receiverAddress;
	}
	/**
	 * 取得GoodsAmount 商品金額 金額範圍為 1~20,000 元 此為商品遺失賠償依據，僅可使用數字
	 * @return GoodsAmount
	 */
	public String getGoodsAmount() {
		return GoodsAmount;
	}
	/**
	 * 設定GoodsAmount 商品金額 金額範圍為 1~20,000 元 此為商品遺失賠償依據，僅可使用數字
	 * @param goodsAmount
	 */
	public void setGoodsAmount(String goodsAmount) {
		GoodsAmount = goodsAmount;
	}
	/**
	 * 取得GoodsName 物品名稱 不可有單引號或雙引號。
	 * @return GoodsName
	 */
	public String getGoodsName() {
		return GoodsName;
	}
	/**
	 * 設定GoodsName 物品名稱 不可有單引號或雙引號。
	 * @param goodsName
	 */
	public void setGoodsName(String goodsName) {
		GoodsName = goodsName;
	}
	/**
	 * 取得Temperature 溫層
	 * 0001:常溫 (預設值) 
	 * 0002:冷藏
	 * 0003:冷凍
	 * @return Temperature
	 */
	public String getTemperature() {
		return Temperature;
	}
	/**
	 * 設定Temperature 溫層
	 * 0001:常溫 (預設值) 
	 * 0002:冷藏
	 * 0003:冷凍
	 * @param temperature
	 */
	public void setTemperature(String temperature) {
		Temperature = temperature;
	}
	/**
	 * 取得Distance 距離
	 * 00:同縣市 (預設值) 
	 * 01:外縣市
	 * 02:離島
	 * @return Distance
	 */
	public String getDistance() {
		return Distance;
	}
	/**
	 * 設定Distance 距離
	 * 00:同縣市 (預設值) 
	 * 01:外縣市
	 * 02:離島
	 * @param distance
	 */
	public void setDistance(String distance) {
		Distance = distance;
	}
	/**
	 * 取得Specification 規格
	 * 0001: 60cm (預設值) 
	 * 0002: 90cm 
	 * 0003: 120cm 
	 * 0004: 150cm
	 * @return Specification
	 */
	public String getSpecification() {
		return Specification;
	}
	/**
	 * 設定Specification 規格
	 * 0001: 60cm (預設值) 
	 * 0002: 90cm 
	 * 0003: 120cm 
	 * 0004: 150cm
	 * @param specification
	 */
	public void setSpecification(String specification) {
		Specification = specification;
	}
	/**
	 * 取得ScheduledPickupTime 預定取件時段
	 * 1: 9~12 
	 * 2: 12~17 
	 * 3: 17~20 
	 * 4:不限時(固定 4 不限時)
	 * (當子物流選擇宅配通時，該參數可不填)
	 * @return ScheduledPickupTime
	 */
	public String getScheduledPickupTime() {
		return ScheduledPickupTime;
	}
	/**
	 * 設定ScheduledPickupTime 預定取件時段
	 * 1: 9~12 
	 * 2: 12~17 
	 * 3: 17~20 
	 * 4:不限時(固定 4 不限時)
	 * (當子物流選擇宅配通時，該參數可不填)
	 * @param scheduledPickupTime
	 */
	public void setScheduledPickupTime(String scheduledPickupTime) {
		ScheduledPickupTime = scheduledPickupTime;
	}
	/**
	 * 取得ScheduledDeliveryTime 預定送達時段
	 * 1: 9~12 
	 * 2: 12~17 
	 * 3: 17~20 
	 * 4:不限時 
	 * 5:20~21(需限定區域，宅配通沒有此時段) 
	 * 當子物流選擇宅配通時，可選擇以下時段 
	 * 12: (早午 9~17) 
	 * 13: (早晚 9~12 & 17~20) 
	 * 23: (午晚 13~20)
	 * @return ScheduledDeliveryTime
	 */
	public String getScheduledDeliveryTime() {
		return ScheduledDeliveryTime;
	}
	/**
	 * 設定ScheduledDeliveryTime 預定送達時段
	 * 1: 9~12 
	 * 2: 12~17 
	 * 3: 17~20 
	 * 4:不限時 
	 * 5:20~21(需限定區域，宅配通沒有此時段) 
	 * 當子物流選擇宅配通時，可選擇以下時段 
	 * 12: (早午 9~17) 
	 * 13: (早晚 9~12 & 17~20) 
	 * 23: (午晚 13~20)
	 * @param scheduledDeliveryTime
	 */
	public void setScheduledDeliveryTime(String scheduledDeliveryTime) {
		ScheduledDeliveryTime = scheduledDeliveryTime;
	}
	/**
	 * 取得ScheduledDeliveryDate 指定送達日 當子物流選擇宅配通時，此參數才有作用
	 * 日期指定限制 D+3 (D:該訂單建立時間)
	 * @return ScheduledDeliveryDate
	 */
	public String getScheduledDeliveryDate() {
		return ScheduledDeliveryDate;
	}
	/**
	 * 設定ScheduledDeliveryDate 指定送達日 當子物流選擇宅配通時，此參數才有作用
	 * 日期指定限制 D+3 (D:該訂單建立時間)
	 * @param scheduledDeliveryDate
	 */
	public void setScheduledDeliveryDate(String scheduledDeliveryDate) {
		ScheduledDeliveryDate = scheduledDeliveryDate;
	}
	/**
	 * 取得PackageCount 包裹件數 當子物流選擇宅配通時，此參數才有作用，作用於同訂單編號，包裹件數。
	 * @return PackageCount
	 */
	public String getPackageCount() {
		return PackageCount;
	}
	/**
	 * 設定PackageCount 包裹件數 當子物流選擇宅配通時，此參數才有作用，作用於同訂單編號，包裹件數。
	 * @param packageCount
	 */
	public void setPackageCount(String packageCount) {
		PackageCount = packageCount;
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
		return "ReturnHomeObj [MerchantID=" + MerchantID + ", AllPayLogisticsID=" + AllPayLogisticsID
				+ ", LogisticsSubType=" + LogisticsSubType + ", ServerReplyURL=" + ServerReplyURL + ", SenderName="
				+ SenderName + ", SenderPhone=" + SenderPhone + ", SenderCellPhone=" + SenderCellPhone
				+ ", SenderZipCode=" + SenderZipCode + ", SenderAddress=" + SenderAddress + ", ReceiverName="
				+ ReceiverName + ", ReceiverPhone=" + ReceiverPhone + ", ReceiverCellPhone=" + ReceiverCellPhone
				+ ", ReceiverZipCode=" + ReceiverZipCode + ", ReceiverAddress=" + ReceiverAddress + ", GoodsAmount="
				+ GoodsAmount + ", GoodsName=" + GoodsName + ", Temperature=" + Temperature + ", Distance=" + Distance
				+ ", Specification=" + Specification + ", ScheduledPickupTime=" + ScheduledPickupTime
				+ ", ScheduledDeliveryTime=" + ScheduledDeliveryTime + ", ScheduledDeliveryDate="
				+ ScheduledDeliveryDate + ", PackageCount=" + PackageCount + ", Remark=" + Remark + ", PlatformID="
				+ PlatformID + "]";
	}
}
