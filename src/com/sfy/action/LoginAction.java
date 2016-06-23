package com.sfy.action;

public class LoginAction extends BaseAction {

	public String login() {
		id = loginService.getId(username);
		name = loginService.getName(username);
		return loginService.login(super.si());
	}

	public String info() {
		info = loginService.getInfo(id);
		return "info";
	}

	public String viewEdit() {
		info = loginService.getInfo(id);
		return "edit";
	}

	public String edit() {
		loginService.editInfo(super.si());
		info = loginService.getInfo(id);
		return "info";
	}

	public String reg() {
		result = loginService.reg(super.si());
		return "result";
	}

	public String viewEditPassword() {
		return "password";
	}

	public String editPassword() {
		result = loginService.editPassword(id, password);
		return "result";
	}

	public String list() {
		list = loginService.getList();
		return "list";
	}

	public String delete() {
		loginService.delete(id);
		list = loginService.getList();
		return "list";
	}

}
