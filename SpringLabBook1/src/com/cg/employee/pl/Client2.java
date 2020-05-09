package com.cg.employee.pl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.employee.bean.Employee;
import com.cg.employee.bean.EmployeeSbu;

public class Client2 {

	public static void main(String[] args) {
		
		
	ApplicationContext ctx=new ClassPathXmlApplicationContext("bean2.xml");
	
	EmployeeSbu emp=ctx.getBean("emp",EmployeeSbu.class);
	System.out.println("Employee Details");
	System.out.println("-------------------------");
	System.out.println("Employee {empAge="+emp.getAge()+", empId="+emp.getEmployeeId()+", empName="+emp.getEmployeeName()+", empSalary="+emp.getSalary()+"}");
	System.out.println("sbu details=Sbu {sbuId="+emp.getBusinessUnit().getSbuName()+", sbuHead="+emp.getBusinessUnit().getSbuHead()+", sbuName="+emp.getBusinessUnit().getSbuName()+"}");
	
		

	}

}
