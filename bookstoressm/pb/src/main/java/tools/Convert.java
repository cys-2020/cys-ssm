package tools;

import java.util.ArrayList;
import java.util.List;

import publicpojos.ChatRecord;

/**
 *	@description �ù�����������ݽṹת��
 *	@author cys(ChenYongsheng)
 * 	@date 2022��5��5��
 */
public class Convert {
	/**
	 * a string splitted by &&  converts into a ArrayList
	 * @param s A string splitted by &&
	 * @return A list without &&
	 */
	public ArrayList<String> toAddressesListFromString(String s){
		return  (ArrayList<String>) CommonConvert.convertArrayToArrayList(s.split("&&"));
	}
	/**
	 * a ArrayList converts into a string splitted by &&
	 * @param l ArrayList including string items
	 * @return A string splitted by &&
	 */
	public String toStringFromAddressList(ArrayList<String> l) {
		StringBuffer sb=new StringBuffer();
		int len=l.size();
		for(int i=0;i<len;i++) {
			sb.append(l.get(i)+"&&");
		}
		String s=sb.toString();
		return s.substring(0,s.length()-2);
	}
	/**
	 * ��ChatRecord����ת��Ϊһ���������ݱ��ʽ���ַ���
	 * @param cr A ChatRecord will be converted
	 * @return A final string will be into table
	 */
	public String toStringFromChatRecord(ChatRecord cr) {
		StringBuffer sb=new StringBuffer();
		String date="d[["+cr.getChatTime();//ͨ�õģ��ҷ������
		if(cr.getChatText()!=null) {
			if(cr.getChatResources()==null) {
				sb.append("t[["+cr.getChatText()).append(date);
			}else {
				sb.append("t[["+cr.getChatText());
				String[] resources=cr.getChatResources();
				int resourcesLen=resources.length;
				for(int i=0;i<resourcesLen;i++) {
					sb.append("a[["+resources[i]);
				}
				sb.append(date);
			}
		}else {//ֻ��һ��ͼƬ
			sb.append("a[["+cr.getChatResources()[0]).append(date);
		}
		return sb.toString();
	}
	/**
	 * �������¼ת��ΪChatRecord����
	 * @param id Id(line number in table) of this Record
	 * @param s A string in t_chat rN
	 * @return A ChatRecord obj
	 */
	public ChatRecord toChatRecordFromString(long id,String s) {
		ChatRecord cr=new ChatRecord();
		int textEnd=0;
		int resourceEnd=0;
		int dateBegin=s.indexOf("d[[");
		cr.setId(id);
		cr.setChatTime(s.substring(dateBegin+3));
		if(s.contains("t[[")) {
			if(s.contains("a[[")) {//���ͼ�Ĳ��棬���ϲ�Ϊһ�������¼
				//��Ҫ���Ƕ��a[[�ˣ�
				textEnd=s.indexOf("a[[");
				cr.setChatText(s.substring(3,textEnd));
				s=s.substring(textEnd+3,dateBegin);//���ַ��м��a[[����ÿ������
				String []resources=s.split("a\\[\\[");
				cr.setChatResources(resources);
			}else {
				cr.setChatResources(null);
				textEnd=dateBegin;
				cr.setChatText(s.substring(3,textEnd));
			}
		}else {//���û�����֣�ÿ��ͼƬ��Ϊһ�������¼
			cr.setChatText(null);
			resourceEnd=dateBegin;
			cr.setChatResources(new String[] {s.substring(0,resourceEnd)});
		}
		
		return cr;
	}
	public static void main(String[] args) {
		String a="123";
		System.out.println(a.split("jjj")[1]);
	}
}
