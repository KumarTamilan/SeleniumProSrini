package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Website {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.id("item-0")).click();
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Kumaran");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Kumaranharsh123@gmail.com");
		driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]")).sendKeys(""
				+ "K.Kumar,S/O,P.Karuppannan,vandimedu,viruthasampatty,viruthasampatty(po),Mecheri(Via),Mettur(TK),Salem(DT).");
		driver.findElement(By.xpath("(//textarea[@class='form-control'])[2]")).sendKeys(""
				+ "K.Kumar,S/O,P.Karuppannan,vandimedu,viruthasampatty,viruthasampatty(po),Mecheri(Via),Mettur(TK),Salem(DT)");  
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	
	}

}
