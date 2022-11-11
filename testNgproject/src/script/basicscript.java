package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class basicscript
{
	@Test
	public void test()
	{
		Reporter.log("beggening of framework",true);
		
	}
	@Test
	public void test1()
	{
		Reporter.log("end of frame work",false);
		
	}
	

}
