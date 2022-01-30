package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/driver/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Contacts")).click();
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.id("firstNameField")).sendKeys("Devibala1");
	driver.findElement(By.id("lastNameField")).sendKeys("Rajan1");
	driver.findElement(By.className("smallSubmit")).click();
	driver.navigate().back();
	System.out.println(driver.findElement(By.id("firstNameField")).getAttribute("value"));
	System.out.println(driver.getTitle());
	driver.close();
	}

}
