package com.chofo.service.impl;

import java.util.List;

import com.chofo.dao.MenuDao;
import com.chofo.service.MenuService;
import com.chofo.vo.MenuVO;

public class MenuServiceImpl implements MenuService
{
    public MenuDao menuDao;
	public List<MenuVO> getMenuList(MenuVO menuVO) {
		// TODO Auto-generated method stub
		return menuDao.getMenuList(menuVO);
	}
	public MenuDao getMenuDao() {
		return menuDao;
	}
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}
	
}
