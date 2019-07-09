package com.woniu.service.impl;

import java.util.List;

import com.woniu.dao.DAOFactory;
import com.woniu.po.PageBean;
import com.woniu.po.Type;
import com.woniu.service.ITypeService;

public class TypeServiceImpl implements ITypeService {

	@Override
	public List<Type> findTypeByPage(PageBean pb) {
		// TODO Auto-generated method stub
		int countRow = DAOFactory.getTypeDAO().findAll().size();
		int countPage = countRow%pb.getPageRow()==0?countRow/pb.getPageRow():countRow/pb.getPageRow()+1;
		pb.setCountRow(countRow);
		pb.setCountPage(countPage==0?1:countPage);
		return DAOFactory.getTypeDAO().findByPage(pb);
	}

	@Override
	public List<Type> findAllTypes() {
		// TODO Auto-generated method stub
		return DAOFactory.getTypeDAO().findAll();
	}

	@Override
	public void addType(Type type) {
		// TODO Auto-generated method stub
		DAOFactory.getTypeDAO().save(type);
	}

	@Override
	public void softDel(int tid) {
		// TODO Auto-generated method stub
		Type type = DAOFactory.getTypeDAO().findOne(tid);
		type.setTdel(type.getTdel()==1?0:1);
		DAOFactory.getTypeDAO().update(type);
	}

	@Override
	public void delType(int tid) {
		// TODO Auto-generated method stub
		DAOFactory.getTypeDAO().delete(tid);
	}

	@Override
	public void editType(Type type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Type findTypeByTid(int tid) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
