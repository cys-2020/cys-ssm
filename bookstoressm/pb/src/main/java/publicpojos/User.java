package publicpojos;
import tools.*;
import java.util.ArrayList;
/**
 *	@description User has user info
 *	@author cys(ChenYongsheng)
 * 	@date 2022年4月24日
 */
public class User {
	private long id;
	private String phoneNumber;
	private String eMail;
	private String pswd;
	private String accountNumber;
	private String niceName;
	private String idNumber;
	private String addresses;
	private int baobao;
	private short lv;
	public User() {
		//
		
	}
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String geteMail() {
		return eMail;
	}


	public void seteMail(String eMail) {
		this.eMail = eMail;
	}


	public String getPswd() {
		return pswd;
	}


	public void setPswd(String pswd) {
		this.pswd = pswd;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getNiceName() {
		return niceName;
	}


	public void setNiceName(String niceName) {
		this.niceName = niceName;
	}

	/**
	 * 
	 * @return 身份证号码
	 */
	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public String getAddresses() {
		
		return addresses;
	}

	
	public void setAddresses(String addresses) {
		this.addresses = addresses;
	}


	public int getBaobao() {
		return baobao;
	}


	public void setBaobao(int baobao) {
		this.baobao = baobao;
	}


	public short getLv() {
		return lv;
	}


	public void setLv(short lv) {
		this.lv = lv;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", phoneNumber=" + phoneNumber + ", eMail=" + eMail + ", pswd=" + pswd
				+ ", accountNumber=" + accountNumber + ", niceName=" + niceName + ", idNumber=" + idNumber
				+ ", addresses=" + addresses + ", baobao=" + baobao + ", lv=" + lv + "]";
	}
	
}
