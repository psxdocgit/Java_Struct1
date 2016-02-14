package com.my.pro.page.manager;

import java.util.List;

public class TitleInfoBean {
	//主题ID
	private Integer	titleId=-1;
	//提问者
	private String	userQ="";
	//回答者
	private String	userA="";
	//主题
	private String	title="";
	//内容
	private String	content="";
	//上传文件清单
	private List<String> fileNames=null;
	//状态
	private String	status="";
	//更新年月日
	private String	updateYMD="";
	//更新时分秒
	private String	updateHMS="";
	
	/**
	 * @return the titleId
	 */
	public Integer getTitleId() {
		return titleId;
	}
	/**
	 * @param titleId the titleId to set
	 */
	public void setTitleId(Integer titleId) {
		this.titleId = titleId;
	}
	/**
	 * @return the userQ
	 */
	public String getUserQ() {
		return userQ;
	}
	/**
	 * @param userQ the userQ to set
	 */
	public void setUserQ(String userQ) {
		this.userQ = userQ;
	}
	/**
	 * @return the userA
	 */
	public String getUserA() {
		return userA;
	}
	/**
	 * @param userA the userA to set
	 */
	public void setUserA(String userA) {
		this.userA = userA;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the fileNames
	 */
	public List<String> getFileNames() {
		return fileNames;
	}
	/**
	 * @param fileNames the fileNames to set
	 */
	public void setFileNames(List<String> fileNames) {
		this.fileNames = fileNames;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the updateYMD
	 */
	public String getUpdateYMD() {
		return updateYMD;
	}
	/**
	 * @param updateYMD the updateYMD to set
	 */
	public void setUpdateYMD(String updateYMD) {
		this.updateYMD = updateYMD;
	}
	/**
	 * @return the updateHMS
	 */
	public String getUpdateHMS() {
		return updateHMS;
	}
	/**
	 * @param updateHMS the updateHMS to set
	 */
	public void setUpdateHMS(String updateHMS) {
		this.updateHMS = updateHMS;
	}
	
}
