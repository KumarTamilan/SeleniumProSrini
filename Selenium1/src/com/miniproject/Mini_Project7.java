package com.miniproject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project7 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Kumarankkk");
		driver.findElement(By.xpath("(//input[contains(@class,'login_input')])[2]")).sendKeys("Kumar9999");
		driver.findElement(By.xpath("//input[contains(@class,'login_button')]")).click();
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByIndex(6);
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select sh = new Select(hotel );
		sh.selectByValue("Hotel Hervey");
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select sr = new Select(room );
		sr.selectByVisibleText("Deluxe");
		WebElement roomnos = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select sn = new Select(roomnos);
		sn.selectByIndex(6);
		WebElement adroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select sa = new Select(adroom);
		sa.selectByValue("2");
		WebElement chroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select sc = new Select(chroom);
		sc.selectByIndex(2);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Kumaran");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Karuppannan");
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("K.Kumar,S/O,P.Karuppannan,vandimedu,viruthasampatty,viruthasampatty(po),Mecheri(Via),Mettur(TK),Salem(DT).");
		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("9988776655443322");
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select scc = new Select(cctype);
		scc.selectByIndex(2);
		WebElement ctype = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select sct = new Select(ctype);
		sct.selectByIndex(6);
		WebElement cetype = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select scy = new Select(cetype);
		scy.selectByIndex(10);
		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("6543");
		driver.findElement(By.xpath("(//input[@type='button'])[1]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='logout']")).click();
		Thread.sleep(6000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\miniproject1.png");
		FileUtils.copyFile(source, Destination);
		driver.navigate().back();
		driver.close();
	
	}

}
