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
	/*��ѯ��Ϣ**/
	@Override
	public User getUserByUP(User user) {
		// TODO Auto-generated method stub		
		PreparedStatement ps = null;
		ResultSet rs = null;
		User returnUser =null; 
		/*�������Ӷ���**/
		conn = JdbcUtil.getConn();		
		String userSql ="select * from t_user where user_name=? and user_password =?";
		try {
			/*����prepareStatement����**/
			ps = conn.prepareStatement(userSql);
			/*���ò���**/
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			/*��ѯUser�������**/
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
			/*�ر���Դ**/
			JdbcUtil.close(rs, ps, conn);
		}
		return returnUser;
	}
	
	@Override
	public void loginIntoOracle(User user) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;	
		/*�������Ӷ���**/
		conn = JdbcUtil.getConn();		
		String insertSql ="insert into t_user (user_name,user_password) values (?,?)";
		try {
			/*����prepareStatement����**/
			ps = conn.prepareStatement(insertSql);
			/*���ò���**/
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			/*�����ݲ���t_user��**/
			ps.executeUpdate();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			/*�ر���Դ**/
			JdbcUtil.close(null, ps, conn);
		}
	}

	

}
