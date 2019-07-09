package com.woniu.dao;

import java.util.List;

import com.woniu.po.Goods;
import com.woniu.po.PageBean;


public interface IGoodsDAO {

	void save(Goods goods);

	List<Goods> findAll();
	
	List<Goods> findByPage(PageBean pb);

	Goods findOne(int gid);

	void delete(int gid);

	void update(Goods goods);

	List<Goods> findByTid(int tid);
	
}
