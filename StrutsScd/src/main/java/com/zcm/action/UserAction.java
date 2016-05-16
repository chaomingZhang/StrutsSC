package com.zcm.action;

import javax.annotation.Resource;
import javax.annotation.Resources;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value="struts-default")
@Namespace(value="/shop")
@Actions({
	@Action(value="shop/user1"),
	@Action(value="shop/user2")
	
	
})
@Results({
	@Result(name="success" ,location="/success.jsp"),
	@Result(name="show" ,location="/show.jsp")
})
public class UserAction {
	public String add() throws Exception {
		// TODO Auto-generated method stub
		return "success";
	}
	public String del() throws Exception {
		// TODO Auto-generated method stub
		return "show";
	}

}
