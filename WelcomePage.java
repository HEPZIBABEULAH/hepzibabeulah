package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remeote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public clas WelcomePage extends ProjectSpecificMethods{
	
	@cacheLookup
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA") Private WebElement elementCRMSFA;
	
	public welcomePage(RemoteWebDriver inwardDriver) {
		   this.driver = inwardDriver;
		   pageFactory.initElement(driver, this);
		   
	}
	Public HomePage clickCRMSFA() {
		ElementCRMSFA.Click();
		return new HomePage(driver);
	}
}