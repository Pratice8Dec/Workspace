package Selenium_grid;

import java.net.MalformedURLException;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid_setup {
	public static RemoteWebDriver driver;

	@Test
	public static void test() throws MalformedURLException, InterruptedException {

	//	String URL = "http://toolsqa.com/";
		String node1= "http://ankita172:418681cd-6434-49c5-a620-2568e43917c5@ondemand.saucelabs.com:80/wd/hub";
		// String Node = "http://192.168.0.4:5555/wd/hub";
		DesiredCapabilities cap =  DesiredCapabilities.firefox();
	
		cap.setBrowserName("firefox");
	
		cap.setVersion("40.0");
		cap.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(node1), cap);
		 
		 
		
		driver.navigate().to("http://www.google.co.in/");

	}

}
