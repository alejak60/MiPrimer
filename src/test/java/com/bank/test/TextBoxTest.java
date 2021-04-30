package com.bank.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"..\\TestBank\\src\\main\\resources\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.get("https://demoqa.com/text-box");
	}
}
