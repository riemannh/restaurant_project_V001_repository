package com.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	private String edcoding = null;
	private FilterConfig filterConfig = null;
	private boolean ignore = true;

	public void destroy() {
		edcoding = null;
		filterConfig = null;
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filterChain) throws IOException, ServletException {
		if (ignore == true || request.getCharacterEncoding() == null) {
			String encoding = setCharacterEncoding(request);
			if (encoding != null) {
				request.setCharacterEncoding(encoding);

			}
		}
		filterChain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		this.edcoding = filterConfig.getInitParameter("encoding");
		String value = filterConfig.getInitParameter("ignore");
		if (value == null) {
			this.ignore = true;
		} else if (value.equalsIgnoreCase("true")) {
			this.ignore = true;

		} else {
			this.ignore = false;
		}

	}

	public String setCharacterEncoding(ServletRequest request) {
		return this.edcoding;
	}
}
