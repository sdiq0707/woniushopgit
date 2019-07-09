package com.woniu.service;

import java.util.List;

import com.woniu.po.Goods;
import com.woniu.po.PageBean;

public interface IGoodsService {

	void delType(int gid);

	void softDel(int gid);

	Goods findGoodsByGid(int gid);

	List<Goods> findGoodsByPage(PageBean pb);

	void addGoods(Goods goods);

	void editGoods(Goods goods);

	List<Goods> getGoodsByTid(int tid);


	
}
