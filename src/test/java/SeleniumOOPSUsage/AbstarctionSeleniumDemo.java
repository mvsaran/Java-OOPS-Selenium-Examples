package SeleniumOOPSUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// ✅ OOPS CONCEPT: ABSTRACTION + INHERITANCE
// This is an abstract class, so it cannot be instantiated directly.
// It defines common behavior (openUrl) and an abstract method (isPageDisplayed) that must be implemented by child classes.
abstract class AbstractPage {
    // ✅ ENCAPSULATION
    // 'protected' means subclasses can access 'driver', but it is hidden from outside.
    protected WebDriver driver;

    // ✅ CONSTRUCTOR: Initializes the driver.
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    // ✅ ABSTRACTION
    // Provides a common method to open a URL.
    public void openUrl(String url) {
        driver.get(url);
    }

    // ✅ ABSTRACTION
    // Abstract method — forces child classes to define their own version.
    public abstract boolean isPageDisplayed();
}

// ✅ OOPS CONCEPT: INHERITANCE + ABSTRACTION IMPLEMENTATION
// This concrete class extends the abstract class.
// It inherits 'driver' and 'openUrl', and provides its own implementation for 'isPageDisplayed'.
class AbstractLoginPage extends AbstractPage {

    // ✅ ENCAPSULATION
    // 'username' locator is private — only this class can access it.
    private By username = By.id("user-name");

    // ✅ CONSTRUCTOR: Passes driver to parent class constructor using 'super()'.
    public AbstractLoginPage(WebDriver driver) {
        super(driver);
    }

    // ✅ POLYMORPHISM: Method Overriding
    // Provides specific implementation of abstract method from AbstractPage.
    @Override
    public boolean isPageDisplayed() {
        WebElement userField = driver.findElement(username);
        return userField.isDisplayed();
    }
}

// ✅ MAIN CLASS — demonstrates usage of OOPS design in Selenium.
public class AbstarctionSeleniumDemo {

    public static void main(String[] args) {

        // ✅ WebDriver instantiation (setup)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // ✅ POLYMORPHISM: AbstractPage reference can point to AbstractLoginPage
        AbstractLoginPage loginPage = new AbstractLoginPage(driver);

        // ✅ INHERITANCE & ABSTRACTION: openUrl() is inherited from AbstractPage.
        loginPage.openUrl("https://www.saucedemo.com/");

        // ✅ POLYMORPHISM: Calls overridden method isPageDisplayed()
        boolean isDisplayed = loginPage.isPageDisplayed();
        System.out.println("Is Login Page Displayed? " + isDisplayed);

        driver.quit();
    }
}
