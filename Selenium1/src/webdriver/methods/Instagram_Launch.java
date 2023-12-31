package webdriver.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Launch {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		Thread.sleep(3000);
		driver.navigate().to("https://www.selenium.dev/documentation/webdriver/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		
	}

}

		
				
		
		