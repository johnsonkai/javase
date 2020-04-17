package cn.com.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import cn.com.entity.Dept;
import cn.com.util.JdbcUtil;

public interface DeptDAO {
	/**�����ŵ���Ϣ��ӵ����ݿ���*/
	public int AddDeptInfIntoOracle(Dept dept);
	/**���ݲ������Ʋ�ѯ���еĲ�����Ϣ*/
	
	List<Dept> getDeptsByName(Dept d);
	/**���ݲ��ź��޸���Ӧ����Ϣ*/
	public int updateDept(Dept dept);
	/**���ݲ��ź�ɾ����Ϣ*/
	public int deleteDept(Dept dept);
	
}
