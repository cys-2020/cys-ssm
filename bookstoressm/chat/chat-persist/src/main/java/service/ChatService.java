package service;
import java.util.ArrayList;

import publicpojos.Chat;
import publicpojos.ChatRecord;

/**
 *	@description 定义了账户Chat中所有的业务逻辑
 *	@author cys(ChenYongsheng)
 * 	@date 2022年4月25日
 */
public interface ChatService {
	ArrayList<ChatRecord> getChatRecordList(long userId,long targetUserid);
	void updateChat(String chat);
	void deleteChat(Chat chat);
}
