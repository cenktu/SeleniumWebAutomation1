import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestLogger.class)
public class NetworkPageTest {

    WebDriver driver;

    @BeforeAll
    public void test_setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.network.com.tr");
        driver.manage().window().maximize();
        Thread.sleep(500);
    }
    @AfterAll
    public void test_finished() {
        //driver.quit();
        System.out.println("Test finished");
    }
}
