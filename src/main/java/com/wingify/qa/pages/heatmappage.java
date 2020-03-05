package com.wingify.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.wingify.qa.base.testbase;

public class heatmappage extends testbase {

	public boolean selectheatmap;

	@FindBy(xpath = ".//*[contains(@class,'selected')and @data-qa='lajiwegini']")
	WebElement heatmap;

	@FindBy(xpath = ".//div[@data-qa='zarujegatu']")
	WebElement Elementlist;

	@FindBy(xpath = "//td[text()='Start Free trial']")
	WebElement Startfreetrial;

	@FindBy(css = ".element-list--heading")
	WebElement listpanel;

	@FindBy(xpath = "(.//*[text()='Start Free trial' and @data-modal='modal-free-trial'])[1]")
	WebElement freetrialtext;

	public heatmappage() {

		PageFactory.initElements(driver, this);

	}

	public boolean validateheatmappage() {

		selectheatmap = heatmap.isSelected();
		if (selectheatmap) {
			return true;
		}
		return false;
	}

	public void clickonElementlist() {
		Elementlist.click();

	}

	public String verifyElementpaneltitle() {
		
		
		return listpanel.getText();
		
	}

	public void clickonstartfreetrial() {
		
		WebElement rowname=  driver.findElement(By.xpath(".//*[@class='col-name  ellipsis' and text()='Start Free trial']"));
		rowname.click();
		System.out.println("size of row list is" + rowname.getText());
		
		
		
		String color;
		//String bgcolor= freetrialtext.getCssValue("background-color");
		
		
		
		if(freetrialtext.isEnabled())
		{
			color = freetrialtext.getCssValue("color");
			System.out.println(color);
		}
		
		
			
			
		}
}
