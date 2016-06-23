package com.sfy.service;

import java.util.List;
import java.util.Map;

import com.sfy.bean.StudentInfo;

public interface LoginService {

	String login(StudentInfo si);

	int getId(String username);

	Map<String, Object> getInfo(int id);

	void editInfo(StudentInfo si);

	String reg(StudentInfo si);

	String editPassword(int id, String password);

	List<Map<String, Object>> getList();

	void delete(int id);

	String getName(String username);

}
