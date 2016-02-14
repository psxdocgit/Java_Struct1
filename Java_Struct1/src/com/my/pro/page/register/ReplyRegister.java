package com.my.pro.page.register;

import com.my.pro.common.basic.ReplyBean;

public class ReplyRegister extends ReplyBean{
	
	private String actionFlg="";
	private String name="";
	private String pwd="";
	private Integer rank=0;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	/**
	 * @return the rank
	 */
	public Integer getRank() {
		return rank;
	}
	/**
	 * @param rank the rank to set
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}
	/**
	 * @return the actionFlg
	 */
	public String getActionFlg() {
		return actionFlg;
	}
	/**
	 * @param actionFlg the actionFlg to set
	 */
	public void setActionFlg(String actionFlg) {
		this.actionFlg = actionFlg;
	}
	
}
