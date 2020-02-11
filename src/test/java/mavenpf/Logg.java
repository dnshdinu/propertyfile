package mavenpf;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logg {
public static void main(String[] args) {
	
	Logger log=Logger.getLogger(Logg.class);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dineshkumar\\eclipse-workspace\\mavenpf\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	log.info("chrome is launched");
	driver.get("http://www.google.com");
	log.info("google launched");
	String title = driver.getTitle();
	System.out.println("title is "+title);
	if (title.equals("Google")) {
		System.out.println("title is google");
		log.info("title is google and test case passed");
		
	} else {
		System.out.println("title is not google");
		log.info("title is not google and test case failed");
		
	}
driver.quit();
log.info("chrome get closed");
}
}
