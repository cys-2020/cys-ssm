package service;
import java.util.ArrayList;

import publicpojos.Chat;
import publicpojos.ChatRecord;

/**
 *	@description �������˻�Chat�����е�ҵ���߼�
 *	@author cys(ChenYongsheng)
 * 	@date 2022��4��25��
 */
public interface ChatService {
	ArrayList<ChatRecord> getChatRecordList(long userId,long targetUserid);
	void updateChat(String chat);
	void deleteChat(Chat chat);
}
