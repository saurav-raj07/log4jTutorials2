package com.accenture;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Bdc7 {

	@Test
	private void method1() {
		System.out.println("Inside Method1");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		driver.get("https://www.goibibo.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Goibibo opened");
		System.out.println("End of Method1");
		System.out.println("   ");
		
	}

	@Test
	private void method2() {
		System.out.println("Inside Method2");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		driver.get("https://www.easemytrip.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("EasemyTrip opened");
		System.out.println("End of Method2");
		System.out.println("   ");
	}

	@Test
	private void method3() {
		System.out.println("Inside Method3");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("facebook opened");
		System.out.println("End of Method3");
		System.out.println("   ");
	}

	@Test
	private void method4() {
		System.out.println("Inside Method4");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		driver.get("https://www.easyjet.com/en/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("easyJet opened");
		System.out.println("End of Method4");
		System.out.println("   ");
	}
}
