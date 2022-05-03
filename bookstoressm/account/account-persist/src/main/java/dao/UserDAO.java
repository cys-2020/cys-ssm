package dao;

import publicpojos.User;

public interface UserDAO {
	User getUser(long id);
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
}
