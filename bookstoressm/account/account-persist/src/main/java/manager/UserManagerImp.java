package manager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import dao.UserDAO;
import publicpojos.User;
@Component
public class UserManagerImp implements UserManager{
	private UserDAO dao;
	
	public UserManagerImp(UserDAO dao) {
		System.err.println("��û��userDAO��"+(dao!=null));
		this.dao = dao;
	}
	@Transactional(rollbackFor=Exception.class,
		propagation=Propagation.SUPPORTS)
	public User getUser(long id) {
		//
		return dao.getUser(id);
	}
	@Transactional(rollbackFor=Exception.class,
	propagation=Propagation.REQUIRED)
	public void insertUser(User user) {
		//
		dao.insertUser(user);
	}
	@Transactional(rollbackFor=Exception.class,
	propagation=Propagation.REQUIRED)
	public void updateUser(User user) {
		//
		dao.updateUser(user);
	}
	@Transactional(rollbackFor=Exception.class,
	propagation=Propagation.REQUIRED)
	public void deleteUser(User user) {
		//
		dao.deleteUser(user);
	}
}
