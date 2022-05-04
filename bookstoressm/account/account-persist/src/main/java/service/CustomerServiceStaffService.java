package service;

import publicpojos.CustomerServiceStaff;
/**
 *	@description 定义了账户CustomerServiceStaff中所有的业务逻辑
 *	@author cys(ChenYongsheng)
 * 	@date 2022年5月4日
 */
public interface CustomerServiceStaffService {
	CustomerServiceStaff getCustomerServiceStaff(long id);
	void insertCustomerServiceStaff(CustomerServiceStaff css);
	void updateCustomerServiceStaff(CustomerServiceStaff css);
	void deleteCustomerServiceStaff(CustomerServiceStaff css);
}
