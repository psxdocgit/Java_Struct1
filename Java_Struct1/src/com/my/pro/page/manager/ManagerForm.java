package com.my.pro.page.manager;

import com.my.pro.common.basic.BasicForm;

public class ManagerForm extends BasicForm {
	private String titleId="";
	private String selectedTitleId="";
	private String fileType="";
	private String status="";
	
	/**
	 * @return the titleId
	 */
	public String getTitleId() {
		return titleId;
	}

	/**
	 * @param titleId the titleId to set
	 */
	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	/**
	 * @return the selectedTitleId
	 */
	public String getSelectedTitleId() {
		return selectedTitleId;
	}

	/**
	 * @param selectedTitleId the selectedTitleId to set
	 */
	public void setSelectedTitleId(String selectedTitleId) {
		this.selectedTitleId = selectedTitleId;
	}

	/**
	 * @return the fileType
	 */
	public String getFileType() {
		return fileType;
	}

	/**
	 * @param fileType the fileType to set
	 */
	public void setFileType(String fileType) {
		this.fileType = fileType;
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
}
