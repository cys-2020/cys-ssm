package service;

import org.springframework.stereotype.Service;

import manager.CustomerServiceStaffManager;
import publicpojos.CustomerServiceStaff;

/**
 *	@description �˻�CustomerServiceStaff�ķ�����
 *	@author cys(ChenYongsheng)
 * 	@date 2022��5��4��
 */
@Service
public class CustomerServiceStaffServiceImp implements CustomerServiceStaffService {
	private CustomerServiceStaffManager manager;
	
	public CustomerServiceStaffServiceImp(CustomerServiceStaffManager manager) {
		super();
		this.manager = manager;
	}

	@Override
	public CustomerServiceStaff getCustomerServiceStaff(long id) {
		//
		return manager.getCustomerServiceStaff(id);
	}

	@Override
	public void insertCustomerServiceStaff(CustomerServiceStaff css) {
		//
		manager.insertCustomerServiceStaff(css);
	}

	@Override
	public void updateCustomerServiceStaff(CustomerServiceStaff css) {
		//
		manager.updateCustomerServiceStaff(css);
	}

	@Override
	public void deleteCustomerServiceStaff(CustomerServiceStaff css) {
		//
		manager.deleteCustomerServiceStaff(css);
	}

}
