package tools;

import java.util.ArrayList;

/**
 *	@description 底层通用数据格式转换
 *	@author cys(ChenYongsheng)
 * 	@date 2022年5月5日
 */
public class CommonConvert {
	public static ArrayList<? extends Object> convertArrayToArrayList(Object[] arr){
		ArrayList<Object> list=new ArrayList<>();
		int len=arr.length;
		for(int i=0;i<len;i++) {
			list.add(arr[i]);
		}
		return list;
	}
}
