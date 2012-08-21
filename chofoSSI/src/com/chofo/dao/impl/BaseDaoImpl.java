package com.chofo.dao.impl;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

public class BaseDaoImpl {
	/** 使用Spring提供的SqlMapClientTemplate */
	private SqlMapClientTemplate sqlMapClientTemplate;

	public SqlMapClientTemplate getSqlMapClientTemplate() {
		return sqlMapClientTemplate;
	}

	public void setSqlMapClientTemplate(
			SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}
}
