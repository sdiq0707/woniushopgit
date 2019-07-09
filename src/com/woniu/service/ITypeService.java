package com.woniu.service;

import java.util.List;

import com.woniu.po.PageBean;
import com.woniu.po.Type;

public interface ITypeService {

	List<Type> findTypeByPage(PageBean pb);

	List<Type> findAllTypes();

	void addType(Type type);

	void softDel(int tid);

	void delType(int tid);

	void editType(Type type);

	Type findTypeByTid(int tid);

}
