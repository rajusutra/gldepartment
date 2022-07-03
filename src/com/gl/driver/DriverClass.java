package com.gl.driver;
import com.gl.departmentservice.*;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		
		SuperDepartment super_obj= new SuperDepartment();
		HRDepartment hrd_obj= new HRDepartment();
		AdminDepartment admin_obj= new AdminDepartment();
		TechDepartment tech_obj= new TechDepartment();
	while(true) {
		System.out.println("Please enter the department from the following \n"
				+ "1. Super Department\n"
				+ "2. Admin Department\n"
				+ "3. Hr Department\n"
				+ "4. Tech Department\n"
				+ "0. Exit");
		System.out.print("Enter Your choice=");
		Scanner choice = new Scanner(System.in);		
		int depChoice=choice.nextInt();
		switch(depChoice) {
		case 1:
			System.out.println("Welcome to Super Department");
			System.out.println(super_obj.departmentName());
			System.out.println(super_obj.getTodayswork());
			System.out.println(super_obj.getWorkDeadline());
			System.out.println(super_obj.isTodayAHoliday());
			System.out.println("");
		break;
			
		case 2:
			System.out.println("Welcome to Admin Department");	
			System.out.println(admin_obj.departmentName());
			System.out.println(admin_obj.getTodayswork());
			System.out.println(admin_obj.getWorkDeadline());
			System.out.println("");
		    break;
		case 3:
			System.out.println("Welcome to HR Department");
			System.out.println(hrd_obj.departmentName());
			System.out.println(hrd_obj.getTodayswork());
			System.out.println(hrd_obj.getWorkDeadline());
			System.out.println(hrd_obj.doActivity());
			System.out.println("");
			break;
		case 4:
			System.out.println("Welcome to Tech Department");
			System.out.println(tech_obj.departmentName());
			System.out.println(tech_obj.getTodayswork());
			System.out.println(tech_obj.getWorkDeadline());
			System.out.println(tech_obj.getTechStackInformation());
			System.out.println("");
			break;
		case 0:
			System.out.print("Thank you!");
			System.exit(0);
		default:
			System.out.println("Invalid");
			break;
		}
	}
			
   }
	
}
