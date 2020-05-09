package com.cg.employee.pl;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.employee.bean.EmployeeInfo;
import com.cg.employee.bean.service.EmployeeService;
import com.cg.employee.bean.service.EmployeeServiceImpl;
import com.cg.employee.dao.EmployeeDao;

public class Client4 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
		EmployeeDao sbu=context.getBean("emp",EmployeeDao.class);
		System.out.println("Enter Employee Id : ");
		Scanner s=new Scanner(System.in);
		int empId=s.nextInt();
		EmployeeService empService=new EmployeeServiceImpl();
		EmployeeInfo emp=empService.getDetails(empId);
		if(emp==null){
			System.out.println("No Employee Exist");
		}
		else{
			System.out.println("Employee Id: "+emp.getEmployeeId());
			System.out.println("Employee Name: "+emp.getEmployeeName());
			System.out.println("Employee Salary: "+emp.getSalary());
		}
	}

	}


