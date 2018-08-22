package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.entity.User;
import com.service.IQueryUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=false)
@Transactional
public class TestService {
	@Autowired
	IQueryUserService service;
	@Test
	public void service(){
		User queryUser = new User();
		queryUser.setId(15L);
		User user = service.queryUserInfo(queryUser);
		System.out.println(user.getName());
	}
}
