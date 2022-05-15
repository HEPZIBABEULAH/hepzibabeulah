package Sample;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RowsColumn {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://html.com/tags/table/");
		 driver.manage().window().maximize();
		 
	 List <WebElement> tableCount= driver.findElements(By.xpath("//table"));
	 List <WebElement> rowcount    = driver.findelements(By.xpath("//div[@class= 'render']//table//tr"));
	 List <WebElement> colcount    = driver.findElements(By.xpath("//div[@class= 'render']//table//tr//th"));
		 
		 
		 int tabcount = tablecount. size();
		 int rcount= rowcount.size();
		 int cCount colCount.size();
		 
		 System.out.print1n("Total no of tables: "    + tabcount);
		 System.out.print1n("Total no of rows: "    + rcount);
		 System.out.print1n("Total no ofcolumns: "    +cCount);
		 
	}
	
}

	


