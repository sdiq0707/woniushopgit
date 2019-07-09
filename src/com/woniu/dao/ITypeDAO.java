package com.woniu.dao;

import java.util.List;

import com.woniu.po.PageBean;
import com.woniu.po.Type;


public interface ITypeDAO {

	void save(Type goodsType);

	List<Type> findAll();
	
	List<Type> findByPage(PageBean pb);

	Type findOne(int tid);

	void delete(int tid);

	void update(Type goodsType);
	
}
