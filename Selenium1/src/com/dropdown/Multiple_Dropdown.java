package com.dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kumar\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

		WebElement multipledropdown = driver.findElement(By.xpath("(//select[@class='col-lg-3'])[1]"));
		Select s = new Select(multipledropdown);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("pizza");
		Thread.sleep(2000);

		s.selectByVisibleText("Donut");
		Thread.sleep(2000);

		s.selectByValue("burger");

		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			List<WebElement> alloptions = s.getAllSelectedOptions();
			for (WebElement webElement2 : alloptions) {
				System.out.println(webElement2.getText());
				// s.getFirstSelectedOption();
				s.deselectAll();

			}
		}
	}
}
