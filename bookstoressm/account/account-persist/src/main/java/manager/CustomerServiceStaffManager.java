package manager;

import publicpojos.CustomerServiceStaff;

public interface CustomerServiceStaffManager {
	CustomerServiceStaff getCustomerServiceStaff(long id);
	void insertCustomerServiceStaff(CustomerServiceStaff css);
	void updateCustomerServiceStaff(CustomerServiceStaff css);
	void deleteCustomerServiceStaff(CustomerServiceStaff css);
}
