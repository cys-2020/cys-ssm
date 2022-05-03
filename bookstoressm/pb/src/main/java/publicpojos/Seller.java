package publicpojos;

/**
 *	@description Seller is based on User
 *	@author cys(ChenYongsheng)
 * 	@date 2022Äê4ÔÂ28ÈÕ
 */
public class Seller {
	private long id;
	private long userId;
	private short score;
	private short credibility;
	private short storeNumber;
	//association
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
	public short getScore() {
		return score;
	}
	public void setScore(short score) {
		this.score = score;
	}
	public short getCredibility() {
		return credibility;
	}
	public void setCredibility(short credibility) {
		this.credibility = credibility;
	}
	public short getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(short storeNumber) {
		this.storeNumber = storeNumber;
	}
	@Override
	public String toString() {
		return "Seller [id=" + id + ", userId=" + userId + ", score=" + score + ", credibility=" + credibility
				+ ", storeNumber=" + storeNumber + "]";
	}
	
}
