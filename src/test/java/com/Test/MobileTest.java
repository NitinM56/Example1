package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import com.Mobiles.BrowserInit;
import com.Mobiles.MobilesPO;


public class MobileTest extends BrowserInit {
	
	@Test
	public void mobile_Test()
	{
		MobilesPO obj= PageFactory.initElements(driver, MobilesPO.class);
		obj.mobile_click();
	}
}
