package pages;

import support.DriverQA;

public class LoginSuccessImpacta extends BasePage {
    public LoginSuccessImpacta(DriverQA driver) {
        super(driver);
    }


    public String getResult() {
        return driver.getText("result");
    }
}
