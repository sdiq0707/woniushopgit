package com.woniu.service;

import com.woniu.service.impl.GoodsServiceImpl;
import com.woniu.service.impl.RoleServiceImpl;
import com.woniu.service.impl.TypeServiceImpl;

public class ServiceFactory {

	public static IGoodsService getGoodsService(){
		return new GoodsServiceImpl();
	}
	
	public static ITypeService getTypeService(){
		return new TypeServiceImpl();
	}
	
	public static IRoleService getRoleService(){
		return new RoleServiceImpl();
	}
	
	
}
