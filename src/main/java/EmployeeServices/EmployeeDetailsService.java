package EmployeeServices;

import java.util.List;

public class EmployeeDetailsService
{

	private List<String> empName;
	private List<Integer> empId;
	
	//Used for MockEmployeeUsingMockInjection
	public EmployeeDetailsService(List<String> empName, List<Integer> empId)
	{
		this.empName = empName;
		this.empId = empId;
	}
	public List<String> getEmpName()
	{
		return empName;
	}
	public void setEmpName(List<String> empName)
	{
		this.empName = empName;
	}
	public List<Integer> getEmpId()
	{
		return empId;
	}
	public void setEmpID(List<Integer> empID)
	{
		this.empId = empID;
	}
}
