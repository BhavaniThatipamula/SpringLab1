package com.cg.employee.dao;

import java.util.List;

import com.cg.employee.bean.EmployeeInfo;

public class EmployeeDao {
	
	private static List<EmployeeInfo> emplist;
	public List<EmployeeInfo> getEmplist() {
		return emplist;
	}
	public void setEmplist(List<EmployeeInfo> emplist) {
		this.emplist = emplist;
		System.out.println(this.emplist);
	}
	public EmployeeInfo getDetails(int empId){
		for(EmployeeInfo data:emplist){
			if(data.getEmployeeId()==empId)
				return data;
		}
		return null;
	}

}
