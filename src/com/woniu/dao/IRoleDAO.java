package com.woniu.dao;

import java.util.List;

import com.woniu.po.Role;
import com.woniu.po.PageBean;


public interface IRoleDAO {

	void save(Role role);

	List<Role> findAll();
	
	List<Role> findByPage(PageBean pb);

	Role findOne(int rid);

	void delete(int rid);

	void update(Role role);
	
}
