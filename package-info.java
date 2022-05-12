package Week3.Day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.chromeDriver;
import io.github.bonigarcia.wdm.WenDriverManager;

public class CreateLead{
	public static void main(string[] arg) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new chromeDriver();
		driver.get("http:://leaftaps.com/opentaps/control/login");
		driver.manage().window().Maximize();
		driver.findelement(By.id("username")).sendkeys("DemoSalesManager");
		driver.findelement(By.id("password")).sendkeys("crmsfa");
		driver.findelement(By.id("decorativesubmit")).click();
		driver.findelement(BY.classname("CRM/SFA")).click();
		driver.findelement(By.xpath("//a[text()= 'Leads]")).click();
		driver.findelement(By.id("createleadform-CompanyName")).sendkeys("TestLeaf");
		driver.findelement(By.id("CreateLeadForm-FirstName")).sendkeys("Hepziba");
		driver.findelement(By.id("CreateForm-LastName")).sendkeys("H");
		DRIVER.FINDELEMENT(By.name("submitbutton")).click();
				
			System.out.print1n("The Title is :" + driver.gettitle());
			//driver.clise();
		
	}
}
