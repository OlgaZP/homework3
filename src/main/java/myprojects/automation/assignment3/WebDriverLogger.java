package myprojects.automation.assignment3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


public class WebDriverLogger extends AbstractWebDriverEventListener {
    //private static final Logger LOGGER = LoggerFactory.getLogger(WebDriverLogger.class);

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {
        System.out.println("WebDriver navigated to '" + url + "'");
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        System.out.println("WebDriver found element");
    }


    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        System.out.println("WebDriver clicked on element"    );
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        System.out.println("WebDriver sent keys " +  keysToSend[0].toString() + " to element");
    }
    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] ch) {
        System.out.println("Element field was updated to: " + ch[0]);
    }


}
