package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("9578608914");
		driver.findElement(By.id("pass")).sendKeys("9964928642");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("(//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6'])[1]")).click();
	}

}
