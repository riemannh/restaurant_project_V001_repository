package com.chofo.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.chofo.vo.UserVO;

public class LoginAction 
{
	public UserVO getUser() {
		return user;
	}

	public void setUser(UserVO user) {
		this.user = user;
	}

	private UserVO user;
	
	public String login()
	{
		UserVO userVO = this.getUser();
		if(userVO.getUsername().equals("AAA")&&userVO.getPassword().equals("sss"))
		{
			return "worktable";
		}
		else 
		{
			HttpServletRequest request = ServletActionContext.getRequest(); 	
			request.setAttribute("msg", "”√ªß√˚√‹¬Î¥ÌŒÛ");
			return "login";
		}
	}

}
