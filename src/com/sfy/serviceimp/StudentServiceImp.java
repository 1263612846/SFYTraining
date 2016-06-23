package com.sfy.serviceimp;

import java.util.List;
import java.util.Map;

import com.sfy.service.StudentService;

public class StudentServiceImp extends BaseServiceImp implements StudentService {

	@Override
	public Map<String, Object> test(String username) {
		return studentDao.test(username);
	}

	@Override
	public List<Map<String, Object>> test1() {
		return studentDao.test1();
	}

}
