package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

	WebDriver driver ;
	
	//Constructor method
	public BasePage(WebDriver driver){
        this.driver = driver ;
    }
	
	public WebElement find(By locator){
        return driver.findElement(locator);
    }
	
	public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }
	
	public void click(By locator){
        find(locator).click();
    }
	
	//Elementi bulup,değer yazmak istenilirse.
	public void type(By locator , String text){
        find(locator).sendKeys(text);
    }
	
	// Görünüp-görünmediği
	public Boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }
}
