package com.sfy.serviceimp;

import java.util.List;
import java.util.Map;

import com.sfy.bean.StudentInfo;
import com.sfy.service.LoginService;

public class LoginServiceImp extends BaseServiceImp implements LoginService {

	@Override
	public String login(StudentInfo si) {
		return loginDao.login(si);
	}

	@Override
	public int getId(String username) {
		return loginDao.getId(username);
	}

	@Override
	public Map<String, Object> getInfo(int id) {
		return loginDao.getInfo(id);
	}

	@Override
	public void editInfo(StudentInfo si) {
		loginDao.editInfo(si);
	}

	@Override
	public String reg(StudentInfo si) {
//		loginDao.delete(si.getUsername());
		return loginDao.reg(si.getUsername(), si.getPassword());
	}

	@Override
	public String editPassword(int id, String password) {
		return loginDao.editPassword(id, password);
	}

	@Override
	public List<Map<String, Object>> getList() {
		return loginDao.getList();
	}

	@Override
	public void delete(int id) {
		loginDao.delete(id);
	}

	@Override
	public String getName(String username) {
		return loginDao.getName(username);
	}

}
