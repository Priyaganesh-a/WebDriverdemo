package testpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException {
		String tData = "Business";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver ();
driver.get( "http://newtours.demoaut.com/");

//WebElement uname = driver.findElement(By.name("userName"));
//uname.sendkeys("test");

driver.findElement(By.name("userName")).sendKeys("mercury");
driver.findElement(By.name("password")).sendKeys("mercury");

//use first letter as small letter only to identify the text box
driver.findElement(By.name("login")).click();

List<WebElement> ServiceClasses= driver.findElements(By.name("servClass"));
System.out.println(ServiceClasses.size());

for(int i = 0; i<ServiceClasses.size();i++)
{
	System.out.println(ServiceClasses.get(i).getAttribute("value"));
	
	//Click radio option based on tData
	
	if (ServiceClasses.get(i).getAttribute("value").equals(tData))
	{
		ServiceClasses.get(i).click();
	}
}

for(int i=0; i<ServiceClasses.size();i++)
{
	
	System.out.println(ServiceClasses.get(i).getAttribute("value") +"-->" +ServiceClasses.get(i).getAttribute("checked"));
}

// to check which is selected

for(int i=0; i<ServiceClasses.size();i++)
{
	 if (ServiceClasses.get(i).getAttribute("value").equals(tData))
		if(ServiceClasses.get(i).getAttribute("checked").equals("true")) 
		{
			System.out.println("OneWay Clicked");
		}

	


Thread.sleep(3000);
driver.findElement(By.linkText("SIGN-OFF")).click();



driver.close();

}}}


