package com.Mobiles;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPO {
	
	@FindBy(xpath="//a[text()=\"Books\"]")
	WebElement book_ele;
	
	public void click_book()
	{
		book_ele.click();
	}
	

}
