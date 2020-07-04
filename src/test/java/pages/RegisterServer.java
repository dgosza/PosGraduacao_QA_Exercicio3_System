package pages;

import support.DriverQA;

public class RegisterServer extends BasePage {
    public RegisterServer(DriverQA driver) {
        super(driver);
    }


    public void fillVara(String vara) {
        driver.sendKeys(vara, "processo_vara");
    }

    public void fillProcesso(String processo) {
        driver.sendKeys(processo, "processo_numero_processo");
    }

    public void fillNatureza(String natureza) {
        driver.sendKeys(natureza, "processo_natureza");
    }

    public void fillPartes(String partes) {
        driver.sendKeys(partes, "processo_partes");
    }

    public void fillSelectUrgente(String value) {
//        driver.sendKeys(value, "processo_urgente");
    }

    public void fillRadioInput(String value) {
//        driver.sendKeys(value, "processo_arbitramento_s");
    }

    public void fillAssistente(String assistente) {
        driver.sendKeys(assistente, "#processo_assistente_social", "css");
    }

    public void fillDataEntrada(String dataEntrada) {
        driver.sendKeys(dataEntrada, "#processo_data_entrada", "css");
    }

    public void fillsDataSaida(String dataSaida) {
        driver.sendKeys(dataSaida,"#processo_data_saida", "css");
    }

    public void fillAgendamento(String agendamento) {
        driver.sendKeys(agendamento,"#processo_data_agendamento", "css");
    }

    public void fillStatus(String status) {
        driver.sendKeys(status,"#processo_status", "css");
    }

    public void fillObs(String obs) {
        driver.sendKeys(obs,"#processo_observacao", "css");
    }

    public void clickSalvar() {
        driver.click("btn-save");
    }
}
