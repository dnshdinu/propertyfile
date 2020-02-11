package mavenpf;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readvalue {
 public static void main(String[] args) throws IOException {
	
	 //how to read properties file:
	 Properties prop=new Properties();
	 FileInputStream ip=new FileInputStream("C:\\Users\\Dineshkumar\\eclipse-workspace\\mavenpf\\src\\test\\java\\config.property");
	prop.load(ip); 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dineshkumar\\eclipse-workspace\\mavenpf\\driver\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get(prop.getProperty("url"));
     driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
     driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     driver.quit();
    
 }
	
}
