package com.example.demo;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.user.entity.User;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

	/*@Test
	public void contextLoads() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		User user = (User) bf.getBean("user");
		System.out.println();
	}*/
	@Test
	public void testGC() {
		List<Object> list = new ArrayList<>();
		while(true) {
			list.add(new Object());
		}
	}

}
