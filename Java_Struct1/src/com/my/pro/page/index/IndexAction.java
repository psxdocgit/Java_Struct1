package com.my.pro.page.index;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.my.pro.common.basic.BasicAction;
import com.my.pro.common.basic.BasicForm;
import com.my.pro.common.basic.ReplyBean;
import com.my.pro.common.constant.Constant;
import com.my.pro.common.web.control.helper.WebControlHelper;
import com.my.pro.common.web.session.UserSession;

/**
 * @author tin
 *
 */
public class IndexAction extends BasicAction {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.my.pro.common.basic.BasicAction#doInit(javax.servlet.http.
	 * HttpServletRequest)
	 */
	@Override
	public ReplyBean doInit(BasicForm form,HttpServletRequest request) {
		ReplyIndex reply = new ReplyIndex();
		
		// Session
		UserSession user=WebControlHelper.getUserSession(request);
		reply.setLoginFlg(user.isLoginFlg());
		return reply;
	}

	@Override
	public String getForward() {
		return "index";
	}

}
