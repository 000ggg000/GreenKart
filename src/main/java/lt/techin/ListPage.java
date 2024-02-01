package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class ListPage extends BasePage {

@FindBy(css = "select#page-menu")
    WebElement sorting;

@FindBy(css = "[value='20']")
WebElement value20;

    public ListPage(WebDriver driver) {

        super(driver);
    }
    public void waiting(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    public void sortItems() {
        sorting.click();
        value20.click();


    }
}
