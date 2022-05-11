package controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import publicpojos.*;
import service.*;
@Controller
public class TestController {
	private ChatService chatService;
	@Autowired
	public TestController(ChatService chatService) {
		super();
		this.chatService = chatService;
	}
	public void prettyPrint() {
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			
		}
		System.out.println("******************************************");
	}
	@RequestMapping(value="/getChat",method=RequestMethod.GET)
	@ResponseBody
	public String getChatRecordList(@RequestParam("userId")long userId,
			@RequestParam("targetUserid")long targetUserid) {
		ArrayList<ChatRecord> cys=chatService.getChatRecordList(userId,targetUserid);
		prettyPrint();
		System.err.println(cys);
		prettyPrint();
		return cys.toString();
	}
	
	@RequestMapping(value="/updateChat",method=RequestMethod.GET)
	@ResponseBody
	public String updateChatRecord(@RequestParam String s) {
		chatService.updateChat(s);
		return "1";
	}
	
	@RequestMapping(value="/deleteChat",method=RequestMethod.GET)
	@ResponseBody
	public String deleteChat(@RequestParam String s) {
		Chat chat=new Chat();
		chat.setUserId(2);
		chat.setTargetUserid(1);
		chatService.deleteChat(chat);
		return "1";
	}
}
