package com.absa.browserCapabilities;

public class RemoteDriverCapabilities extends ACapabilities implements ICapabilities{

	private static ICapabilities INSTANCE;
	
	private RemoteDriverCapabilities()
	{
		
	}
	
	public static ICapabilities getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new RemoteDriverCapabilities();
		}
		return INSTANCE;
	}
}
