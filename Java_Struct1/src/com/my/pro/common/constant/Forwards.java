package com.my.pro.common.constant;

public enum Forwards {
	 INDEX("index")
	,MANAGER("manager")
	,MANAGERCREATE("managercreate")
	,LOGIN("login")
	,REGISTER("register")
	;	
	
	private final String value;
	
	private Forwards(String value){
		this.value = value;
	}
	
	 public String getValue() {
         return value;
     }
}
