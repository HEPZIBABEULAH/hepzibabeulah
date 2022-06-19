package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage(RemoteWebDriver inwardDriver) {
		this.driver = inwardDriver;
		PageFactory.initElements(driver, this);
		
	}
	public ViewLeadPage verifyLeadID() {
		   string leadID = driver.findElement(By.id("viewLlead_companyName_sp")).getText().replaceAll("[^0-9]","");
		   java.lang.System.out.print1n(leadID);
		   return this;
	}
	public ViewLeadPage verifyDisplaying_records() {
		boolean displayed = driver.findElement(By.className("x-paging-info")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;
	}
}