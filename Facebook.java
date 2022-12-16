package week3day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("saranya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mani");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("saranayvelumani1999@gmail.com");
		//driver.findElement(By.className("reg_email__")).sendKeys("7904616837");
		
		
		driver.findElement(By.id("password_step_input")).sendKeys("Saranay@1999");
		
		WebElement dropdown = driver.findElement(By.id("day"));
	    
		   Select  dropdownday=new Select(dropdown);
		   dropdownday.selectByVisibleText("25");
		   
		   

			WebElement month = driver.findElement(By.id("month"));
		    
			   Select  dropdownmonth=new Select(month);
			   dropdownmonth.selectByIndex(0);   
			  

				WebElement year = driver.findElement(By.id("year"));
			    
				   Select  dropdownyear=new Select(year);
				   dropdownyear.selectByVisibleText("1999"); 
				   driver.findElement(By.name("sex")).click();
			   
			   
			   //driver.close();
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
		   
		   
		   
		
	
	}

}
