package com.woniu.service.impl;

import java.util.List;

import com.woniu.dao.DAOFactory;
import com.woniu.po.PageBean;
import com.woniu.po.Role;
import com.woniu.service.IRoleService;

public class RoleServiceImpl implements IRoleService {

	@Override
	public List<Role> findRoleByPage(PageBean pb) {
		// TODO Auto-generated method stub
		int countRow = DAOFactory.getRoleDAO().findAll().size();
		int countPage = countRow%pb.getPageRow()==0?countRow/pb.getPageRow():countRow/pb.getPageRow()+1;
		pb.setCountRow(countRow);
		pb.setCountPage(countPage==0?1:countPage);
		return DAOFactory.getRoleDAO().findByPage(pb);
	}

	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		DAOFactory.getRoleDAO().save(role);
	}

	@Override
	public Role findRoleByRid(int rid) {
		// TODO Auto-generated method stub
		return DAOFactory.getRoleDAO().findOne(rid);
	}

	@Override
	public void delRole(int rid) {
		// TODO Auto-generated method stub
		DAOFactory.getRoleDAO().delete(rid);
	}

	@Override
	public void editRole(Role role) {
		// TODO Auto-generated method stub
		DAOFactory.getRoleDAO().update(role);
	}

	@Override
	public void softDel(int rid) {
		// TODO Auto-generated method stub
		Role role = DAOFactory.getRoleDAO().findOne(rid);
		role.setRdel(role.getRdel()==1?0:1);
		DAOFactory.getRoleDAO().update(role);
	}

	
}
