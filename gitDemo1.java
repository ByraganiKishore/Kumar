package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileUploadDemo1 
{
	@Test
	public void fileUpload()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/ADMIN/Downloads/FileUploadDemo1.html");
	WebElement filePath =driver.findElement(By.xpath("//input[@id='RBG']"));
	filePath.sendKeys("D:\\Audio Files\\1What is method.mp3");
	System.out.println("filePath :"+filePath);
	}

}
