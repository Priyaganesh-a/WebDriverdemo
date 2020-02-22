package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.get("http://newtours.demoaut.com/");
			//WebElement uname=driver.findElement(By.name("userName"));
			//uname.sendKeys("test");

			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();

			/*Handling select drop down
			// Select values from dropdown
			Select Port = new Select(driver.findElement(By.name("airline")));
			Port.selectByVisibleText("Unified Airlines");
			
			//print all options from select dropdown
			List<WebElement> options=Port.getoptions();
			
			
			//read all options
			for(int i = 0 ; i < options.size();i++)
			{
				System.out.println(options.get(i).getText());
			}
			
			System.out.println("Selected option: " +Port.getFirstSelectedOption().getText());*/
			
			Select Count = new Select(driver.findElement(By.name("passCount")));
			
			List<WebElement> total = Count.getOptions();
			
			for(int i = 0 ; i < total.size();i++)
			{
				System.out.println(total.get(i).getText());
			}
			
			
		Count.selectByVisibleText("4");
			
			System.out.println("Selected option: " +Count.getFirstSelectedOption().getText());
			
			
			Thread.sleep(3000);

			driver.findElement(By.linkText("SIGN-OFF")).click();
			driver.close();

		}

	


	}


