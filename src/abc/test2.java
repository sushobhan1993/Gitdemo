package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class test2 {
	public static void main(String[] args) {
		
		//Storing driver locally 

		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver1.exe");

		WebDriver driver = new FirefoxDriver();
		
		//Open Url
	
		driver.get("https://www.google.com/");
		
		//Get title
		
		String MywebTitle = driver.getTitle();
		System.out.println("This website title is" + MywebTitle);
		
		//Capture Url
		
		System.out.println("Capturing url" + driver.getCurrentUrl());


	}

}