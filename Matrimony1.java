package week3day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Matrimony1 {
	

		public static void main(String[] args) { 
		
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.tamilmatrimony.in");
			driver.manage().window().maximize();
			driver.findElement(By.id("NAME")).sendKeys("Saranya");
			driver.findElement(By.id("MOTHERTONGUE")).sendKeys("Tamil");
			driver.findElement(By.id("EMAIL")).sendKeys("saranyavelumani@gmail.com");
			driver.findElement(By.name("PASSWD1")).sendKeys("saranay");
			WebElement findElement = driver.findElement(By.name("REGISTERED_BY"));
			Select drop=new Select(findElement);
			drop.selectByValue("1");
			driver.findElement(By.id("genderfemale")).click();
			WebElement findElement2 = driver.findElement(By.id("RELIGION"));
			Select drop2=new Select(findElement2);
			drop2.selectByValue("12");
			WebElement findElement3 = driver.findElement(By.id("COUNTRY"));
			Select drop3=new Select(findElement3);
			drop3.selectByValue("98");
			WebElement findElement4 = driver.findElement(By.id("MOTHERTONGUE"));
			Select drop4=new Select(findElement4);
			drop4.selectByValue("47");
			WebElement findElement5 = driver.findElement(By.id("DOBDAY"));
			Select drop5=new Select(findElement5);
			drop5.selectByValue("30");
			WebElement findElement6=driver.findElement(By.id("DOBMONTH"));
			Select drop6=new Select(findElement6);
			drop6.selectByValue("10");
			WebElement findElement7 = driver.findElement(By.id("DOBYEAR"));
			Select drop7=new Select(findElement7);
			drop7.selectByVisibleText("1999");
			
			
			driver.findElement(By.id("MOBILENO")).sendKeys("7904616837");





		
	

}
}
