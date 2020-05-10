package MyEmployeeServiceTest;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import EmployeeServices.Employee;
import EmployeeServices.EmployeePojo;
import TestBase.TestBase;

public class MockEmployeePojoUsingMockInjection extends TestBase
{
	@Mock
	private List<Employee> mockListEmp;

	@InjectMocks
	EmployeePojo empService;
	
	@Spy
	Employee emp;
	
	/*@Rule
	public MockitoRule rule = MockitoJUnit.rule();*/
	
	
	@Test
	public void employeeMockTest1()
	{		
		emp.setEmpID(111);
		emp.setEmpName("Satya");
		
		when(empService.getEmpList().get(0)).thenReturn(emp);
		when(empService.getEmpList().size()).thenReturn(1);
		
		System.out.println(empService.getEmpList().get(0).getEmpID());
		System.out.println(empService.getEmpList().get(0).getEmpName());
		System.out.println(empService.getEmpList().size());
		
		System.out.println(mockListEmp.get(0).getEmpID());
		System.out.println(mockListEmp.get(0).getEmpName());
		System.out.println(mockListEmp.size());
	}
	
	@Test
	public void employeeMockTest2()
	{		
		emp.setEmpID(111);
		emp.setEmpName("Satya");
		
		when(mockListEmp.get(0)).thenReturn(emp);
		when(mockListEmp.size()).thenReturn(1);
		
		System.out.println(empService.getEmpList().get(0).getEmpID());
		System.out.println(empService.getEmpList().get(0).getEmpName());
		System.out.println(empService.getEmpList().size());
		
		System.out.println(mockListEmp.get(0).getEmpID());
		System.out.println(mockListEmp.get(0).getEmpName());
		System.out.println(mockListEmp.size());
	}
}