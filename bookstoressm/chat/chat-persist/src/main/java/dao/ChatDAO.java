package dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import publicpojos.Chat;

public interface ChatDAO {
	ArrayList<Chat> getChat(@Param(value = "userId") long userId,
			@Param("targetUserid") long targetUserid);
	void insertChat(Chat chat);
	void updateChat(Chat chat);
	void deleteChat(Chat chat);
	
}
