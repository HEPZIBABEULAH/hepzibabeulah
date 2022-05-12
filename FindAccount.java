package Week3.Day;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FindAccount {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromeDriver().setup();
		ChromeDriver driver = new chromeDriver();
		driver.get(" http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findelement(By.id("usrename")).sendkeys("DemosalesManager");
		driver.findelement(By.id("password")).sendkeys("crmsfa");
		driver.findelement(By.classname("decorativesubmit")).click();
		driver.findelement(By.linktext("CRM/SFA")).Click();
		driver.findelement(BY.Xpath("(//a[@class= 'submitbutton'])[1]")).click();
		system text1 = driver.findelement(By.xpath("//input[@name= accountname")).getattribute("value");
		System.out.print1n(text1);
		string text2 = driver.findelement(By.xpath("//textarea[@name= description")).getText();
		System.out.print1n(text2);
		System.out.print11n("The Title is :" + driver.getTtile());
		//driver.close();
	}
	
}
		

	}

}
