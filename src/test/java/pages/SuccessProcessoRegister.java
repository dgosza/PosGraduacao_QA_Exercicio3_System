package pages;

import support.DriverQA;

public class SuccessProcessoRegister extends BasePage {
    public SuccessProcessoRegister(DriverQA driver) {
        super(driver);
    }


    public String verificaMensagemSucesso() {
        return driver.getText("notice");
    }

    public void clickEditarButton() {
        driver.click("ls-btn", "class");
    }
}
