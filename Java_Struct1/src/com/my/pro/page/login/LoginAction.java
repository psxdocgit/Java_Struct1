package com.my.pro.page.login;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.pro.common.basic.BasicAction;
import com.my.pro.common.basic.BasicForm;
import com.my.pro.common.basic.ReplyBean;
import com.my.pro.common.constant.Constant;
import com.my.pro.common.web.control.helper.WebControlHelper;
import com.my.pro.page.register.ReplyRegister;
import com.my.pro.sql.helper.SQLHelper;

public class LoginAction extends BasicAction {
	
	private final String LN = "\n";
	@Override
	public void doAjax(BasicForm form,HttpServletRequest request,HttpServletResponse response) {
		boolean loginFlg=false;
		LoginForm loginForm=(LoginForm) form;
		//Login Out
		if(!"login".equals(loginForm.getActionName())){
			//Login Out
			WebControlHelper.resetUserSession(request);
		}else{
			//Login In
			LoginForm bean=(LoginForm) form;
			String sql="select userid" + LN
					+ ",name         " + LN
					+ ",pwd          " + LN
					+ ",rank         " + LN
					+ ",validate     " + LN
					+ "from passinfo " + LN
					+ "where 1=1     " + LN
					+ "and pwd='"+ bean.getPwd().trim() + "'     " + LN
					+ "and name='"+ bean.getName().trim() +"'    " + LN
					+ "order by userid";
			
			ResultSet rs=SQLHelper.inistance().query(sql);
			
			
			int userid=0;
			int rank=-1;
			
			//Create Session
			try {
				if(rs.next()){
					userid=rs.getInt(1);
					rank=rs.getInt(4);
					if(!rs.next()){
						loginFlg=true;
					}
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			SQLHelper.inistance().close();

		}
		
		WebControlHelper.getUserSession(request).setLoginFlg(loginFlg);
		
		String json="{" + "\"" + "loginFlg" + "\"" + ":" + "\"" + (loginFlg?1:0) + "\"" + "}";
		System.out.println("json string =" + json);
		try {
			response.getWriter().write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ReplyBean doInit(BasicForm form,HttpServletRequest request) {
		ReplyRegister reply=new ReplyRegister();
		return reply;
	}

	@Override
	public String getForward() {
		// TODO Auto-generated method stub
		return "login";
	}
	
	
}
