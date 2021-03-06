/**
 * @(#) BasicEntity.java
 * 
 * Copyright (c) 2016, Credan(上海)-版权所有
 * 
 */
package com.credan.webapi.core.dao.entity;

import java.util.Date;

import com.google.common.base.Strings;

import lombok.Data;

/**
 * 实体类父类
 * 
 * @author Mond
 * @version 1.0.0, $Date: 2016年11月3日 上午11:41:01 $
 */
@Data
public class BasicEntity {

	private String id;

	private String memo;

	private String delFlag;

	private Date createdTime;

	private Date lastUpdated;

	private boolean isNewRecord = false;

	private Long version;

	public boolean isNewRecord() {
		return isNewRecord || Strings.isNullOrEmpty(getId());
	}

	public void setNewRecord(boolean isNewRecord) {
		this.isNewRecord = isNewRecord;
	}

}
