package manager;

import publicpojos.User;

public interface UserManager {
	User getUser(long id);
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(User user);
}
