package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapchat_Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.snapchat.com/accounts/v2/signup");
		driver.findElement(By.name("first_name")).sendKeys("Kumar");
	}

}
