package manager;

import java.util.ArrayList;


import publicpojos.Chat;

public interface ChatManager {
	ArrayList<Chat> getChat(long userId,long targetUserid);
	void insertChat(Chat chat);
	void updateChat(Chat chat);
	void deleteChat(Chat chat);
}
