package com.qf.springboot1905.springdatajpademo;

import com.qf.entity.Emp;
import com.qf.service.api.IEmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdatajpaDemoApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private IEmpService empService;

	@Test
	public void contextLoads() {
		List<Emp> empList = empService.getEmpList();
		for (Emp emp : empList) {
			System.out.println(emp.toString());
		}
	}
	@Test
	public void test(){
		Set set = new HashSet();
	}
}
