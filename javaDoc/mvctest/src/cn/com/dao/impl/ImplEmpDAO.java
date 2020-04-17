package cn.com.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.com.dao.EmpDAO;
import cn.com.entity.Empolyee;
import cn.com.util.JdbcUtil;
import cn.com.util.StringUtil;

public class ImplEmpDAO implements EmpDAO {

	@Override
	public int AddInfIntoOracle(Empolyee emp) {
		// TODO Auto-generated method stub
		//创建连接
		Connection conn =JdbcUtil.getConn();
		PreparedStatement ps = null;
		int count = 0;
		String insertSql  ="insert into t_empolyee (ename,dno,edesc) values (?,?,?)";
		try {
			//创建prepareStatement对象
			ps = conn.prepareStatement(insertSql);
			//设置参数
			ps.setString(1, emp.getEmpName());
			ps.setInt(2, emp.getDno());
			ps.setString(3, emp.getEmpDesc());
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
	public List<Empolyee> getInfFromOracle(Empolyee emp) {
		// TODO Auto-generated method stub

		//建立连接
		Connection conn = JdbcUtil.getConn();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Empolyee > emps = new ArrayList<Empolyee>();
		StringBuilder sb = new StringBuilder("select * from t_empolyee");
		if(!StringUtil.isNullOrEmpty(emp.getEmpName())){
			sb.append(" and ename like '%"+emp.getEmpName()+"%'");	
		}
		System.out.println(emp.getDno());
		if(emp.getDno()!=0){
			
			sb.append(" and dno like '%"+emp.getDno()+"%'");
			System.out.println(sb.toString());
		}
		if(!StringUtil.isNullOrEmpty(emp.getEmpDesc())){
			sb.append(" and edesc like '%"+emp.getEmpDesc()+"%'");			
		}
		System.out.println(sb.toString());
		try {
			
			ps = conn.prepareStatement(sb.toString().replaceFirst("and", "where"));
			rs = ps.executeQuery();
			while(rs.next()){
				Empolyee e = new Empolyee();
				e.setEmpNo(rs.getInt("eno"));
				e.setEmpName(rs.getString("ename"));
				e.setDno(rs.getInt("dno"));
				e.setEmpDesc(rs.getString("edesc"));
				emps.add(e);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally{
			JdbcUtil.close(rs, ps, conn);
		}
		return emps;
		
	}

	@Override
	public int updateInfFromOracle(Empolyee emp) {
		// TODO Auto-generated method stub
		//建立连接
		Connection conn = JdbcUtil.getConn();
		PreparedStatement ps = null;
		//new preparestatement对象
		int count =0;
		String updateSql = "update t_empolyee set ename = ?,dno =?,edesc = ? where eno = ?";
		try {
			ps = conn.prepareStatement(updateSql);
			//设置参数
			ps.setString(1, emp.getEmpName());
			ps.setInt(2, emp.getDno());
			ps.setString(3, emp.getEmpDesc());
			ps.setInt(4, emp.getEmpNo());
			//执行sql语句
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
	public int deleteInfFromOracle(Empolyee emp) {
		// TODO Auto-generated method stub
		int count = 0;
		//建立连接
		Connection conn = JdbcUtil.getConn();
		//new preparestatement对象
		PreparedStatement ps = null;
		String deleteSql = "delete from t_empolyee where eno = ?";
		try {
			ps = conn.prepareStatement(deleteSql);
			//设置参数
			ps.setInt(1, emp.getEmpNo());
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
