package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver  chromeDriver=new ChromeDriver();
		WebDriver firefoxDriver=new FirefoxDriver();
		chromeDriver.openBrowser();
		chromeDriver.closeBrowser();
		chromeDriver.maximizeWindow();
		chromeDriver.findElement();
		firefoxDriver.openBrowser();
		firefoxDriver.closeBrowser();
		firefoxDriver.maximizeWindow();
		firefoxDriver.findElement(); 
		

	}

}
