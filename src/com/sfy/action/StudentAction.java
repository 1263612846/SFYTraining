package com.sfy.action;

import com.opensymphony.xwork2.Action;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class StudentAction extends BaseAction {

	public String test() {

		/*
		 * HttpServletResponse response = ServletActionContext.getResponse();
		 * PrintWriter writer = response.getWriter();
		 * writer.print(jo);
		 * writer.flush();
		 */

		info = studentService.test(username);
		json = JSONObject.fromObject(info).toString();

		return Action.SUCCESS;
	}

	public String test1() {

		/*
		 * HttpServletResponse response = ServletActionContext.getResponse();
		 * PrintWriter writer = response.getWriter();
		 * writer.print(ja);
		 * writer.flush();
		 */

		list = studentService.test1();
		json = JSONArray.fromObject(list).toString();

		return Action.SUCCESS;
	}

}
