package service;

import publicpojos.CustomerServiceStaff;
/**
 *	@description �������˻�CustomerServiceStaff�����е�ҵ���߼�
 *	@author cys(ChenYongsheng)
 * 	@date 2022��5��4��
 */
public interface CustomerServiceStaffService {
	CustomerServiceStaff getCustomerServiceStaff(long id);
	void insertCustomerServiceStaff(CustomerServiceStaff css);
	void updateCustomerServiceStaff(CustomerServiceStaff css);
	void deleteCustomerServiceStaff(CustomerServiceStaff css);
}
