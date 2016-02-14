package com.my.pro.common.web.control.helper;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionMessages;

import com.my.pro.common.basic.ErrorMSG;
import com.my.pro.common.constant.Constant;
import com.my.pro.common.web.session.UserSession;
import com.my.pro.sql.helper.SQLHelper;

/**
 * Helper Class
 * @author tin
 *
 */
public class WebControlHelper {
	
	/**
	 * @return the ActionMessages
	 */
	public static ActionMessages getErr() {
		return ErrorMSG.instance().getActionMessages();
	}

	/**
	 * @return the SQLHelper
	 */
	public static SQLHelper getSQLHelepr(){
		return SQLHelper.inistance();
	}
	
	public static UserSession getUserSession(HttpServletRequest request){
		Object obj=request.getSession().getAttribute(Constant.UO_S_KEY);
		UserSession user;
		if(obj==null){
			user=new UserSession();
			user.reset();
			request.getSession().setAttribute(Constant.UO_S_KEY, user);
		}else{
			try{
				user=(UserSession) obj;
			}catch(Exception e){
				request.getSession().removeAttribute(Constant.UO_S_KEY);
				user=new UserSession();
				user.reset();
				request.getSession().setAttribute(Constant.UO_S_KEY, user);
			}
			
		}
		return user;
	}
	
	public static void resetUserSession(HttpServletRequest request){
		getUserSession(request);
		request.getSession().removeAttribute(Constant.UO_S_KEY);
		getUserSession(request);
	}
}
