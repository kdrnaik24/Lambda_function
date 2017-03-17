package example;

import com.amazonaws.services.lambda.runtime.Context;

public class Hello 
{
	public String myHandler(int myCount, Context context) 
	{
		System.out.println("Temperature in Celcius :"+myCount);
		int F=(myCount * 9/5) + 32;
		System.out.println(F);
		String str = "Temperature in Farenhite"+String.valueOf(F);
        return str;
	}
}
