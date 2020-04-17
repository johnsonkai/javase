package cn.com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import cn.com.entity.Dept;
import cn.com.util.JdbcUtil;

public interface DeptDAO {
	/**将部门的信息添加到数据库中*/
	public int AddDeptInfIntoOracle(Dept dept);
	/**根据部门名称查询所有的部门信息*/
	
	List<Dept> getDeptsByName(Dept d);
	/**根据部门号修改相应的信息*/
	public int updateDept(Dept dept);
	/**根据部门号删除信息*/
	public int deleteDept(Dept dept);
	
}
