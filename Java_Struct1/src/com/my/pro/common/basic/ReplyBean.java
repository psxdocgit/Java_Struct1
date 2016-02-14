package com.my.pro.common.basic;

public class ReplyBean {
	
	private String forward="";

	private boolean loginFlg=false;

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
	 * @return the forward
	 */
	public String getForward() {
		return forward;
	}

	/**
	 * @param forward the forward to set
	 */
	public void setForward(String forward) {
		this.forward = forward;
	}
}
