package com.brain.sotware;

public class Department {
	
	private int deptno;
	private String deptName;
	
	public Department(int deptno, String deptName) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + deptno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (deptno != other.deptno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Department [deptno=" + deptno + ", deptName=" + deptName + "]";
	}
	

}
