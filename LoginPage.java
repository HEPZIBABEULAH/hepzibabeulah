package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecicficMethods;

public class LoginPage extends ProjectSpecificMethods{
public LoginPage() { 
	
}
public LoginPage typeUserName(stringusername ) {
	   driver.findElement(By.id("username")).sendkeys(username);
	   return this;
//return new LoginPage();
// LoginPage = new loginPage();
// return page;
}
public LoginPage typePassword(string password) {
	   driver.findElement(By.id("password")).sendkeys(password);
	   return this;
	   
		   
	   }
public WelcomePage clickLoginButton() {
	   driver.findElement(By.className("decorativeSubmit")).click();
	   return new WelcomePage();
}
}