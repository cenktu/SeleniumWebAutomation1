import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NetworkSearchBox extends NetworkBasePage{

    By searchBox= By.id("search");
    public NetworkSearchBox(WebDriver driver)
    {
        super(driver);
    }
    public void search(String text)
    {
        type(searchBox,text);
        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);

    }
}
