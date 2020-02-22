package testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MenuHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		Actions act = new Actions(driver);
		
		
		/*act.moveToElement(driver.findElement(By.linkText("Widgets"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Datepicker")).click();
		Thread.sleep(3000);*/
		
		
		
		act.moveToElement(driver.findElement(By.linkText("Interactions"))).perform();
		Thread.sleep(3000);
		
		act.moveToElement(driver.findElement(By.linkText("Drag and Drop"))).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Dynamic")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		


		
	}

}
