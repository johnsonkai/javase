package cn.com.entity;

public class Empolyee {
	/**员工编号*/
	private int empNo;
	/**员工所在的部门*/
	private int Dno;
	/**员工姓名*/
	private String empName;
	/**员工描述*/
	private String empDesc;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public int getDno() {
		return Dno;
	}
	public void setDno(int dno) {
		Dno = dno;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesc() {
		return empDesc;
	}
	public void setEmpDesc(String empDesc) {
		this.empDesc = empDesc;
	}
	

}
