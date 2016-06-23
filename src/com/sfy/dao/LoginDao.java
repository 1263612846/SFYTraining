package com.sfy.dao;

import java.util.List;
import java.util.Map;

import com.sfy.bean.StudentInfo;

public interface LoginDao {

	public String login(StudentInfo si);

	public int getId(String username);

	public Map<String, Object> getInfo(int id);

	public void editInfo(StudentInfo si);

	public String reg(String username, String password);

	public String editPassword(int id, String password);

	public List<Map<String, Object>> getList();

	public void delete(int id);

	public String getName(String username);

	public void delete(String username);

}
