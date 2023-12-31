package com.absolute_x_path;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\11Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://in.linkedin.com");
		driver.findElement(By.xpath(
		"(/html/body/main/section/div/div/form/div/div/div/div/input)[1]")).sendKeys("kumarkaruppannan38@gmail.com");
		driver.findElement(By.xpath(
		"/html/body/main/section/div/div/form/div/div[2]/div/div/input")).sendKeys("Karuppannan123");
		driver.findElement(By.xpath("/html/body/main/section/div/div/form/div[2]/button")).click();
		
        Thread.sleep(10000);
		TakesScreenshot Tss = (TakesScreenshot) driver;
		File source = Tss.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\Downloads\\Selenium\\src\\Screenshot\\likedin1.png");
		FileUtils.copyFile(source, destination);
		System.out.println("DONE");

	}

}
