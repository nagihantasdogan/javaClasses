package com.class30;

public interface WebDriver {
	/*Create a WebDriver Interface that will have the following unimplemented behaviour:
	 *  openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
	 *  Create 2 classes that implements WebDriver interface: 
	 * ChromeDriver and FirefoxDriver.
	 */
	
	
	void openBrowser();
	
	void closeBrowser();
	
	void  maximizeWindow();
	
	void  findElement();
}


class ChromeDriver implements WebDriver{
	
   public void openBrowser() {
	   System.out.println("You can open browser with ChromeDriver");
	
}
	
	 public void closeBrowser() {
		 System.out.println("You can close browser with ChromeDriver");
			
		
	}
	
	 public void  maximizeWindow() {
		 System.out.println("You can maximize window with ChromeDriver");
			
		
	}
	
	 public void  findElement() {
		 System.out.println("You can find element with ChromeDriver");
			
		
	}
	
}

class FirefoxDriver implements WebDriver{
	 public void openBrowser() {
		   System.out.println("You can open browser with FirefoxDriver");
		
	}
		
		 public void closeBrowser() {
			 System.out.println("You can close browser with FirefoxDriver");
				
			
		}
		
		 public void  maximizeWindow() {
			 System.out.println("You can maximize window with FirefoxDriver");
				
			
		}
		
		 public void  findElement() {
			 System.out.println("You can find element with FirefoxDriver");
				
			
		}
	
}









