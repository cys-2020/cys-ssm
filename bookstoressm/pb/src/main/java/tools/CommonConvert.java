package tools;

import java.util.ArrayList;

/**
 *	@description �ײ�ͨ�����ݸ�ʽת��
 *	@author cys(ChenYongsheng)
 * 	@date 2022��5��5��
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
