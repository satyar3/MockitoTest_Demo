package CalculatorServiceTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import CalculatorService.CalculatorService;

public class CalculatorServiceTest
{
	@Test
	public void testMockSum()
	{
		CalculatorService mock = Mockito.mock(CalculatorService.class);
		Mockito.when(mock.add(70, 30)).thenReturn(70);
		Assert.assertEquals(70, mock.add(70, 30));
		
	}
}
