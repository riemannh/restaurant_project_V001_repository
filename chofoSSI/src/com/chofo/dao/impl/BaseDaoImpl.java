package com.chofo.dao.impl;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

public class BaseDaoImpl {
	/** ʹ��Spring�ṩ��SqlMapClientTemplate */
	private SqlMapClientTemplate sqlMapClientTemplate;

	public SqlMapClientTemplate getSqlMapClientTemplate() {
		return sqlMapClientTemplate;
	}

	public void setSqlMapClientTemplate(
			SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}
}
