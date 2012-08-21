package com.chofo.dao;

import java.util.List;

import com.chofo.vo.MenuVO;

public interface MenuDao
{
	public List<MenuVO> getMenuList(MenuVO menuVO);
}
