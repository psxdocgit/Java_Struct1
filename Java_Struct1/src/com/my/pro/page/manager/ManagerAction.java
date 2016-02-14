package com.my.pro.page.manager;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.my.pro.common.basic.BasicAction;
import com.my.pro.common.basic.BasicForm;
import com.my.pro.common.basic.ReplyBean;
import com.my.pro.common.constant.Constant;
import com.my.pro.common.web.control.helper.WebControlHelper;
import com.my.pro.common.web.session.UserSession;

public class ManagerAction extends BasicAction {

	/* (non-Javadoc)
	 * @see com.my.pro.common.basic.BasicAction#doCommit(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public ReplyBean doCommit(BasicForm form,HttpServletRequest request) {
		ReplyManager reply=new ReplyManager();
		TitleInfoBean titleInfo=new TitleInfoBean();
		titleInfo.setUserQ("QQQ");;
		List<TitleInfoBean> list=new ArrayList<TitleInfoBean>();
		list.add(titleInfo);
		reply.setInfoList(list);
		
		return reply;
	}

	/* (non-Javadoc)
	 * @see com.my.pro.common.basic.BasicAction#doInit(javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public ReplyBean doInit(BasicForm form,HttpServletRequest request) {
		UserSession user=WebControlHelper.getUserSession(request);
		List<TitleInfoBean> list=new ArrayList<TitleInfoBean>();
		
		list.add(testGetTitleInfoBean(true));
		list.add(testGetTitleInfoBean(true));
		list.add(testGetTitleInfoBean(true));
		list.add(testGetTitleInfoBean(false));
		list.add(testGetTitleInfoBean(false));
		list.add(testGetTitleInfoBean(false));
		
		if(user.isLoginFlg()){
			ReplyManager reply=new ReplyManager();
			reply.setLoginFlg(true);
			reply.setInfoList(list);
			reply.setForward("manager");
			return reply;
		}else{
			ReplyManager reply=new ReplyManager();
			reply.setInfoList(list);
			reply.setLoginFlg(false);
			reply.setForward("manager");
			return reply;
		}
	}

	private TitleInfoBean testGetTitleInfoBean(boolean bool){
		TitleInfoBean titleInfo=new TitleInfoBean();
		List<String> l1=new ArrayList<String>();
		l1.add("Q1");
		l1.add("Q2");
		l1.add("Q3");
		if(bool){
			titleInfo.setFileNames(l1);
		}
		titleInfo.setTitleId(1);
		titleInfo.setTitle("Title");
		titleInfo.setUserQ("USER-Q");
		titleInfo.setUserA("userA");
		titleInfo.setContent("contetcontetcontetcontetcontetcontetcontetcontetcontetcontetcontetcontetcontetcontetcontetcontetcontetcontet");
		titleInfo.setStatus("ENTRY");
		titleInfo.setUpdateHMS("12:23:56");
		titleInfo.setUpdateYMD("2015-05-05");
		return titleInfo;
	}
	/* (non-Javadoc)
	 * @see com.my.pro.common.basic.BasicAction#SingleItemCheck()
	 */
	@Override
	public boolean SingleItemCheck(BasicForm form,HttpServletRequest request) {
		// TODO Auto-generated method stub
		return super.SingleItemCheck( form, request);
	}

	/* (non-Javadoc)
	 * @see com.my.pro.common.basic.BasicAction#CompositeItemCheck()
	 */
	@Override
	public boolean CompositeItemCheck(BasicForm form,HttpServletRequest request) {
		// TODO Auto-generated method stub
		return super.CompositeItemCheck( form, request);
	}

	@Override
	public String getForward() {
		// TODO Auto-generated method stub
		return "manager";
	}

}
