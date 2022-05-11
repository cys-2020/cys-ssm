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
import controller.TestController;
import service.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=WebmvcRootConfigs.class)

public class TestCenter {
	@Autowired
	private ChatService chatService;
	
	//@Test
	public void updateChat() throws Exception {
		TestController con=new TestController(chatService);
		MockMvc mockmvc=standaloneSetup(con).setSingleView(
				new InternalResourceView("/resources/shuoshuos.html")).build();
		
			mockmvc.perform(get("/updateChat?s=t[[你好我是田壮壮a[[提张图d[[2022/5/11 16:18"));
	}
	
	@Test
	public void deleteChat() throws Exception {
		TestController con=new TestController(chatService);
		MockMvc mockmvc=standaloneSetup(con).setSingleView(
				new InternalResourceView("/resources/shuoshuos.html")).build();
		
			mockmvc.perform(get("/deleteChat?s=t[[你好我是田壮壮a[[提张图d[[2022/5/11 16:18"));
	}
	
	//@Test
	public void selectChat() throws Exception {
		TestController con=new TestController(chatService);
		MockMvc mockmvc=standaloneSetup(con).setSingleView(
				new InternalResourceView("/resources/shuoshuos.html")).build();
			mockmvc.perform(get("/getChat?userId=2&targetUserid=1"));
	}
}
