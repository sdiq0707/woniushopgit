package com.woniu.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

	public static String md5(String str){
		try {
			//获得MessageDigest对象
			MessageDigest md = MessageDigest.getInstance("md5");
			//进行转码
			md.update(str.getBytes());
			//获得转码后的字节数组
			byte[] bs = md.digest();
			StringBuffer strB = new StringBuffer();
			for(int i=0;i<bs.length;i++){
				int n =bs[i];
				//获得反码
				if(n<0) n+=256;
				if(n<16) strB.append("0");
				strB.append(Integer.toHexString(n));
			}
			return strB.toString();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	
	public static void main(String[] args) {
		System.out.println(md5("123"));
	}
	
}
