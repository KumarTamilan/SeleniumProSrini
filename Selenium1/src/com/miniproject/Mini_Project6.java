package com.miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project6 {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\11Selenium\\Chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String a = "AmaZoN";
		String url = "https://www.amazon.in/";
		String b = a.toLowerCase();
		System.out.println(b);

		driver.get("https://www.amazon.in/");
		if (url.contains(b)) {
			Thread.sleep(5000);
			WebElement findElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
			findElement.click();
			Select s = new Select(findElement);
			boolean multiple = s.isMultiple();
			System.out.println(multiple);
			List<WebElement> options = s.getOptions();
			for (WebElement webElement : options) {
				System.out.println(webElement.getText());
			}

		} else {
			driver.close();
		}

		WebElement c2 = driver.findElement(By.xpath("//input[@type='text']"));
		c2.sendKeys("Comics");
		Thread.sleep(4000);
		List<WebElement> c3 = driver.findElements(By.xpath("//div[@role='button']"));
		WebElement d;
		Thread.sleep(4000);
		for (int i = 0; i < c3.size(); i++) {
			d = c3.get(i);
			System.out.println(d.getText());
			if (d.getText().equals("comics")) {
				d.click();
			} else {
				driver.close();
			}

		}
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Amazon2.png");
		FileUtils.copyFile(source, destination);

		Actions s = new Actions(driver);
		Thread.sleep(10000);

		try {
			WebElement findElement = driver.findElement(By.xpath(
					"((//span[text()='Results']//parent::div//parent::div//parent::span//ancestor::div)[7]//following-sibling::script[1]//following-sibling::div[1]//descendant::div)[18]//following-sibling::h2//descendant::span"));
			s.contextClick(findElement).build().perform();
			Thread.sleep(5000);

		} catch (NoSuchElementException e) {

		}

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		String Parentid = driver.getWindowHandle();
		System.out.println(Parentid);
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		List<String> list = new ArrayList<String>(allid);
		list.get(2);

		/*
		 * for (String id : allid) { if (!id.equals(Parentid)) { } Thread.sleep(5000);
		 */
		// driver.switchTo().window(id);
		driver.getTitle();

		/*
		 * driver.navigate().to(
		 * "https://www.amazon.in/Superman-Action-Comics-Vol-Bulletproof/dp/1401241018/ref=sr_1_1_sspa?crid=3LWDT4UVK7SEJ&keywords=comics&qid=1698824132&sprefix=Comics%2Caps%2C475&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1"
		 * );
		 */
		Thread.sleep(6000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File source1 = ts1.getScreenshotAs(OutputType.FILE);
		File destination1 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Amazon3.png");
		FileUtils.copyFile(source1, destination1);

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();

		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@type='submit'])[3]")).click();
		Thread.sleep(10000);

		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File source2 = ts2.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\kumar\\Downloads\\11Selenium\\src\\Screenshot\\Amazon4.png");
		FileUtils.copyFile(source2, destination2);

		// if (!d.equals(c2)) {
		// System.out.println(d.click());
	}

}

/*
 * if (c3.contains(c2)) { c2.click(); }else { driver.close(); }
 */
/*
 * for (WebElement c2 : c3) { if (!c2.equals(c3)) { System.out.println(c2);
 * c2.click();
 */
