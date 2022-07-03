package com.gl.departmentservice;

public class HRDepartment extends SuperDepartment{ 
	@Override
	
    public String departmentName()
    {
    	return "Hr Department";
    }
	@Override
     public String getTodayswork()
     {
    	 return "Fill today’s worksheet and mark your attendance";
     }
	@Override
     public String getWorkDeadline()
     {
    	 return "Complete by EOD";
     }
	
         public String doActivity()
     {
        	 return "team Lunch";
         }
}
