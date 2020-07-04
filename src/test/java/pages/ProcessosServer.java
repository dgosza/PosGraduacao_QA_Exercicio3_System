package pages;

import org.openqa.selenium.By;
import support.DriverQA;

public class ProcessosServer extends BasePage {
    public ProcessosServer(DriverQA driver) {
        super(driver);
    }

    public void clickNovoProcesso() {
        driver.click("btn-novo");
    }

    public void showProcesso(String idButton) {
        String button = "btn-show_"+idButton;
        driver.click(button);
    }

    public void updateProcess(String idButton) {
        String button = "btn-edit_"+idButton;
        driver.click(button);
    }

    public void deleteProcess(String idButton) {
        String button = "btn-delete_"+idButton;
        driver.click(button);
    }

    public void confirmDelete() {
        driver.ChooseOkOnNextConfirmation();
    }

    public boolean existProcess(String lastProcess) {
        String idProcess = "btn-delete_"+lastProcess;
        return driver.getDriver().getPageSource().contains(idProcess);
    }
}
