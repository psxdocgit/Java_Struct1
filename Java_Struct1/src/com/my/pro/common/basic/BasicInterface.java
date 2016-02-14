package com.my.pro.common.basic;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author tin
 *
 */
public interface BasicInterface {
	//page ajax
	public void doAjax(BasicForm form,HttpServletRequest request,HttpServletResponse response);
	//page commit
	public ReplyBean doCommit(BasicForm form,HttpServletRequest request);
	//page init
	public ReplyBean doInit(BasicForm form,HttpServletRequest request);
	//Single Project
	public boolean SingleItemCheck(BasicForm form,HttpServletRequest request);
	//Multi-project
	public boolean CompositeItemCheck(BasicForm form,HttpServletRequest request);
}
