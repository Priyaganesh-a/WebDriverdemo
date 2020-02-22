package testpack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.linkText("Alert with OK")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		//X-path is used as there is a space in Class name attribute
		
		Alert a = driver.switchTo().alert();
	    
		System.out.println(a.getText());
		a.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
	
	     a.sendKeys("Priya");
	     a.accept();
		Thread.sleep(3000);
		driver.close();
	

	}

}
