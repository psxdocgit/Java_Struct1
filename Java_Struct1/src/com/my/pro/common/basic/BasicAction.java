package com.my.pro.common.basic;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.my.pro.common.constant.Constant;
import com.my.pro.common.validate.Validate;
import com.my.pro.page.register.ReplyRegister;

/**
 * @author tin
 *
 */
public abstract class BasicAction extends Action implements BasicInterface {

	private ReplyBean reply = null;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// message clear.
		ErrorMSG.instance().clear();
		// Action ID
		int actionid = 0;

		try {
			BasicForm basicForm=(BasicForm) form;
			actionid = basicForm.getActionId();
			// call method by actionid
			switch (actionid) {
			case Constant.ACTION_AJAX:
				doAjax((BasicForm) form, request, response);
				return null;
			case Constant.ACTION_COMMIT:
				// error
				if (!check( basicForm, request)) {
					reply = doCommit(basicForm, request);
				}
				break;
			case Constant.ACTION_INIT:
				reply = doInit(basicForm,request);
				break;
			default:
				break;
			}
			
			if(reply==null){
				reply=new ReplyBean();
			}
			reply.setForward(getForward(mapping));
			
			request.setAttribute("reply", reply);
			

			//Check error
			if (!ErrorMSG.instance().isEmpty()) {
				this.saveMessages(request, ErrorMSG.instance().getActionMessages());
				System.out.println("#forward:" + mapping.getInput());
				return mapping.findForward(mapping.getInput());
			}

			System.out.println("#forward:" + reply.getForward());
			return mapping.findForward(reply.getForward());

		} catch (Exception ex) {
			System.out.println("#forward:" + mapping.getInput());
			return mapping.findForward(mapping.getInput());
		}

	}

	public void doAjax(BasicForm form,HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}

	public ReplyBean doInit(BasicForm form, HttpServletRequest request) {
		return null;
	}

	/**
	 * check
	 * 
	 * @return
	 */
	private boolean check(BasicForm form,HttpServletRequest request) {
		if (SingleItemCheck( form, request)) {
			return true;
		} else {
			return CompositeItemCheck( form, request);
		}
	}

	/* 
	 * items have errro:true
	 * @see com.my.pro.common.basic.BasicInterface#SingleItemCheck(com.my.pro.common.basic.BasicForm, javax.servlet.http.HttpServletRequest)
	 */
	public boolean SingleItemCheck(BasicForm form,HttpServletRequest request) {
		return false;
	}

	/* 
	 * items have errro:true
	 * @see com.my.pro.common.basic.BasicInterface#CompositeItemCheck(com.my.pro.common.basic.BasicForm, javax.servlet.http.HttpServletRequest)
	 */
	public boolean CompositeItemCheck(BasicForm form,HttpServletRequest request) {
		return false;
	}

	public ReplyBean doCommit(BasicForm form, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	private String getForward(ActionMapping mapping) throws Exception{
		String forward="";
		forward=Validate.isBlank(getForward())?mapping.getInput():getForward();
		//forward 
		if (!Arrays.asList(Constant.FORWARDS).contains(forward)) {
			// error
			throw new Exception();
		}
		return forward;
	}
	
	public abstract String getForward();
}
