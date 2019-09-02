package com.hezi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hezi.controller.App;
import com.hezi.serviceImpl.userServiceimpl;
/**
 *@RunWith:启动器
 *SpringJUnit4ClassRunner.class:让spring环境与junit整合
 *
 *@SpringBootTest(classes= {App.class}):1.当前类为springboot测试类
 *@SpringBootTest(classes= {App.class}):2.加载springboot启动类，启动springboot
 *
 *junit与spring整合时注解：@ContextConfiguration("classpath:applicationContext.xml")
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= {App.class})
public class test {
	@Autowired
	private userServiceimpl userserviceimpl;
  @Test
  public void test() {
	 this.userserviceimpl.saveUser();
  }
}
