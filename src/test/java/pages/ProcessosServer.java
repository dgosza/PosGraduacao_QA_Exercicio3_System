package pages;

import support.DriverQA;

public class ProcessosServer extends BasePage {
    public ProcessosServer(DriverQA driver) {
        super(driver);
    }

    public void clickNovoProcesso() {
        driver.click("btn-novo");
    }
}
