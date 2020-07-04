package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.DriverQA;

public class LoginImpacta extends BasePage {

    private String url = "file:///C:/Users/Diego%20Souza/Desktop/impacta-system-testing/html/login.html";

    public LoginImpacta(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void openPage() {
        driver.openURL(url);
    }

    public void fillLogin(String user) {
        driver.sendKeys(user, "login");
    }

    public void fillPassword(String password) {
        driver.getDriver().findElement(By.id("password")).sendKeys(password);
    }

    public void clickLogin(){
        driver.click("btnLogin");
    }
}
