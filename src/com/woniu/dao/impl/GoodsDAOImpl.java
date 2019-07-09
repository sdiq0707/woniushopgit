package com.woniu.dao.impl;


import java.util.List;

import com.woniu.dao.IGoodsDAO;
import com.woniu.po.Goods;
import com.woniu.po.PageBean;
import com.woniu.util.BaseDAO;

public class GoodsDAOImpl implements IGoodsDAO {

	BaseDAO<Goods> bd =
			new BaseDAO<Goods>();
	@Override
	public void save(Goods goods) {
		// TODO Auto-generated method stub
		String sql = "insert into goods values(null,?,?,?,?,?,?,1)";
		Object[] objs = {goods.getGname(),goods.getGprice(),goods.getGstock(),goods.getGphoto(),goods.getGdesc(),goods.getTid()};
		bd.update(sql, objs);
	}
	@Override
	public List<Goods> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from goods";
		Object[] objs = {};
		return bd.select(sql, objs, Goods.class);
	}
	@Override
	public Goods findOne(int gid) {
		// TODO Auto-generated method stub
		String sql = "select * from goods where gid=?";
		Object[] objs = {gid};
		List<Goods> goodsList = bd.select(sql, objs, Goods.class);
		return goodsList.size()==0?null:goodsList.get(0);
	}
	@Override
	public void delete(int gid) {
		// TODO Auto-generated method stub
		String sql = "delete from goods where gid=?";
		Object[] objs = {gid};
		bd.update(sql, objs);
	}
	@Override
	public void update(Goods goods) {
		// TODO Auto-generated method stub
		String sql = "update goods set gname=?,gprice=?,gstock=?,gphoto=?,gdesc=?,tid=?,gdel=? where gid=?";
		Object[] objs = {goods.getGname(),goods.getGprice(),goods.getGstock(),goods.getGphoto(),goods.getGdesc(),goods.getTid(),goods.getGdel(),goods.getGid()};
		bd.update(sql, objs);
	}
	@Override
	public List<Goods> findByPage(PageBean pb) {
		// TODO Auto-generated method stub
		String sql = "select * from goods limit ?,?";
		Object[] objs = {(pb.getPageNum()-1)*pb.getPageRow(),pb.getPageRow()};
		return bd.select(sql, objs, Goods.class);
	}
	@Override
	public List<Goods> findByTid(int tid) {
		// TODO Auto-generated method stub
		String sql = "select * from goods where tid=?";
		Object[] objs = {tid};
		return bd.select(sql, objs, Goods.class);
	}

}
