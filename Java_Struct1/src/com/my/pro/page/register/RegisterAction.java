package com.my.pro.page.register;

import javax.servlet.http.HttpServletRequest;

import com.my.pro.common.basic.BasicAction;
import com.my.pro.common.basic.BasicForm;
import com.my.pro.common.basic.ReplyBean;

/**
 * @author tin
 *
 */
public class RegisterAction extends BasicAction {

	@Override
	public ReplyBean doCommit(BasicForm form,HttpServletRequest request) {
		return super.doCommit( form, request);
	}


	@Override
	public ReplyBean doInit(BasicForm form,HttpServletRequest request) {
		ReplyRegister reply=new ReplyRegister();
		reply.setActionFlg("123");
		reply.setForward("register");
		return reply;
	}


	@Override
	public boolean SingleItemCheck(BasicForm form,HttpServletRequest request) {
		return super.SingleItemCheck( form, request);
	}


	@Override
	public boolean CompositeItemCheck(BasicForm form,HttpServletRequest request) {
		return super.CompositeItemCheck( form, request);
	}


	@Override
	public String getForward() {
		// TODO Auto-generated method stub
		return "register";
	}
	
	
}
