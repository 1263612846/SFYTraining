package com.sfy.daoimp;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDaoImp {

	protected JdbcTemplate jt;

	public JdbcTemplate getJdbcTemplate() {
		return jt;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jt = jdbcTemplate;
	}

}
