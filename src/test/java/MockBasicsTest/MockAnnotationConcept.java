package MockBasicsTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockAnnotationConcept
{
	@Mock
	List<String> mockList;
	
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void mockListTest()
	{
		Mockito.when(mockList.get(0)).thenReturn("Satya ranjan");
		Assert.assertEquals("Satya ranjan" , "test");
	}
	
}
