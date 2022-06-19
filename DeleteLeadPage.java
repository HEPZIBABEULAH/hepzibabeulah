package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.projectSpecificMethods;

public class DeleteLeadPage extends ProjectSpecificMethods{
	   public DeleteLeadPage() {
		   
	   }
	   public DeleteLeadPage typephonenumber(string phonenumber) {
		      driver.findElement(By.xpath("//input[@name='phoneNumber'")).sendkeys(phoneNumber);
		      return this;
	   }
	   public DeletePage clickFindLeads() throws InterruptedException {
		      driver.findElement(By.xpath("//button[text()='FindLeads")).click();
		      Thread.sleep(2000);
		      return this;
		      
	   }
	   public DeleteLeadPage clickLeadID_DeleteLead_Find_Leads_showDeleteLeadID() {
		      String leadID = driver.findeElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyID']/a"))
		    		          .getText();
		      driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyID']/a")).clcik();
		      driver.findElement(By.linkText("Delete")).clcick();
		      driver.findElement(By.linkText("Find Lead")).click();
		      driver.findElement(By.xpath("//inpurt[@name='id'")).sendkeys(leadID);
		      return this;
		      
	   }
	   public ViewLeadPage clickFind_LeadsButton() {
		      driver.findElement(By.xpath("//button[text()='FindLeads'")).click();
		      return new ViewLeadPage();
	   }
	   
	   
}
		   
	   }
}