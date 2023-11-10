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
	public static Properties prop;
	
	public static void init() {
		
		try {
			FileInputStream file = new FileInputStream("C:\\Users\\abhay\\eclipse-workspace\\MiniProject1\\config.properties");
			prop = new Properties();
			prop.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (prop.getProperty("browser").contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}else if (prop.getProperty("browser").contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("please enter valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
}
