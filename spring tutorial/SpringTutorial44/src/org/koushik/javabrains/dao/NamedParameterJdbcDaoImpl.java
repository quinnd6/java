package org.koushik.javabrains.dao;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

public class NamedParameterJdbcDaoImpl extends NamedParameterJdbcDaoSupport {

	public int getCircleCount(){
		String sql = "SELECT COUNT(*) FROM circle";
		return this.getJdbcTemplate().queryForObject(sql, Integer.class);
	}
}
