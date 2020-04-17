package cn.com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;

import cn.com.dao.DeptDAO;
import cn.com.entity.Dept;
import cn.com.util.JdbcUtil;

public class ImplDeptDAO implements DeptDAO {
	

	private Connection conn ;
	public ImplDeptDAO(Connection conn){
		this.conn = conn;
	}
	public ImplDeptDAO(){
		
	}
	@Override
	public int AddDeptInfIntoOracle(Dept dept) {
		// TODO Auto-generated method stub
		int returnNum =0;
		PreparedStatement ps = null;
		
		/*建立连接对象**/
		conn = JdbcUtil.getConn();		
		String insertSql ="insert into t_dept (dName,deptDesc) values (?,?)";
		try {
			/*创建prepareStatement对象**/
			ps = conn.prepareStatement(insertSql);
			/*设置参数**/
			ps.setString(1, dept.getDeptName());
			ps.setString(2, dept.getDeptDesc());
			/*将数据插入t_user中**/	
			if(ps.executeUpdate()==1){
				returnNum = 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			/*关闭资源**/
			JdbcUtil.close(null, ps, conn);
		}
		return returnNum;
	}
	@Override
	public List<Dept> getDeptsByName(Dept d) {
		// TODO Auto-generated method stub
		/**建立连接*/
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Dept> dept = new ArrayList<Dept>();
		/**创建prepareStatement对象*/	
		try {
			conn = JdbcUtil.getConn();
			StringBuffer sb = new StringBuffer("select * from t_dept");
			if(d.getDeptName()!=null&&!" ".equals(d.getDeptName())){
				sb.append(" and dname like '%"+d.getDeptName()+"%'");
				
			}
			if(d.getDeptDesc()!=null&&!" ".equals(d.getDeptDesc())){
				sb.append("and deptdesc like '%"+d.getDeptDesc()+"%'");
			}
			System.out.println(sb.toString());
			ps = conn.prepareStatement(sb.toString().replaceFirst("and","where"));
			rs = ps.executeQuery();
			while(rs.next()){
				Dept depts = new Dept();
				depts.setId(rs.getInt("dno"));
				depts.setDeptName(rs.getString("dname"));
				depts.setDeptDesc(rs.getString("deptdesc"));
				dept.add(depts);
				System.out.println(depts);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			JdbcUtil.close(rs, ps, conn);
		}
		return dept;
	}
	@Override
	public int updateDept(Dept dept) {
		// TODO Auto-generated method stub
		conn = JdbcUtil.getConn();
		PreparedStatement ps = null;
		int count =0;
		String updateSql  = "update t_dept set dname = ?, deptdesc = ? where dno =? ";
		try {
			ps = conn.prepareStatement(updateSql);
			
			ps.setString(1, dept.getDeptName());
			ps.setString(2, dept.getDeptDesc());
			ps.setInt(3, dept.getId());
			count = ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			JdbcUtil.close(null, ps, conn);
		}
		return count;
	}
	@Override
	public int deleteDept(Dept dept) {
		// TODO Auto-generated method stub
		conn = JdbcUtil.getConn();
		PreparedStatement ps = null;
		int count =0;
		String delSql  = "delete from  t_dept where dno =?  ";
		try {
			ps = conn.prepareStatement(delSql);
		
			ps.setInt(1, dept.getId());
			
			count = ps.executeUpdate();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			JdbcUtil.close(null, ps, conn);
		}
		return count;
		
	}
	

	

}
