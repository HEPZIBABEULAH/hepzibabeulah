package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectLeadMethods{
public CreateLeadPage() {

}
public createLeadPage typecompanyName(string companyName) {
	   driver.findElement(By.id("createLeadForm_companyName")).sendkeys(companyName);
	   return this;
	   
}
public createLeadPage typeFirstName(string FirstName) {
	   driver.findElement(By.id("createLeadForm_firstName")).sendkeys(FirstName);
	   return this;
	   
}
public createLeadPage typeLastName(string LastName) {
	   driver.findElement(By.id("createLeadForm_lastNmae")).sendkeys(LastName);
	   return this;
	   
}
public ViewLeadPage clickcreateLeadButton() {
	   driver.findElement(By.name("submitButton")).clcick();
	   return new ViewLeadPage();
	   
}



}
}
