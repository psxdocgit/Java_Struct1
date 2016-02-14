package com.my.pro.common.basic;

import java.io.Serializable;

import org.apache.struts.action.ActionForm;

/**
 * Basic Form
 * @author tin
 *
 */
public abstract class BasicForm extends ActionForm implements Serializable {
	//Action ID
	private int actionId=0;

	/**
	 * @return the actionID
	 */
	public int getActionId() {
		return actionId;
	}

	/**
	 * @param actionID the actionID to set
	 */
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	
	
}
