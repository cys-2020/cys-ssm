package publicpojos;

/**
 *	@description CustomerServiceStaff is based on User
 *	@author cys(ChenYongsheng)
 * 	@date 2022��4��28��
 */
public class CustomerServiceStaff {
	private long id;
	private long userId;
	private String niceName;
	public CustomerServiceStaff() {
		//

	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getNiceName() {
		return niceName;
	}
	public void setNiceName(String niceName) {
		this.niceName = niceName;
	}
	@Override
	public String toString() {
		return "CustomerServiceStaff [id=" + id + ", userId=" + userId + ", niceName=" + niceName + "]";
	}
	
}
