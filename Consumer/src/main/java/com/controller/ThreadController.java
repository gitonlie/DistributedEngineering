package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.entity.User;
import com.service.IQueryUserService;
import com.service.IUserService;

@Controller
public class ThreadController extends BaseController{
	@Autowired
	private IUserService service;
	@Autowired
	private IQueryUserService queryService;
	@RequestMapping(value="/add")
	@ResponseBody
	public String testAddUser() throws Exception{
		User user = new User();
		user.setName("mik");
		service.addUserInfo(user);
		return "添加成功";
	}
	@RequestMapping(value="/hessian")
	@ResponseBody
	public String testDubboHessian(){
		User user = new User();
		user.setId(20L);
		User queryUser = queryService.queryUserInfo(user);
		return "dubbo+hessian协议共存操作成功"+queryUser.getName();		
	}
}
