package com.class23_2;

import com.class23.Employee;

public class WaterFallTeam extends Employee{

	public static void main(String[] args) {
		
		WaterFallTeam wt =new WaterFallTeam();
		wt.salary1 = 90000;//can access protected values from different package through inheritance
		//wt.salary; //default values cannot be accessed in different packages
	
		wt.test();//available cause it's protected
		//wt.test1(); Not available cause it is default
	    
	}
}
