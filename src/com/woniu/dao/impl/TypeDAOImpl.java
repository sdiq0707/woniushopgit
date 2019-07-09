package com.woniu.dao.impl;


import java.util.List;

import com.woniu.dao.ITypeDAO;
import com.woniu.po.PageBean;
import com.woniu.po.Type;
import com.woniu.util.BaseDAO;

public class TypeDAOImpl implements ITypeDAO {

	BaseDAO<Type> bd = new BaseDAO<Type>();
	@Override
	public void save(Type goodsType) {
		// TODO Auto-generated method stub
		String sql = "insert into goodstype values(null,?,?,?,0,1)";
		Object[] objs = {goodsType.getTname(),goodsType.getTphoto(),goodsType.getTdesc()};
		bd.update(sql, objs);
	}
	@Override
	public List<Type> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from goodstype";
		Object[] objs = {};
		return bd.select(sql, objs, Type.class);
	}
	@Override
	public Type findOne(int tid) {
		// TODO Auto-generated method stub
		String sql = "select * from goodstype where tid=?";
		Object[] objs = {tid};
		List<Type> types =  bd.select(sql, objs, Type.class);
		return types.size()==0?null:types.get(0);
	}
	@Override
	public void delete(int tid) {
		// TODO Auto-generated method stub
		String sql = "delete from goodstype where tid=?";
		Object[] objs = {tid};
		bd.update(sql, objs);
	}
	@Override
	public void update(Type goodsType) {
		// TODO Auto-generated method stub
		String sql = "update goodstype set tname=?,tphoto=?,tdesc=?,tqzid=?,tdel=? where tid=?";
		Object[] objs = {goodsType.getTname(),goodsType.getTphoto(),goodsType.getTdesc(),goodsType.getTqzid(),goodsType.getTdel(),goodsType.getTid()};
		bd.update(sql, objs);
	}
	@Override
	public List<Type> findByPage(PageBean pb) {
		// TODO Auto-generated method stub
		String sql = "select * from goodstype limit ?,?";
		Object[] objs = {(pb.getPageNum()-1)*pb.getPageRow(),pb.getPageRow()};
		return bd.select(sql, objs, Type.class);
	}

}
