package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_Signup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("9578608914");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Kumar666");
		driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
		driver.findElement(By.xpath("//span[@class='_ab37']")).click();
		driver.findElement(By.id("email")).sendKeys("9578608914");
		driver.findElement(By.id("pass")).sendKeys("9964928642");
		driver.findElement(By.id("loginbutton")).click();
			}

}
