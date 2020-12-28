package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        
        driver.findElement(By.id("confirm")).click();
        System.out.println(driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
                
        driver.findElement(By.id("confirm")).click();
        
        driver.switchTo().alert().dismiss();
        
        driver.close();
        

	}

}
