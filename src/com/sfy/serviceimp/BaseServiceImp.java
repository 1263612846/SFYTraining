package com.sfy.serviceimp;

import com.sfy.dao.LoginDao;
import com.sfy.dao.StudentDao;

public class BaseServiceImp {

	protected LoginDao loginDao;

	protected StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

}
