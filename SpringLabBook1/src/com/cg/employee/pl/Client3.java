package com.cg.employee.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.employee.bean.Employee;
import com.cg.employee.bean.Sbu;

public class Client3 {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Employee emp=ctx.getBean("emp",Employee.class);
		
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("bean3.xml");
		
		
		Sbu sbu=ctx1.getBean("sbu",Sbu.class);
		System.out.println("SBU Details");
		System.out.println("-------------------------");
		System.out.println("SbuId : "+sbu.getSbuId());
		System.out.println("sbuName : "+sbu.getSbuName());
		System.out.println("sbuHead : "+sbu.getSbuHead());
		System.out.println("");
		System.out.println("Employee Details");
		System.out.println("-------------------------");
		System.out.println("EmployeeId : "+emp.getEmployeeId());
		System.out.println("Employee Name : "+emp.getEmployeeName());
		System.out.println("Employee Salary : "+emp.getSalary());
		System.out.println("Employee BU :  "+emp.getBusinessUnit());
		System.out.println("Age: "+emp.getAge());
	}

}
