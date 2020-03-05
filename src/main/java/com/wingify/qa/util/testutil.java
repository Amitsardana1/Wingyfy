package com.wingify.qa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wingify.qa.base.testbase;

public class testutil extends testbase {
	
	
	public static long page_load_timeout=20;
	public static long implicit_wait=10;
	
	public static void framelist() {
		List<WebElement> ele = driver.findElements(By.tagName("frame"));
	    System.out.println("Number of frames in a page :" + ele.size());
	    for(WebElement el : ele){
	      //Returns the Id of a frame.
	        System.out.println("Frame Id :" + el.getAttribute("id"));
	      //Returns the Name of a frame.
	        System.out.println("Frame name :" + el.getAttribute("name"));
	    }
	}

	public static void switchframe(String str) {
		List<WebElement> iframe = driver.findElements(By.tagName("iframe"));
		System.out.println("number of frames are" + iframe.size() );
		driver.switchTo().frame(str);
	}
	
	
}
