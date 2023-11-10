package base;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
		
	public static WebDriver driver;
	public static Properties properties;
	public static void init() {
		try {
			FileInputStream fileInputStream = new FileInputStream("");
			properties = new Properties();
			properties.load(fileInputStream);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		if (properties.getProperty("browser").contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (properties.getProperty("browser").contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else {
			System.out.println("enter valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(properties.getProperty("url"));
	}
}