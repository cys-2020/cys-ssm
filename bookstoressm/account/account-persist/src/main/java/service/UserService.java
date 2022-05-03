package service;
import publicpojos.User;

/**
 * 
 *	@description 定义了所有复杂的业务逻辑
 *	@author cys(ChenYongsheng)
 * 	@date 2022年4月25日
 */
public interface UserService {
	User getUser(long id);
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
}
