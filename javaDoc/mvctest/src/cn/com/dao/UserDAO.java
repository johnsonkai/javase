package cn.com.dao;

import cn.com.entity.User;
/*
 * 
 */

public interface UserDAO {
	
	/*查询用户登入信息**/
	public User getUserByUP(User user);
	/*将用户信息存入数据库**/                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	public void loginIntoOracle(User user);
	
}
