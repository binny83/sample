import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
 static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","//Users//bpat12//Downloads//chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstName")).sendKeys("Binny");
		driver.findElement(By.name("lastName")).sendKeys("PATEL");
		driver.findElement(By.name("phone")).sendKeys("9012886056");
		driver.findElement(By.id("userName")).sendKeys("binnyhjoshi@gmail.com");
		
		//DropDown selection
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ALGERIA");
		driver.close();
	}
	}


