package service;
/**
 * @description �˻�User�ķ�����
 * @author cys(ChenYongsheng)
 * @date 2022��5��4��
 */
import org.springframework.stereotype.Service;

import manager.UserManager;
import publicpojos.User;
@Service
public class UserServiceImp implements UserService {
	private UserManager manager;
	
	public UserServiceImp(UserManager manager) {
		System.err.println("��û��manager?"+(manager!=null));
		this.manager = manager;
	}

	@Override
	public User getUser(long id) {
		//handle...
		return manager.getUser(id);
	}

	@Override
	public void insertUser(User user) {
		//
		manager.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		//
		manager.updateUser(user);
	}

	@Override
	public void deleteUser(User user) {
		//
		manager.deleteUser(user);
	}


	
}
