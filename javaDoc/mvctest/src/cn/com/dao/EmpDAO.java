package cn.com.dao;

import java.util.List;

import cn.com.entity.Empolyee;

public interface EmpDAO {
	/**��Ա������Ϣ���뵽���ݿ���*/
	public int AddInfIntoOracle(Empolyee emp);
	/**������Ӧ��Ҫ���ѯԱ����Ϣ*/
	public List<Empolyee> getInfFromOracle(Empolyee emp);
	/**����Ա�����ɾ����Ӧ��Ϣ*/
	public int updateInfFromOracle(Empolyee emp);
	/**����Ա������޸�Ա����Ϣ*/
	public int deleteInfFromOracle(Empolyee emp);
}
