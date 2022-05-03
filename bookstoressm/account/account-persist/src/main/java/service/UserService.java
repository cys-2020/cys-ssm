package service;
import publicpojos.User;

/**
 * 
 *	@description ���������и��ӵ�ҵ���߼�
 *	@author cys(ChenYongsheng)
 * 	@date 2022��4��25��
 */
public interface UserService {
	User getUser(long id);
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
}
