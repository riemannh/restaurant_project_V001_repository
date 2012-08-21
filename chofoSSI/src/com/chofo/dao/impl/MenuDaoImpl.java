package com.chofo.dao.impl;

import java.util.List;

import com.chofo.dao.MenuDao;
import com.chofo.vo.MenuVO;

public class MenuDaoImpl extends BaseDaoImpl implements MenuDao 
{

	@SuppressWarnings("unchecked")
	public List<MenuVO> getMenuList(MenuVO menuVO) 
	{
        return getSqlMapClientTemplate().queryForList("MenuSQL.getMenuList", menuVO);
	}
	
}
