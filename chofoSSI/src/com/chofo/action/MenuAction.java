package com.chofo.action;

import java.util.List;
import com.chofo.service.MenuService;
import com.chofo.vo.MenuVO;

public class MenuAction 
{
	private MenuVO menuVO;
	
	private List<MenuVO> menulist;
	
	private MenuService menuService;
	
	public String initMenu()
	{
		MenuVO menuVO = new MenuVO();
		menulist = getMenuService().getMenuList(menuVO);
		return "menulist";
	}
		
	
	public MenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	public List<MenuVO> getMenulist() {
		return menulist;
	}

	public void setMenulist(List<MenuVO> menulist) {
		this.menulist = menulist;
	}

	public MenuVO getMenuVO() {
		return menuVO;
	}

	public void setMenuVO(MenuVO menuVO) {
		this.menuVO = menuVO;
	}

}
