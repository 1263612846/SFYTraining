package com.sfy.daoimp;

import java.util.List;
import java.util.Map;

import com.sfy.bean.StudentInfo;
import com.sfy.dao.LoginDao;

public class LoginDaoImp extends BaseDaoImp implements LoginDao {

	@Override
	public String login(StudentInfo si) {
		String sql = "select password from student where username=?";

		try {
			String password = jt.queryForObject(sql, new Object[] { si.getUsername() }, String.class);
			if (password.equals(si.getPassword())) {
				return "success";
			} else {
				return "fail";
			}
		} catch (Exception e) {
			return "fail";
		}

	}

	@Override
	public int getId(String username) {
		String sql = "select id from student where username=?";

		try {
			return jt.queryForObject(sql, new Object[] { username }, int.class);
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public Map<String, Object> getInfo(int id) {
		String sql = "select * from student where id=?";

		return jt.queryForMap(sql, new Object[] { id });
	}

	@Override
	public void editInfo(StudentInfo si) {
		String sql = "update student set num=?,name=?,age=?,sex=?,school=?,major=? where id=?";

		jt.update(sql, new Object[] { si.getNum(), si.getName(), si.getAge(), si.getSex(), si.getSchool(),
				si.getMajor(), si.getId() });
	}

	@Override
	public String reg(String username, String password) {
		String sql1 = "select id from student where username=?";
		String sql2 = "insert into student(username,password,regtime) values(?,?,now())";

		try {
			jt.queryForObject(sql1, new Object[] { username }, int.class);
			return "该用户名已被占用，请更换用户名，重新注册。";
		} catch (Exception e) {
			try {
				jt.update(sql2, new Object[] { username, password });
				return "注册成功！";
			} catch (Exception e1) {
				return "注册失败。。。";
			}
		}

	}

	@Override
	public String editPassword(int id, String password) {
		String sql = "update student set password=? where id=?";

		try {
			jt.update(sql, new Object[] { password, id });
			return "修改成功！";
		} catch (Exception e) {
			return "修改失败。。。";
		}
	}

	@Override
	public List<Map<String, Object>> getList() {
		String sql = "select id,num,name,age,sex,school,major,username,regtime from student";

		return jt.queryForList(sql);
	}

	@Override
	public void delete(int id) {
		String sql = "delete from student where id=?";
		jt.update(sql, new Object[] { id });
	}

	@Override
	public String getName(String username) {
		String sql = "select name from student where username=?";

		try {
			return jt.queryForObject(sql, new Object[] { username }, String.class);
		} catch (Exception e) {
			return "";
		}

	}

	@Override
	public void delete(String username) {
		String sql = "delete from student where username=?";
		jt.update(sql, new Object[] { username });
	}

}
