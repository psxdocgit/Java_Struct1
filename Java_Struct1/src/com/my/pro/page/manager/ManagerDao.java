package com.my.pro.page.manager;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tin
 *
 */
public class ManagerDao {
	//\n
	private static final String LF="\n";
	private static final String SQL="";
	
	private static final String MANAGER_SQL="SELECT " + LF
			+ "" + LF
			+ "" + LF
			+ "" + LF
			+ "" + LF
			+ "" + LF
			+ "" + LF
			+ "" + LF;
	
	ManagerDao(){	
	}

	private String queryByID(){
		return "AND ID=?";
	}
	
	private String queryByRank(){
		return "AND ID=?";
	}
	
	/**
	 * 
	 * @return
	 */
	public List query(ManagerForm from){
		List list=new ArrayList();
		
		return list;
		
	}
}
