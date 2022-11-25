import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class NetworkTestCases extends NetworkPageTest {

    NetworkHomePage networkHomePage ;


    /**
     *
     *  Search product test
     */
    @Test
    @Order(1)
    public void search_product() throws InterruptedException {
        networkHomePage = new NetworkHomePage(driver);
        String url = driver.getCurrentUrl();
        System.out.println("Url is "+url);
        networkHomePage.searchBox().search("Ceket");
        Thread.sleep(500);
    }

    /**
     *
     *  Scroll down to more products button test
     */
    @Test
    @Order(2)
    public void scrollDownToMoreProducts() throws InterruptedException {
        networkHomePage = new NetworkHomePage(driver);
        networkHomePage.scrollDown();
        Thread.sleep(500);
    }


    /**
     *
     *  Click more products button test
     */
   @Test
   @Order(3)
    public void clickMoreProduct() throws InterruptedException{
        networkHomePage.moreProductsClick();
        String checkPage = driver.getCurrentUrl();
        System.out.println("Url is changed to "+checkPage);
        Thread.sleep(500);
    }

    /**
     *
     *  Hover to the first discounted product test
     */
    @Test
    @Order(4)
    public void discountedFirstProduct() throws InterruptedException{
        networkHomePage.hoverDiscountedFirstProduct();
        Thread.sleep(500);
    }

    @Test
    @Order(5)
    @Disabled("Disabled because of unfinished work")
    public void selectRandomSize() throws InterruptedException{
        networkHomePage.selectAvailableSize();
        Thread.sleep(500);
    }
}
