import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NetworkHomePage extends NetworkBasePage{
    NetworkSearchBox searchBox ;
    WebElement discountedFirstProductElement;
    By moreProducts = By.xpath("//*[@id=\"pagedListContainer\"]/div[2]/div[2]/button");
    By allProductNameLocator = By.className("product__discountPercent");
    By discountedProductSize= By.name("size");








    public NetworkHomePage(WebDriver driver)
    {
        super(driver);
        searchBox = new NetworkSearchBox(driver);
    }

    public NetworkSearchBox searchBox()
    {
        return this.searchBox;
    }
    public void scrollDown()
    {
        JavascriptExecutor je = ((JavascriptExecutor) driver);
        WebElement element= driver.findElement(moreProducts);
        je.executeScript("arguments[0].scrollIntoView(false);",element);

    }

    public void moreProductsClick()
    {
        click(moreProducts);
    }
    private List<WebElement> getAllDiscountedProducts(){
        return findAll(allProductNameLocator);
    }

    private List<WebElement> getAllSizes(){
        return findAll(discountedProductSize);
    }


    public void hoverDiscountedFirstProduct()
    {
        int index=0;
        JavascriptExecutor je = ((JavascriptExecutor) driver);
        je.executeScript("arguments[0].scrollIntoView(false);",getAllDiscountedProducts().get(index));
        discountedFirstProductElement = getAllDiscountedProducts().get(index);
    }

    public void selectAvailableSize()
    {
        /*
        ** to do
         */
    }
}
