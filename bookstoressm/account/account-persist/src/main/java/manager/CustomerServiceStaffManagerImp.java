package manager;

import org.springframework.stereotype.Component;

import dao.CustomerServiceStaffDAO;
import publicpojos.CustomerServiceStaff;

/**
 *	@description 
 *	@author cys(ChenYongsheng)
 * 	@date 2022年5月4日
 */
@Component
public class CustomerServiceStaffManagerImp implements CustomerServiceStaffManager {
	private CustomerServiceStaffDAO dao;
	
	public CustomerServiceStaffManagerImp(CustomerServiceStaffDAO dao) {
		System.err.println("有没有cssDAO？"+(dao!=null));
		this.dao = dao;
	}

	@Override
	public CustomerServiceStaff getCustomerServiceStaff(long id) {
		//
		return dao.getCustomerServiceStaff(id);
	}

	@Override
	public void insertCustomerServiceStaff(CustomerServiceStaff css) {
		//
		dao.insertCustomerServiceStaff(css);
	}

	@Override
	public void updateCustomerServiceStaff(CustomerServiceStaff css) {
		//
		dao.updateCustomerServiceStaff(css);
	}

	@Override
	public void deleteCustomerServiceStaff(CustomerServiceStaff css) {
		//
		dao.deleteCustomerServiceStaff(css);
	}

}
