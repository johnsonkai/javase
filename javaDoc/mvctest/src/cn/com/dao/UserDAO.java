package cn.com.dao;

import cn.com.entity.User;
/*
 * 
 */

public interface UserDAO {
	
	/*��ѯ�û�������Ϣ**/
	public User getUserByUP(User user);
	/*���û���Ϣ�������ݿ�**/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	public void loginIntoOracle(User user);
	
}
