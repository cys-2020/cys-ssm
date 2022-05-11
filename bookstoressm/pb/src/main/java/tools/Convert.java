package tools;

import java.util.ArrayList;
import java.util.List;

import publicpojos.ChatRecord;

/**
 *	@description 该工具类包含数据结构转换
 *	@author cys(ChenYongsheng)
 * 	@date 2022年5月5日
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
	 * 将ChatRecord对象转换为一个符合数据表格式的字符串
	 * @param cr A ChatRecord will be converted
	 * @return A final string will be into table
	 */
	public String toStringFromChatRecord(ChatRecord cr) {
		StringBuffer sb=new StringBuffer();
		String date="d[["+cr.getChatTime();//通用的，且放在最后
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
		}else {//只有一张图片
			sb.append("a[["+cr.getChatResources()[0]).append(date);
		}
		return sb.toString();
	}
	/**
	 * 将聊天记录转换为ChatRecord对象
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
			if(s.contains("a[[")) {//如果图文并存，将合并为一条聊天记录
				//需要考虑多个a[[了！
				textEnd=s.indexOf("a[[");
				cr.setChatText(s.substring(3,textEnd));
				s=s.substring(textEnd+3,dateBegin);//由字符中间的a[[隔开每个链接
				String []resources=s.split("a\\[\\[");
				cr.setChatResources(resources);
			}else {
				cr.setChatResources(null);
				textEnd=dateBegin;
				cr.setChatText(s.substring(3,textEnd));
			}
		}else {//如果没有文字，每张图片作为一条聊天记录
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
