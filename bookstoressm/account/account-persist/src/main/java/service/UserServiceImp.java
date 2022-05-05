package service;
/**
 * @description 账户User的服务类
 * @author cys(ChenYongsheng)
 * @date 2022年5月4日
 */
import org.springframework.stereotype.Service;

import manager.UserManager;
import publicpojos.User;
@Service
public class UserServiceImp implements UserService {
	private UserManager manager;
	
	public UserServiceImp(UserManager manager) {
		System.err.println("有没有manager?"+(manager!=null));
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
