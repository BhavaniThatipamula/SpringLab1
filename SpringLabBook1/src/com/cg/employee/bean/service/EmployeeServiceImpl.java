package com.cg.employee.bean.service;

import com.cg.employee.bean.EmployeeInfo;
import com.cg.employee.dao.EmployeeDao;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public EmployeeInfo getDetails(int empId) {
		EmployeeDao emp=new EmployeeDao();
		return emp.getDetails(empId);
	}

}
