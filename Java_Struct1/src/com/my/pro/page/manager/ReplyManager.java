package com.my.pro.page.manager;

import java.util.List;

import com.my.pro.common.basic.ReplyBean;

public class ReplyManager extends ReplyBean{
	private List<TitleInfoBean> infoList=null;

	/**
	 * @return the infoList
	 */
	public List<TitleInfoBean> getInfoList() {
		return infoList;
	}

	/**
	 * @param infoList the infoList to set
	 */
	public void setInfoList(List<TitleInfoBean> infoList) {
		this.infoList = infoList;
	}
	
}
