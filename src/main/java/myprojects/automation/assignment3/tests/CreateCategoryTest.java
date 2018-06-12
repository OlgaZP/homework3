package myprojects.automation.assignment3.tests;

import myprojects.automation.assignment3.BaseScript;
import myprojects.automation.assignment3.GeneralActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class CreateCategoryTest extends BaseScript {
    public static void main(String[] args) throws InterruptedException {
        // TODO prepare driver object
        EventFiringWebDriver edriver = getConfiguredDriver();

        // login
        GeneralActions TestAction = new GeneralActions(edriver);
        TestAction.login("webinar.test@gmail.com","Xcg7299bnSmMuRLp9ITw");
        // create category
        TestAction.createCategory("MyTestCategory");
        // check that new category appears in Categories table

        // finish script
        edriver.close();
        edriver.quit();
    }
}
