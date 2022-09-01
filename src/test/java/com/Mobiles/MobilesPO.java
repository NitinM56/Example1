package com.Mobiles;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MobilesPO {
	
	@FindBy(xpath="//a[text()=\"Mobiles\"]")
	WebElement mobile_btn;
	
	public void mobile_click() 
	{		
		mobile_btn.click();
	}

}
