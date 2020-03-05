package com.wingyfy.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.wingify.qa.base.testbase;
import com.wingify.qa.pages.heatmappage;
import com.wingify.qa.pages.homepageview;

public class homepageviewTest extends testbase {
	
	homepageview hmpageview;
	heatmappage htmappage;
	
	public homepageviewTest() {
		
		super();
	}
	
	
	@BeforeSuite
	public void setup() {
		
		initialization();
		
		hmpageview=new homepageview();
	}

	
	@Test
	public void validateheatmapbuttontest() {
		
		
		htmappage =	hmpageview.validateheatmapbutton();
		
	}
	
	
	
	
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

	
	
	
}
