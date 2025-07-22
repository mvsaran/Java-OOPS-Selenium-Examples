package SeleniumOOPSUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// ✅ OOPS CONCEPT: INHERITANCE
// This class extends InheritedBasePage — demonstrating reusability of common functionality.
// InheritedBasePage contains driver setup and shared methods like openUrl().
public class EncapsultaionLoginPage extends InheritedBasePage {

    // ✅ OOPS CONCEPT: ENCAPSULATION
    // Locators are declared private — they are hidden from other classes.
    // Only methods inside this class can directly access them.
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    // ✅ CONSTRUCTOR
    // Accepts WebDriver as input and passes it to the parent constructor.
    // This shows **constructor chaining** and supports reusability.
    public EncapsultaionLoginPage(WebDriver driver) {
        super(driver);  // ✅ Calls InheritedBasePage constructor
    }

    // ✅ ABSTRACTION
    // Provides a clear action: `login()`.
    // Users of this class don’t need to know how Selenium locates elements — just call `login`.
    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);   // ✅ uses encapsulated locators
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginBtn).click();
    }
}
