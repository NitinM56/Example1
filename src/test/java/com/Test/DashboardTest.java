package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Mobiles.BrowserInit;
import com.Mobiles.DashboardPO;

public class DashboardTest extends BrowserInit {
	
	@Test
	public void book_test()
	{
		DashboardPO obj= PageFactory.initElements(driver, DashboardPO.class);
		obj.click_book();
	}

}
