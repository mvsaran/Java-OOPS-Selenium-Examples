package SeleniumOOPSUsage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

// ✅ OOPS CONCEPT: BASE CLASS FOR METHOD OVERRIDING
// This BaseTest class is designed to be **extended** by child test classes.
// Child classes can **override** setup() to provide custom setup logic.
public class MethodOverridingBaseTest {

    // ✅ ENCAPSULATION
    // Protected WebDriver can be accessed by subclasses but hidden from outside the framework.
    protected WebDriver driver; // WebDriver instance to be used in tests

    @BeforeMethod
    public void setup() { 
        // ✅ SETUP METHOD
        // This method sets up the WebDriver before each test.
        // 👉 OOPS: This method is **meant to be overridden** in child classes for custom behavior.

       
        // It should be just `driver = new ChromeDriver();` without `WebDriver`.
        driver = new ChromeDriver(); // ✅ uses the class-level driver
        System.out.println("BaseTest setup called");
    }

    @AfterMethod
    public void teardown() {
        // ✅ CLEANUP METHOD
        // This method cleans up after each test.
        // Since `setup()` initializes `driver`, we quit it here.
        driver.quit();
    }
}
