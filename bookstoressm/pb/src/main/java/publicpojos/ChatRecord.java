package publicpojos;

/**
 *	@description ChatRecord packages rN in Chat
 *	@author cys(ChenYongsheng)
 * 	@date 2022年5月7日
 */
public class ChatRecord {
	/**
	 * 这个ChatRecord被一个id(t_chat的某行)标识
	 */
	private long id;
	private String chatText;
	private String[] chatResources;
	private String chatTime;
	public ChatRecord() {
		//

	}
	
	public ChatRecord(long id, String chatText, String[] chatResources, String chatTime) {
		super();
		this.id = id;
		this.chatText = chatText;
		this.chatResources = chatResources;
		this.chatTime = chatTime;
	}

	@Override
	public String toString() {
		return "ChatRecord [id=" + id + ", chatText=" + chatText + ", chatResource=" + chatResources + ", chatTime="
				+ chatTime + "]";
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getChatText() {
		return chatText;
	}
	public void setChatText(String chatText) {
		this.chatText = chatText;
	}
	
	
	public String[] getChatResources() {
		return chatResources;
	}

	public void setChatResources(String[] chatResources) {
		this.chatResources = chatResources;
	}

	public String getChatTime() {
		return chatTime;
	}
	public void setChatTime(String chatTime) {
		this.chatTime = chatTime;
	}
	
}
