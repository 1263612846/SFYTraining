package com.sfy.daoimp;

import java.util.List;
import java.util.Map;

import com.sfy.dao.StudentDao;

public class StudentDaoImp extends BaseDaoImp implements StudentDao {

	@Override
	public Map<String, Object> test(String username) {
		String sql = "select * from student where username=?";
		return jt.queryForMap(sql, new Object[] { username });
	}

	@Override
	public List<Map<String, Object>> test1() {
		String sql = "select * from student";
		return jt.queryForList(sql);
	}

}
