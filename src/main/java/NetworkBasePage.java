import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NetworkBasePage {

    protected WebDriver driver ;

    public NetworkBasePage(WebDriver driver){
        this.driver=driver;
    }


    public WebElement find(By locator){
        return driver.findElement(locator);
    }

    public void click(By locator){
        find(locator).click();
    }

    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

}
