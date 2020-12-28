package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        driver.manage().window().maximize();
        
        System.out.println(driver.getTitle());
        
        driver.findElement(By.id("simple")).click();
        System.out.println(driver.switchTo().alert().getText());
        
        driver.switchTo().alert().accept();
        
        driver.close();

	}

}
