package cn.com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.com.dao.UserDAO;
import cn.com.entity.User;
import cn.com.util.JdbcUtil;

public class ImplUserDAO implements UserDAO {

	private Connection conn ;
	public ImplUserDAO(Connection conn){
		this.conn = conn;
	}
	public ImplUserDAO(){
		
	}
	/*查询信息**/
	@Override
	public User getUserByUP(User user) {
		// TODO Auto-generated method stub		
		PreparedStatement ps = null;
		ResultSet rs = null;
		User returnUser =null; 
		/*建立连接对象**/
		conn = JdbcUtil.getConn();		
		String userSql ="select * from t_user where user_name=? and user_password =?";
		try {
			/*创建prepareStatement对象**/
			ps = conn.prepareStatement(userSql);
			/*设置参数**/
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			/*查询User表的数据**/
			rs = ps.executeQuery();
			while(rs.next()){
				returnUser = new User();
				returnUser.setUserName(rs.getString("user_name")) ;
				returnUser.setPassword(rs.getString("user_password"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			/*关闭资源**/
			JdbcUtil.close(rs, ps, conn);
		}
		return returnUser;
	}
	
	@Override
	public void loginIntoOracle(User user) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;	
		/*建立连接对象**/
		conn = JdbcUtil.getConn();		
		String insertSql ="insert into t_user (user_name,user_password) values (?,?)";
		try {
			/*创建prepareStatement对象**/
			ps = conn.prepareStatement(insertSql);
			/*设置参数**/
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			/*将数据插入t_user中**/
			ps.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			/*关闭资源**/
			JdbcUtil.close(null, ps, conn);
		}
	}

	

}
