package week3day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bank {
	public static void main(String[] args) {
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  
		  driver.findElement(By.id("firstName")).sendKeys("saranya");
		  WebElement title = driver.findElement(By.id("title"));
           Select  dropdown=new Select(title);
		   dropdown.selectByIndex(0);
		   
		   driver.findElement(By.id("middleName")).sendKeys("M");
		   driver.findElement(By.id("lastName")).sendKeys("Mani");
		   
		   WebElement Sex = driver.findElement(By.id("sex"));
           Select  dropdownsex=new Select(Sex);
		   dropdownsex.selectByIndex(1);
		   
		   
		   WebElement employeeStatus = driver.findElement(By.id("employmentStatus"));
           Select  dropdownstatus=new Select(employeeStatus);
           dropdownstatus.selectByIndex(0);
           
           
           driver.findElement(By.id("username")).sendKeys("saranyaManikandan");
           driver.findElement(By.id("email")).sendKeys("saranyavelumani1999@gmail.com");
           
           driver.findElement(By.id("password")).sendKeys("saranya@1999");
           
           
        //   driver.close();
           
           
           
           
           
           
           
           
           
           
           
           
           
		   
		   
		   
		   
		   
		 
		   
		   
		   
		   
		   
		   
		   
		   
}
}