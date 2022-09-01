package com.Mobiles;

import java.util.List;

//import org.apache.poi.ss.formula.ThreeDEval;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindBys;

public class MobileListPO {
	
	@FindBy(xpath="//div[@class=\"a-section a-spacing-base\"]/div/div/h2/a/span")
	List<WebElement> mobile_list;
	
	public void display_mobile_list() throws InterruptedException
	{
		System.out.println(mobile_list.size());
		
		Thread.sleep(5000);
		for(WebElement mb_ele : mobile_list) 
		{
			System.out.println(mb_ele.getText());
		}
	}

}
