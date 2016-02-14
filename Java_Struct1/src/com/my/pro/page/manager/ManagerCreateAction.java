package com.my.pro.page.manager;

import javax.servlet.http.HttpServletRequest;

import com.my.pro.common.basic.BasicAction;
import com.my.pro.common.basic.BasicForm;
import com.my.pro.common.basic.ErrorMSG;
import com.my.pro.common.basic.ReplyBean;
import com.my.pro.common.validate.Validate;

/**
 * @author tin
 *
 */
public class ManagerCreateAction extends BasicAction {


	@Override
	public ReplyBean doCommit(BasicForm form,HttpServletRequest request) {
		ReplyManagerCreate reply=new ReplyManagerCreate();
		reply.setForward("managercreate");
		return reply;
	}


	@Override
	public ReplyBean doInit(BasicForm form,HttpServletRequest request) {
		ReplyManagerCreate reply=new ReplyManagerCreate();
		reply.setForward("managercreate");
		return reply;
	}


	@Override
	public boolean SingleItemCheck(BasicForm form,HttpServletRequest request) {
		ManagerCreateForm mForm=(ManagerCreateForm) form;
		//title
		if(Validate.isBlank(mForm.getTitle().trim())){
			ErrorMSG.instance().addMsg("error.title.fatal");
			return true;
		}
		//content
		if(Validate.isBlank(mForm.getContent())){
			ErrorMSG.instance().addMsg("error.content.fatal");
			return true;
		}
		return false;
	}


	@Override
	public boolean CompositeItemCheck(BasicForm form,HttpServletRequest request) {
		return false;
	}


	@Override
	public String getForward() {
		// TODO Auto-generated method stub
		return "managercreate";
	}

}
