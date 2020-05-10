package TestBase;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

public class TestBase
{
	@Before
	public void setUp()
	{
		MockitoAnnotations.initMocks(this);
	}
}
