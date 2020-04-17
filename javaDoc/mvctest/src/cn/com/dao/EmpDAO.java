package cn.com.dao;

import java.util.List;

import cn.com.entity.Empolyee;

public interface EmpDAO {
	/**将员工的信息加入到数据库中*/
	public int AddInfIntoOracle(Empolyee emp);
	/**根据相应的要求查询员工信息*/
	public List<Empolyee> getInfFromOracle(Empolyee emp);
	/**根据员工编号删除相应信息*/
	public int updateInfFromOracle(Empolyee emp);
	/**根据员工编号修改员工信息*/
	public int deleteInfFromOracle(Empolyee emp);
}
