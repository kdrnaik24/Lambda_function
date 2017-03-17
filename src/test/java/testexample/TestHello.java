package testexample;

import org.junit.Assert;
import org.junit.Test;

import com.amazonaws.services.lambda.runtime.Context;

import example.Hello;

public class TestHello 
{
	@Test
	public void testMyHandler()
	{
		Hello hello = new Hello();
		Context ctx = null;
		String output = hello.myHandler(20, ctx);
		if(output!= null)
		{
			System.out.println(output.toString());
		}
		Assert.assertEquals("Temperature in Farenhite68", output);
	}
}
