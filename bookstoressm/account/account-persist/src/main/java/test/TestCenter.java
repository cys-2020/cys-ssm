package test;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mybatis.spring.SqlSessionTemplate;

import static 
	org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import  static 
	org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static 
	org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.InternalResourceView;


import configs.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=WebmvcRootConfigs.class)

public class TestCenter {
	/*@Autowired
	private RoleService roleService;
	@Autowired
	private StudentService service;
	
	@Test
	public void test() {
		ControllerTest con=new ControllerTest(service);
		MockMvc mockmvc=standaloneSetup(con).setSingleView(
				new InternalResourceView("/resources/shuoshuos.html")).build();
		try {
			mockmvc.perform(get("/getStudent?id=2"));
		} catch (Exception e) {
			System.err.println("ÇëÇóÊ§°Ü£¡£¡£¡");
		}
	}*/
	/*
	@Test
	public void testConfig() {
		AnnotationConfigApplicationContext ac=
				new AnnotationConfigApplicationContext(WebmvcRootConfigs.class);
		//System.err.println("ÓÐÃ»ÓÐDAObean"+ac.getBean(StudentDAO.class));
		System.err.println("ÓÐÃ»ÓÐService bean"+(ac.getBean(StudentService.class)!=null));
		System.err.println();
	}
	@Test
	public void test1() {
		FirstController con=new FirstController(roleService);
		MockMvc mockmvc=standaloneSetup(con).setSingleView(
				new InternalResourceView("/resources/shuoshuos.html")).build();
		try {
			mockmvc.perform(get("/insertRole"));
		} catch (Exception e) {
			System.err.println("ÇëÇóÊ§°Ü£¡£¡£¡");
		}
	}
	
	@Test
	public void testMyTransaction() {
		MybatisTransactionController con=new MybatisTransactionController();
		MockMvc mockmvc=standaloneSetup(con).setSingleView(
				new InternalResourceView("/resources/shuoshuos.html")).build();
		try {
			mockmvc.perform(get("/insertMyrole"));
		} catch (Exception e) {
			System.err.println("ÇëÇóÊ§°Ü£¡£¡£¡");
		}
	}
	//@Test
	public void clearRole() {
		MybatisTransactionController con=new MybatisTransactionController();
		MockMvc mockmvc=standaloneSetup(con).setSingleView(
				new InternalResourceView("/resources/shuoshuos.html")).build();
		try {
			mockmvc.perform(get("/clearMyrole"));
		} catch (Exception e) {
			System.err.println("ÇëÇóÊ§°Ü£¡£¡£¡");
		}
	}*/
}
