package com.woniu.service.impl;

import java.util.List;

import com.woniu.dao.DAOFactory;
import com.woniu.po.Goods;
import com.woniu.po.PageBean;
import com.woniu.service.IGoodsService;

public class GoodsServiceImpl implements IGoodsService {

	@Override
	public void delType(int gid) {
		// TODO Auto-generated method stub
		DAOFactory.getGoodsDAO().delete(gid);
	}

	@Override
	public void softDel(int gid) {
		// TODO Auto-generated method stub
		Goods goods = DAOFactory.getGoodsDAO().findOne(gid);
		goods.setGdel(goods.getGdel()==1?0:1);
		DAOFactory.getGoodsDAO().update(goods);
	}

	@Override
	public List<Goods> findGoodsByPage(PageBean pb) {
		// TODO Auto-generated method stub
		int countRow = DAOFactory.getTypeDAO().findAll().size();
		int countPage = countRow%pb.getPageRow()==0?countRow/pb.getPageRow():countRow/pb.getPageRow()+1;
		pb.setCountRow(countRow);
		pb.setCountPage(countPage==0?1:countPage);
		return DAOFactory.getGoodsDAO().findByPage(pb);
	}

	@Override
	public Goods findGoodsByGid(int gid) {
		// TODO Auto-generated method stub
		return DAOFactory.getGoodsDAO().findOne(gid);
	}

	@Override
	public void addGoods(Goods goods) {
		// TODO Auto-generated method stub
		DAOFactory.getGoodsDAO().save(goods);
	}

	@Override
	public void editGoods(Goods goods) {
		// TODO Auto-generated method stub
		DAOFactory.getGoodsDAO().update(goods);
	}

	@Override
	public List<Goods> getGoodsByTid(int tid) {
		// TODO Auto-generated method stub
		return DAOFactory.getGoodsDAO().findByTid(tid);
	}
	
}
