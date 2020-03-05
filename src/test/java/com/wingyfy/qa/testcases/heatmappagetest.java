package com.wingyfy.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.wingify.qa.base.testbase;
import com.wingify.qa.pages.heatmappage;
import com.wingify.qa.pages.homepageview;
import com.wingify.qa.util.testutil;

public class heatmappagetest extends testbase {
	
	
	homepageview hmpageview;
	heatmappage htmappage;
	
	public heatmappagetest() {
		super();
	}
	
	@BeforeSuite
	public void setup() {
		initialization();
		
		hmpageview=new homepageview();
		
		hmpageview.validateheatmapbutton();
	}
	
	
	@Test(priority=1)
	public void validateheapmapselected()
	{
		 htmappage = new heatmappage();
		 testutil.switchframe("heatmap-iframe");
		htmappage.validateheatmappage();
		 
	}
	
	@Test(priority=2)
	public void validateElementlistselected() {
		//testutil.switchframe();
		htmappage.clickonElementlist();
		
	}
	
	@Test(priority=3)
	public void verifypaneltext() {
		driver.switchTo().defaultContent();
		
		//testutil.switchframe("");
		driver.switchTo().frame("element-list-iframe");
	String PanelTitle=	htmappage.verifyElementpaneltitle();
	Assert.assertEquals(PanelTitle, "ELEMENT LIST");
	}
	
	@Test(priority=4)
	public void validatestartfreetrial() {
		
		htmappage.clickonstartfreetrial();
	}
	
    @AfterSuite
    public void teardown()
    {
    	driver.quit();
    }
}
