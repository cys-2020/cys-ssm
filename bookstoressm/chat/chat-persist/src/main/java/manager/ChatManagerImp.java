package manager;
import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import dao.ChatDAO;
import publicpojos.Chat;
@Component
public class ChatManagerImp implements ChatManager{
	private ChatDAO dao;
	
	public ChatManagerImp(ChatDAO dao) {
		System.err.println("ÓÐÃ»ÓÐuserDAO£¿"+(dao!=null));
		this.dao = dao;
	}
	@Transactional(rollbackFor=Exception.class,
		propagation=Propagation.SUPPORTS)
	public ArrayList<Chat> getChat(long userId, long targetUserid) {
		//
		return dao.getChat(userId, targetUserid);
	}
	@Transactional(rollbackFor=Exception.class,
	propagation=Propagation.REQUIRED)
	public void insertChat(Chat chat) {
		//
		dao.insertChat(chat);
	}
	@Transactional(rollbackFor=Exception.class,
	propagation=Propagation.REQUIRED)
	public void updateChat(Chat chat) {
		//
		dao.updateChat(chat);
	}
	@Transactional(rollbackFor=Exception.class,
	propagation=Propagation.REQUIRED)
	public void deleteChat(Chat chat) {
		//
		dao.deleteChat(chat);
	}

	
}
