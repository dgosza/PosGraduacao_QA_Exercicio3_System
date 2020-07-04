package pages;

import support.DriverQA;

public class ReadPageProcess extends BasePage {
    public ReadPageProcess(DriverQA driver) {
        super(driver);
    }


    public String verificaNumeroProcesso() {
        return driver.getText("numero");
    }
}
