package com.my.pro.page.manager;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.upload.FormFile;

import com.my.pro.common.basic.BasicForm;
import com.my.pro.common.validate.Validate;

public class ManagerCreateForm extends BasicForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7767163061174852080L;
	//主题
	private String title="";
	//内容
	private String content="";
	//紧急度
	private Integer urgency=0;
	//类型<多选框>
	private Integer[] types=new Integer[4];
	//分数<下拉列表>
	private Integer fraction=0;
	//上传文件<多文件>
	private List<FormFile> uploadFiles = new ArrayList<FormFile>(); 

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
	 * @return the urgency
	 */
	public Integer getUrgency() {
		return urgency;
	}

	/**
	 * @param urgency the urgency to set
	 */
	public void setUrgency(Integer urgency) {
		this.urgency = urgency;
	}

	/**
	 * @return the types
	 */
	public Integer[] getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(Integer[] types) {
		this.types = types;
	}

	/**
	 * @return the fraction
	 */
	public Integer getFraction() {
		return fraction;
	}

	/**
	 * @param fraction the fraction to set
	 */
	public void setFraction(Integer fraction) {
		this.fraction = fraction;
	}

	public FormFile getUploadFile(int index) {
		System.out.println("getUploadFile(int index)" + "  paramer:"+index);
		while(uploadFiles.size()<=index){
			uploadFiles.add(null);
		}
		return uploadFiles.get(index);
	}
	
	public void setUploadFile(int i, FormFile uploadFile) {
		if(uploadFile==null || Validate.isBlank(uploadFile.getFileName())){
			System.out.println("setUploadFile(int i, FormFile uploadFile)" + "  paramer:"+i+", null");
			return;
		}
		System.out.println("setUploadFile(int i, FormFile uploadFile)" + "  paramer:"+i+", "+uploadFile.getFileName());
		uploadFiles.add(uploadFile);
	}
	
}
