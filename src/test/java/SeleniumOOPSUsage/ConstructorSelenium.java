package SeleniumOOPSUsage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// ✅ OOPS CONCEPT: ENCAPSULATION + CONSTRUCTOR
// This class represents a Page Object for the Login Page.
// It uses a constructor to receive WebDriver, and methods to perform actions.
class LoginPageWithConstructor {  // <<< Good naming: shows purpose is to demo constructor
    // ✅ ENCAPSULATION
    // Keeps WebDriver instance inside the class.
    WebDriver driver;

    // ✅ CONSTRUCTOR
    // Initializes the WebDriver for this page object.
    public LoginPageWithConstructor(WebDriver driver) {
        this.driver = driver;
    }

    // ✅ ABSTRACTION
    // Hides the Selenium call inside a simple method.
    public void openLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    // ✅ ABSTRACTION
    // Provides a reusable method for login action.
    // The caller does not need to know how Selenium locates elements internally.
    public void login(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}

// ✅ MAIN CLASS — demonstrates Constructor usage in Selenium OOPS style.
public class ConstructorSelenium {
    public static void main(String[] args) {

        // ✅ Setup ChromeDriver
       
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // ✅ CONSTRUCTOR called — creates an object and passes WebDriver.
        LoginPageWithConstructor loginPage = new LoginPageWithConstructor(driver);

        // ✅ ABSTRACTION — you don’t write Selenium code here, just call methods.
        loginPage.openLoginPage();
        loginPage.login("standard_user", "secret_sauce");

        driver.quit();
    }
}
