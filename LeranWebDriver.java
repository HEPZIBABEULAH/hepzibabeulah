package Week3.Day;

public class LearnWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Web DiverManager.chromedrive().setup();
		chromeDriver driver = new chromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().Maximize();
		WebElement elementusername= driver.findelement(By.id("username"));
		elementusername.sendkeys("DemoSalesManager");
		driver.findelement(By.name("password")).sendkeys("crmsfa");

	}

}
