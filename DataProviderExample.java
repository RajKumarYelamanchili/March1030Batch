package feb28;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	@Test(dataProvider="getData")
	public void setData(String username,String password)
	{
		System.out.println("username: " + username);	
		System.out.println("password: " + password);
		
	}

	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] ="username1";
		data[0][1] ="password1";
		
		data[1][0] ="username2";
		data[1][1] ="password2";
		
		data[2][0] ="username3";
		data[2][1] ="password3";
		
		return data;
		
	}
	
}
