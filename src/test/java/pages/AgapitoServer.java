package pages;

import support.DriverQA;

public class AgapitoServer extends BasePage {

    private String url = "http://agapito-server.herokuapp.com/";

    public AgapitoServer(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void openPage() {
        driver.openURL(url);
    }

    public void clickOpenProcessos() {
        driver.click("processos");
    }
}
