package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Pgm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
        //Simple Alert:
		//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		
        //Confirm Alert:
		//driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		//driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
	//	Thread.sleep(5000);
	//	driver.switchTo().alert().dismiss();
		
        //Prompt Alert:
	  driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		WebElement promptalert = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		promptalert.click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("Kumaran");
		driver.switchTo().alert().accept();
		String text = promptalert.getText();
		System.out.println(text);
		System.out.println("**************DONE**************");

	}

}
