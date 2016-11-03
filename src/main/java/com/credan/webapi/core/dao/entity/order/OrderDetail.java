package com.credan.webapi.core.dao.entity.order;

import java.math.BigDecimal;
import java.util.Date;

import com.credan.webapi.core.dao.entity.BasicEntity;

public class OrderDetail extends BasicEntity {

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.merchant_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String merchantId;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.order_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String orderId;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.project_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String projectId;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.name
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String name;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.type
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String type;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.price
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private BigDecimal price;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.order_amount
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private BigDecimal orderAmount;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.term
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private Long term;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.unit
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String unit;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.count
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private Long count;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.desc
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String desc;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.call_back_time
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private Date callBackTime;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.call_back_count
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private Long callBackCount;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.call_back_result
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String callBackResult;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.ext
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private String ext;

	/**
	 *
	 * This field was generated by MyBatis Generator. This field corresponds to the database column
	 * merchant_order_detail.version
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	private Long version;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.merchant_id
	 *
	 * @return the value of merchant_order_detail.merchant_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getMerchantId() {
		return merchantId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.merchant_id
	 *
	 * @param merchantId the value for merchant_order_detail.merchant_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId == null ? null : merchantId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.order_id
	 *
	 * @return the value of merchant_order_detail.order_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.order_id
	 *
	 * @param orderId the value for merchant_order_detail.order_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId == null ? null : orderId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.project_id
	 *
	 * @return the value of merchant_order_detail.project_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getProjectId() {
		return projectId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.project_id
	 *
	 * @param projectId the value for merchant_order_detail.project_id
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId == null ? null : projectId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.name
	 *
	 * @return the value of merchant_order_detail.name
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.name
	 *
	 * @param name the value for merchant_order_detail.name
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.type
	 *
	 * @return the value of merchant_order_detail.type
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.type
	 *
	 * @param type the value for merchant_order_detail.type
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.price
	 *
	 * @return the value of merchant_order_detail.price
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.price
	 *
	 * @param price the value for merchant_order_detail.price
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.order_amount
	 *
	 * @return the value of merchant_order_detail.order_amount
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.order_amount
	 *
	 * @param orderAmount the value for merchant_order_detail.order_amount
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.term
	 *
	 * @return the value of merchant_order_detail.term
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public Long getTerm() {
		return term;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.term
	 *
	 * @param term the value for merchant_order_detail.term
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setTerm(Long term) {
		this.term = term;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.unit
	 *
	 * @return the value of merchant_order_detail.unit
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.unit
	 *
	 * @param unit the value for merchant_order_detail.unit
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setUnit(String unit) {
		this.unit = unit == null ? null : unit.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.count
	 *
	 * @return the value of merchant_order_detail.count
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public Long getCount() {
		return count;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.count
	 *
	 * @param count the value for merchant_order_detail.count
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setCount(Long count) {
		this.count = count;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.desc
	 *
	 * @return the value of merchant_order_detail.desc
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.desc
	 *
	 * @param desc the value for merchant_order_detail.desc
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setDesc(String desc) {
		this.desc = desc == null ? null : desc.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.call_back_time
	 *
	 * @return the value of merchant_order_detail.call_back_time
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public Date getCallBackTime() {
		return callBackTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.call_back_time
	 *
	 * @param callBackTime the value for merchant_order_detail.call_back_time
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setCallBackTime(Date callBackTime) {
		this.callBackTime = callBackTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.call_back_count
	 *
	 * @return the value of merchant_order_detail.call_back_count
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public Long getCallBackCount() {
		return callBackCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.call_back_count
	 *
	 * @param callBackCount the value for merchant_order_detail.call_back_count
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setCallBackCount(Long callBackCount) {
		this.callBackCount = callBackCount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.call_back_result
	 *
	 * @return the value of merchant_order_detail.call_back_result
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getCallBackResult() {
		return callBackResult;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.call_back_result
	 *
	 * @param callBackResult the value for merchant_order_detail.call_back_result
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setCallBackResult(String callBackResult) {
		this.callBackResult = callBackResult == null ? null : callBackResult.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.ext
	 *
	 * @return the value of merchant_order_detail.ext
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public String getExt() {
		return ext;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.ext
	 *
	 * @param ext the value for merchant_order_detail.ext
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setExt(String ext) {
		this.ext = ext == null ? null : ext.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column
	 * merchant_order_detail.version
	 *
	 * @return the value of merchant_order_detail.version
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public Long getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column
	 * merchant_order_detail.version
	 *
	 * @param version the value for merchant_order_detail.version
	 *
	 * @mbg.generated Wed Nov 02 17:31:16 CST 2016
	 */
	public void setVersion(Long version) {
		this.version = version;
	}

}