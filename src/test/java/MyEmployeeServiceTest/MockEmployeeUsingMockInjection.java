package MyEmployeeServiceTest;

import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import EmployeeServices.EmployeeDetailsService;
import TestBase.TestBase;

@RunWith(MockitoJUnitRunner.class)
public class MockEmployeeUsingMockInjection extends TestBase
{
	@Mock
	List<String> mockListEmpName;
	
	@Mock
	List<Integer> mockListEmpID;

	@InjectMocks
	EmployeeDetailsService emp;
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();
	
	
	@Test
	public void employeeMockTest()
	{
		emp.setEmpID(mockListEmpID);
		emp.setEmpName(mockListEmpName);
		
		when(mockListEmpName.get(0)).thenReturn("Ranjan");
		when(mockListEmpID.get(0)).thenReturn(111);
		when(mockListEmpName.size()).thenReturn(1);

		System.out.println(mockListEmpName.get(0));
		System.out.println(mockListEmpID.get(0));
		System.out.println(mockListEmpName.size());
		
		System.out.println(emp.getEmpName().get(0));	
		System.out.println(emp.getEmpId().get(0));
		System.out.println(emp.getEmpName().size());
		
		
		Assert.assertEquals("Ranjan", mockListEmpName.get(0));
		Assert.assertEquals(new Integer(111), mockListEmpID.get(0));
		Assert.assertEquals(1, mockListEmpName.size());
		
		Assert.assertEquals("Ranjan", emp.getEmpName().get(0));
		Assert.assertEquals(new Integer(111), emp.getEmpId().get(0));
		Assert.assertEquals(1, emp.getEmpName().size());
		
		//This will be null as it's not defined as a behavior like .. when and thenReturn
		mockListEmpName.add(1 , "Tom");
		System.out.println(mockListEmpName.get(1));
		
		//Now adding the behavior
		when(mockListEmpName.get(1)).thenReturn("Tom");
		when(mockListEmpID.get(1)).thenReturn(112);
		when(mockListEmpName.size()).thenReturn(2);
		
		System.out.println(mockListEmpName.get(1));
		System.out.println(mockListEmpID.get(1));
		System.out.println(mockListEmpName.size());
	}
}