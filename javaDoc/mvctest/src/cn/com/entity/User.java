package cn.com.entity;
/*
 * user��
 */
public class User {
	/*�û�id**/
	private int id;
	/*�û�����**/
	private String userName;
	/*�û�����**/
	private String password;
	public User(){
		
	}
	
	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
