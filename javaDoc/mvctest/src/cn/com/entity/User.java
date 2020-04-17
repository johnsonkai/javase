package cn.com.entity;
/*
 * user类
 */
public class User {
	/*用户id**/
	private int id;
	/*用户姓名**/
	private String userName;
	/*用户密码**/
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
