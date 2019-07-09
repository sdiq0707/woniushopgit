package com.woniu.dao;

import com.woniu.dao.impl.GoodsDAOImpl;
import com.woniu.dao.impl.RoleDAOImpl;
import com.woniu.dao.impl.TypeDAOImpl;

public class DAOFactory {

	public static IGoodsDAO getGoodsDAO(){
		return new GoodsDAOImpl();
	}
	
	public static ITypeDAO getTypeDAO(){
		return new TypeDAOImpl();
	}
	
	public static IRoleDAO getRoleDAO(){
		return new RoleDAOImpl();
	}
	
}
