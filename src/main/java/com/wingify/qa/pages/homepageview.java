package com.wingify.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wingify.qa.base.testbase;

public class homepageview extends testbase{
	
	@FindBy(xpath= ".//*[contains(@class,'show-on-hover')]")
	WebElement viewheatmap;
	
	@FindBy(xpath=".//*[contains(@class,'heatmap-thumb_')]")
	WebElement image;
	
	
	public homepageview()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public heatmappage validateheatmapbutton() {
		Actions act = new Actions(driver);
		act.moveToElement(image);
		act.build().perform();
		
		
		viewheatmap.click();	
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		//switch to new tab
		driver.switchTo().window(browserTabs .get(1));
		return new heatmappage();
	}


	
	}


