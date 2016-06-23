package com.sfy.action;

import java.util.List;
import java.util.Map;

import com.sfy.bean.StudentInfo;
import com.sfy.service.LoginService;
import com.sfy.service.StudentService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class BaseAction extends StudentInfo {

	protected String result;
	protected String json;
	protected String password1;
	protected Map<String, Object> info;
	protected List<Map<String, Object>> list;
	protected JSONObject jo;
	protected JSONArray ja;

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	public JSONObject getJo() {
		return jo;
	}

	public void setJo(JSONObject jo) {
		this.jo = jo;
	}

	public JSONArray getJa() {
		return ja;
	}

	public void setJa(JSONArray ja) {
		this.ja = ja;
	}

	public List<Map<String, Object>> getList() {
		return list;
	}

	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public Map<String, Object> getInfo() {
		return info;
	}

	public void setInfo(Map<String, Object> info) {
		this.info = info;
	}

	protected LoginService loginService;

	protected StudentService studentService;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	protected StudentInfo si() {
		StudentInfo si = new StudentInfo();
		si.setId(id);
		si.setNum(num);
		si.setName(name);
		si.setAge(age);
		si.setSex(sex);
		si.setMajor(major);
		si.setSchool(school);
		si.setUsername(username);
		si.setPassword(password);
		return si;
	}

}
