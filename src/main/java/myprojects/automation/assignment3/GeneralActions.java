package myprojects.automation.assignment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Contains main script actions that may be used in scripts.
 */
public class GeneralActions {
    private EventFiringWebDriver driver;
    private WebDriverWait wait;

    public GeneralActions(EventFiringWebDriver driver) {
       this.driver = driver;
       wait = new WebDriverWait(driver, 30);
    }

    /**
     * Logs in to Admin Panel.
     * @param login
     * @param password
     */
    public void login(String login, String password) {
        // TODO implement logging in to Admin Panel
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement EmailField = driver.findElement(By.id("email"));
        //System.out.println("find email field and start to send " + login + " data");
        EmailField.click();
        EmailField.sendKeys(login);

        WebElement PswdField = driver.findElement(By.id("passwd"));
        //System.out.println("find password field");
        PswdField.sendKeys(password);

        WebElement EnterButtom = driver.findElement(By.name("submitLogin"));
        EnterButtom.click();
        System.out.println("Login to Admin panel");

      //  throw new UnsupportedOperationException();
    }

    /**
     * Adds new category in Admin Panel.
     * @param categoryName
     */
    public void createCategory(String categoryName) {
        // TODO implement logic for new category creation
        System.out.println("Start create new category process");
        By ByElement= By.cssSelector("#subtab-AdminCategories > a");
        waitForContentLoad(ByElement);
        WebElement categoryLink = driver.findElement(ByElement);

        categoryLink.click();

        ByElement= By.cssSelector("#page-header-desc-category-new_category");
        WebElement categoryAddButtom = driver.findElement(ByElement);
        categoryAddButtom.click();



       // throw new UnsupportedOperationException();

    }

    /**
     * Waits until page loader disappears from the page
     */
    public void waitForContentLoad(By ElementLocator) {
        // TODO implement generic method to wait until page content is loaded

        // wait.until(...);
        WebDriverWait waitDriver = new WebDriverWait(driver, 1000);
        waitDriver.until(ExpectedConditions.visibilityOfElementLocated(ElementLocator));
        // ...
    }

}
