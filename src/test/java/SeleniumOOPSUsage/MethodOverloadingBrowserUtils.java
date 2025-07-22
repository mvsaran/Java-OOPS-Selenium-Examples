package SeleniumOOPSUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// ✅ OOPS CONCEPT: METHOD OVERLOADING
// This class demonstrates Method Overloading:
// Multiple methods named `click` with different parameters.

public class MethodOverloadingBrowserUtils {

    // ✅ ENCAPSULATION
    // The WebDriver is kept as a class-level variable.
    WebDriver driver; // WebDriver instance to interact with the browser

    // ✅ CONSTRUCTOR
    // Receives a WebDriver instance and assigns it to the class variable.
    public MethodOverloadingBrowserUtils(WebDriver driver) {
        this.driver = driver; // ✅ Dependency Injection
    }

    // ✅ METHOD OVERLOADING: Version 1
    // Click an element using a By locator.
    public void click(By locator) {
        driver.findElement(locator).click();
    }

    // ✅ METHOD OVERLOADING: Version 2
    // Click an element using a WebElement directly.
    public void click(WebElement element) {
        element.click();
    }

    // ✅ METHOD OVERLOADING: Version 3
    // Click an element using a By locator with a timeout.
    // Shows different method signature: additional int parameter.
    public void click(By locator, int timeout) throws InterruptedException {
        // Simplified wait logic for demonstration.
        Thread.sleep(timeout * 1000);
        driver.findElement(locator).click();
    }
}
