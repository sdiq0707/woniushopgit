package com.woniu.dao.impl;


import java.util.List;

import com.woniu.dao.IRoleDAO;
import com.woniu.po.Role;
import com.woniu.po.PageBean;
import com.woniu.util.BaseDAO;

public class RoleDAOImpl implements IRoleDAO {

	BaseDAO<Role> bd = new BaseDAO<Role>();
	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub
		String sql = "insert into role values(null,?,?)";
		Object[] objs = {role.getRname(),role.getRdel()};
		bd.update(sql, objs);
	}
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from role";
		Object[] objs = {};
		return bd.select(sql, objs, Role.class);
	}
	@Override
	public List<Role> findByPage(PageBean pb) {
		// TODO Auto-generated method stub
		String sql = "select * from role limit ?,?";
		Object[] objs = {(pb.getPageNum()-1)*pb.getPageRow(),pb.getPageRow()};
		return bd.select(sql, objs, Role.class);
	}
	@Override
	public Role findOne(int rid) {
		// TODO Auto-generated method stub
		String sql = "select * from role where rid=?";
		Object[] objs = {rid};
		List<Role> RoleList = bd.select(sql, objs, Role.class);
		return RoleList.size()==0?null:RoleList.get(0);
	}
	@Override
	public void delete(int rid) {
		// TODO Auto-generated method stub
		String sql = "delete from role where rid=?";
		Object[] objs = {rid};
		bd.update(sql, objs);
	}
	@Override
	public void update(Role role) {
		// TODO Auto-generated method stub
		String sql = "update role set rname=?,rdel=? where rid=?";
		Object[] objs = {role.getRname(),role.getRdel(),role.getRid()};
		bd.update(sql, objs);
	}

}
