package testpack;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		String Date = "January/13/2021" ;
		String [] a= Date.split("/");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priya\\Desktop\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		
		driver.findElement(By.className("imgdp")).click();
		//Selection of year in Date picker
		
	while(true)
		{
			if(driver.findElement(By.className("ui-datepicker-year")).getText().equals(a[2]))
				
			{
				break;
				
			}else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

			}
		}
		

		//Selection of Month in Date Picker
		Thread.sleep(3000);
		while(true)
		{
			if(driver.findElement(By.className("ui-datepicker-month")).getText().equals(a[0]))
			{
				//exit
			break;
			}else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}	
		
		}
		
		driver.findElement(By.linkText(a[1])).click();
		
	Thread.sleep(3000);
	
		driver.close();

		

	}

}
