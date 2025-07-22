package SeleniumOOPSUsage;

import org.openqa.selenium.WebDriver;

// ✅ OOPS Concept: INHERITANCE
// This BasePage class acts as a **parent class** (superclass).
// Other page classes (e.g., LoginPage, HomePage) will **extend BasePage**.
// They inherit its fields and methods, avoiding code duplication.

// ✅ OOPS Concept: ENCAPSULATION
// The WebDriver 'driver' field is marked 'protected'.
// This restricts direct access from outside the class but allows access in child classes.
// The class exposes controlled actions (e.g., openUrl()) as public methods.

public class InheritedBasePage {

    // ✅ ENCAPSULATION: restricted access to driver, shared safely with subclasses.
    protected WebDriver driver;

    // ✅ CONSTRUCTOR: OOPS concept of **constructor overloading** could be applied if needed.
    // Here, the constructor sets up the state (driver) for the page object.
    public InheritedBasePage(WebDriver driver) {
        this.driver = driver;
    }

    // ✅ ABSTRACTION: This method hides the internal Selenium API call.
    // Consumers of this class just call 'openUrl' without needing to know how driver.get() works.
    public void openUrl(String url) {
        driver.get(url);
    }
}
