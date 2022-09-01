package com.Test;



import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.PageFactoryFinder;
import org.testng.annotations.Test;
import com.Mobiles.BrowserInit;
import com.Mobiles.MobileListPO;

public class MobleListTest extends BrowserInit {
	
	@Test
	public void mobile_List_Test() throws InterruptedException
	{
		MobileListPO obj =PageFactory.initElements(driver, MobileListPO.class);
		obj.display_mobile_list();
	}


}
