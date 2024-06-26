
package com.SHD.day02;


import lombok.Data;
import lombok.experimental.Accessors;


import java.util.Date;

/**
 * 单据， 考虑采购单， 调拨单，发货单，备料单，投料单，销退单，入库单， 到货单实体类
 *
 * @author Sam
 * @since 2022-04-14
 */
@Data
@Accessors(chain = true)
public class SheetHeader {

	private static final long serialVersionUID = 1L;

	/**
	* 单据类型，	采购单：PO，领料单：（RO），发货单：（DO），生产入库单（FO）	原料入库单：MO; 
	*/
    private String sheetType;
	/**
	* 具体单据的子类型，比如采购单包含：委外采购单，普通采购单，研发采购单等；
	*/
    private String sheetSubType;
	/**
	* 单据单号
	*/
    private String sheetNo;
	/**
	* 单据日期
	*/

    private Date sheetDate;
	/**
	* erp主键
	*/
    private String erpKey;
	/**
	* mes_partner.id，有些对应的是供应商，有些是客户，有些是委外合作商
	*/
    private Long partnerId;
	/**
	* mes_partner.code
	*/
    private String partnerCode;
	/**
	* 预定到达时间
	*/

    private Date reservationArrivalTime;
	/**
	* 送货类型
	*/
    private String deliveryType;
	/**
	* 送货地址，对应mes_location.id
	*/
    private Long deliveryAddress;
	/**
	* 发货日期
	*/

    private Date deliveryDate;
	/**
	* 销售订单号
	*/
    private String soNo;
	/**
	* 客户订单号
	*/
    private String customerOrderNo;
	/**
	* 供应商合同号
	*/
    private String contractNo;
	/**
	* ASN单号
	*/
    private String asnno;
	/**
	* 负责人
	*/
    private String principal;
	/**
	* 联系方式, json
	*/
    private String contacts;
	/**
	* 来源类型
	*/
    private String sourceType;
	/**
	* 来源类型对应的来源ID或NO
	*/
    private String sourceNo;
	/**
	* 源创建日期
	*/

    private Date sourceCreateDate;
	/**
	* 源更新日期
	*/

    private Date sourceUpdateDate;
	/**
	* 生成类型
	*/
    private String generationType;
	/**
	* 描述
	*/
    private String description;

	/**
	* 最后一次成功同步时间
	*/

    private Date lastSuccessSyncTime;

	/**
	 * 最后一次成功回写时间
	 */

	private Date lastSuccessWriteTime;

	/**
	 * 原单据ID
	 */
	private Long originalSheetId;

	/**
	 * 库存中心ID
	 */
	private Long inventoryId;

	/**
	 * 库存中心名称
	 */

	private String inventoryName;

	/**
	 * 源库存中心ID
	 */

	private Long fromInventoryId;

	/**
	 * 源库存中心名称
	 */

	private String fromInventoryName;

}
