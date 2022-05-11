package service;
import java.util.ArrayList;

/**
 * @description �˻�Chat�ķ�����

 * @author cys(ChenYongsheng)
 * @date 2022��5��4��
 */
import org.springframework.stereotype.Service;

import manager.ChatManager;
import publicpojos.Chat;
import publicpojos.ChatRecord;
import tools.Convert;
@Service
public class ChatServiceImp implements ChatService {
	private ChatManager manager;
	
	public ChatServiceImp(ChatManager manager) {
		System.err.println("��û��manager?"+(manager!=null));
		this.manager = manager;
	}

	@Override
	/**
	 * ���ص��б��������id�������¼
	 */
	public ArrayList<ChatRecord> getChatRecordList
			(long userId, long targetUserid) {
		//
		Convert tool=new Convert();
		ArrayList<ChatRecord> list=new ArrayList<>();
		ArrayList<Chat> chats=manager.getChat(userId,targetUserid);
		int size=chats.size();
		Chat chat=null;
		for(int i=0;i<size;i++) {
			chat=chats.get(i);
			long id=chat.getId();//ĳ��id��12����¼��Ҫװ���Ż���һ��id��
			String r1=chat.getR1(),r2=null,r3=null,r4=null,r5=null,r6=null,
					r7=null,r8=null,r9=null,r10=null,r11=null,r12=null;
			if(r1!=null) {
				list.add(tool.toChatRecordFromString(id, r1));
				r2=chat.getR2();
			}else
				return list;
			if(r2!=null) {
				list.add(tool.toChatRecordFromString(id, r2));
				r3=chat.getR3();
			}else
				return list;
			if(r3!=null) {
				list.add(tool.toChatRecordFromString(id, r3));
				r4=chat.getR4();
			}else
				return list;
			if(r4!=null) {
				list.add(tool.toChatRecordFromString(id, r4));
				r5=chat.getR5();
			}else
				return list;
			if(r5!=null) {
				list.add(tool.toChatRecordFromString(id, r5));
				r6=chat.getR6();
			}else
				return list;
			if(r6!=null) {
				list.add(tool.toChatRecordFromString(id, r6));
				r7=chat.getR7();
			}else
				return list;
			if(r7!=null) {
				list.add(tool.toChatRecordFromString(id, r7));
				r8=chat.getR8();
			}else
				return list;
			if(r8!=null) {
				list.add(tool.toChatRecordFromString(id, r8));
				r9=chat.getR9();
			}else
				return list;
			if(r9!=null) {
				list.add(tool.toChatRecordFromString(id, r9));
				r10=chat.getR10();
			}else
				return list;
			if(r10!=null) {
				list.add(tool.toChatRecordFromString(id, r10));
				r11=chat.getR11();
			}else
				return list;
			if(r11!=null) {
				list.add(tool.toChatRecordFromString(id, r11));
				r12=chat.getR12();
			}else
				return list;
			if(r12!=null) {
				list.add(tool.toChatRecordFromString(id, r12));
			}
		}
		return list;
	}

	@Override
	public void updateChat(String s) {//ƴ�Ӻõ�RN
		//��ʱ��String��Ϊ������ʵ����ǰ�˴����Ƕ���(˫��id��һ����¼������)
		//1�������� ��ȡ˫��id,��¼t[[,d[[
		//2�����a[[�������ﱣ���ֽڸ����̣�������һ��������Ϊa[[������
		//3ƴ��t[[a[[d[[�ſ���update
		long userId=2,targetUserid=1;
		Chat chat=new Chat();
		Object[] idandrindex=getUpdateRindex(userId,targetUserid);
		if(idandrindex==null) {//��ô�����£����ǲ�����chat id
			insert(userId,targetUserid,s);
			return;
		}
		long id=(long) idandrindex[0];
		chat.setId(id);//��ȡid
		short rindex=(short) idandrindex[1];
		if(rindex==2) {
			chat.setR2(s);
			System.err.println(chat);
			System.err.println("��Ҫ�����id��"+idandrindex[0]+"/////��Ҫ�����R��"+idandrindex[1]);
			manager.updateChat(chat);
			return;
		}
		if(rindex==3) {
			chat.setR3(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==4) {
			chat.setR4(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==5) {
			chat.setR5(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==6) {
			chat.setR6(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==7) {
			chat.setR7(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==8) {
			chat.setR8(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==9) {
			chat.setR9(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==10) {
			chat.setR10(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==11) {
			chat.setR11(s);
			manager.updateChat(chat);
			return;
		}
		if(rindex==12) {
			chat.setR12(s);
			manager.updateChat(chat);
			return;
		}
	}

	@Override
	public void deleteChat(Chat chat) {
		//
		manager.deleteChat(chat);
	}

	
	
	public Object[] getUpdateRindex(long userId,long targetUserid) {
		Object[] idandrindex=new Object[2];
		ArrayList<Chat> chats=manager.getChat(userId, targetUserid);
		int size=chats.size();
		//����null��Ϊ���룬�����ȡchat id��rindex���и���
		if(size==0) //���û��ƥ��ļ�¼(u��targetu)
			return null;
		else if((chats.get(size-1).getR12())!=null)//���ƥ�䵫���¼�¼������
			return null;
		else {
			Chat chat=chats.get(size-1);//���µļ�¼��������пɸ��²����λ��
			idandrindex[0]=chat.getId();//����chat��id���ڸ���
			short rindex=0;
			if(chat.getR2()==null) {
				rindex=2;
				idandrindex[1]=rindex;
				return idandrindex;
			}
			if(chat.getR3()==null) {
				rindex=3;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR4()==null) {
				rindex=4;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR5()==null) {
				rindex=5;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR6()==null) {
				rindex=6;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR7()==null) {
				rindex=7;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR8()==null) {
				rindex=8;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR9()==null) {
				rindex=9;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR10()==null) {
				rindex=10;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR11()==null) {
				rindex=11;
				idandrindex[1]=rindex;
				return idandrindex;
			}if(chat.getR12()==null) {
				rindex=12;
				idandrindex[1]=rindex;
				return idandrindex;
			}
		}	
		return null;
	}
	
	public void insert(long userId,long targetUserid,String r1) {
		Chat inserted=new Chat();
		inserted.setUserId(userId);
		inserted.setTargetUserid(targetUserid);
		inserted.setR1(r1);
		manager.insertChat(inserted);
	}
}
