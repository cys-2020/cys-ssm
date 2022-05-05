package tools;

import java.util.ArrayList;
import java.util.List;

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
	public ArrayList<String> convertToListFromString(String s){
		return  (ArrayList<String>) CommonConvert.convertArrayToArrayList(s.split("&&"));
	}
	/**
	 * a ArrayList converts into a string splitted by &&
	 * @param l ArrayList including string items
	 * @return A string splitted by &&
	 */
	public String convertToStringFromList(ArrayList<String> l) {
		StringBuffer sb=new StringBuffer();
		int len=l.size();
		for(int i=0;i<len;i++) {
			sb.append(l.get(i)+"&&");
		}
		String s=sb.toString();
		return s.substring(0,s.length()-2);
	}
}
