import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import testLogger.TestResultLogger;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {

	
	 WebDriver driver ;
		// Her testten önce yapması isteniyor.
		
		@BeforeAll
		public void setUp(){
			WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://www.amazon.com.tr/");
	        driver.manage().window().maximize();
		 }
		
		@AfterAll
		public void tearDown(){
	        this.driver.quit();
	    }
}
