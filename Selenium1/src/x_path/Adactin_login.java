package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kumarankkk");
		driver.findElement(By.xpath("(//input[@class='login_input'])[2]")).sendKeys("Kumar9999");
		
		//driver.findElement(By.xpath("//input[contains(@type,'Submit')]")).click();
		//driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Ch')]")).click();
		
		
		
			}

}
