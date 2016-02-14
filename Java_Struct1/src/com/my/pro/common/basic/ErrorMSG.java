package com.my.pro.common.basic;

import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.my.pro.common.validate.Validate;

public class ErrorMSG {
	private static ErrorMSG errorMsg=null;
	
	private ActionMessages msg = null;
	
	private ErrorMSG(){
		msg=new ActionMessages();
	}
	
	public static ErrorMSG instance(){
		if(errorMsg==null){
			errorMsg=new ErrorMSG();
		}
		return errorMsg;
	}
	
	public void clear(){
		if(msg!=null){
			msg.clear();
		}
	}
	
	public void addMsg(String key){
		if(Validate.isBlank(key)){
			return;
		}
		ActionMessage error=new ActionMessage(key);
		msg.add(ActionMessages.GLOBAL_MESSAGE, error);
	}
	
	public ActionMessages getActionMessages(){
		return msg;
	}
	
	public boolean isEmpty(){
		if(msg!=null){
			return msg.isEmpty();
		}
		return true;
	}
}
