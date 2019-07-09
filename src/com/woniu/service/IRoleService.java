package com.woniu.service;

import java.util.List;

import com.woniu.po.PageBean;
import com.woniu.po.Role;

public interface IRoleService {

	List<Role> findRoleByPage(PageBean pb);

	void addRole(Role role);

	Role findRoleByRid(int rid);

	void delRole(int rid);

	void editRole(Role role);

	void softDel(int rid);

	
}
