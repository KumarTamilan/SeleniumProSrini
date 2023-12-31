package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Login2 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.xpath("(//input[@class='login_input'])[1]")).sendKeys("Kumarankkk");
		driver.findElement(By.xpath("(//input[@class='login_input'])[2]")).sendKeys("Kumar9999");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//select[@id='location']")).sendKeys("New York");
		driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys("Hotel creek");
		driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]")).sendKeys("Deluxe");
		driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]")).sendKeys("one");
		driver.findElement(By.xpath("//input[contains(@id,'datepick_in')]")).sendKeys("23-09-2023");
		driver.findElement(By.xpath("//input[contains(@id,'datepick_out')]")).sendKeys("24-09-2023");
		driver.findElement(By.xpath("//select[contains(@id,'adult_room')]")).sendKeys("four");
		driver.findElement(By.xpath("//select[contains(@id,'child_room')]")).sendKeys("2");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
		
		
		
		
		
		
	}
	

}
