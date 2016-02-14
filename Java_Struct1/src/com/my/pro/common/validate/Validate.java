package com.my.pro.common.validate;

public class Validate {
	private final static String BLANK="";
	
	public static boolean isBlank(String arge){
		if(null==arge || BLANK.equals(arge.trim())){
			return true;
		}
		return false;
	}
	
	
}
