package dao;

import publicpojos.CustomerServiceStaff;

public interface CustomerServiceStaffDAO {
	CustomerServiceStaff getCustomerServiceStaff(long id);
	void insertCustomerServiceStaff(CustomerServiceStaff css);
	void updateCustomerServiceStaff(CustomerServiceStaff css);
	void deleteCustomerServiceStaff(CustomerServiceStaff css);
}
