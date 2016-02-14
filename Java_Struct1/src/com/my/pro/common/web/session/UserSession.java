package com.my.pro.common.web.session;

/**
 * @author tin
 *
 */
public class UserSession {
	//Login flg
	private boolean loginFlg=false;
	//Login user name
	private String loginUserName="";
	//Login user rank
	private Integer rank=0;

	/**
	 * reset 
	 */
	public void reset(){
		loginFlg=false;
		loginUserName="";
		rank=0;
	}
	/**
	 * @return the loginFlg
	 */
	public boolean isLoginFlg() {
		return loginFlg;
	}

	/**
	 * @param loginFlg the loginFlg to set
	 */
	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	/**
	 * @return the loginUserName
	 */
	public String getLoginUserName() {
		return loginUserName;
	}

	/**
	 * @param loginUserName the loginUserName to set
	 */
	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
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
}
