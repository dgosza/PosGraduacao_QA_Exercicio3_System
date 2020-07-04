package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class SystemTestingSteps extends BaseSteps {


    private AgapitoServer homePage = new AgapitoServer(driver);
    private ProcessosServer processosPage = new ProcessosServer(driver);
    private RegisterServer processosRegister = new RegisterServer(driver);
    private SuccessProcessoRegister processRegisterSuccess = new SuccessProcessoRegister(driver);
    private ReadPageProcess readPageProcess = new ReadPageProcess(driver);


    @Given("^the user is on Agapito server page$")
    public void theUserIsOnAgapitoServerPage() {
        homePage.openPage();
    }

    @And("^the user clicks Process menu in left side$")
    public void theUserClicksProcessMenuInLeftSide() {
        homePage.clickOpenProcessos();
    }

    @And("^the user clicks on Novo Processo Button$")
    public void theUserClicksOnNovoProcessoButton() {
        processosPage.clickNovoProcesso();
    }

    @And("^the user fills the vara input \"([^\"]*)\"$")
    public void theUserFillsTheVaraInput(String vara) throws Throwable {
        processosRegister.fillVara(vara);
    }

    @And("^the user fills the numero processo input \"([^\"]*)\"$")
    public void theUserFillsTheNumeroProcessoInput(String processo) throws Throwable {
        processosRegister.fillProcesso(processo);
    }

    @And("^the user fills the Natureza input \"([^\"]*)\"$")
    public void theUserFillsTheNaturezaInput(String natureza) throws Throwable {
        processosRegister.fillNatureza(natureza);
    }

    @And("^the user fills the Partes input \"([^\"]*)\"$")
    public void theUserFillsThePartesInput(String partes) throws Throwable {
        processosRegister.fillPartes(partes);
    }

    @And("^the user fills the Select input \"([^\"]*)\"$")
    public void theUserFillsTheSelectInput(String value) throws Throwable {
        processosRegister.fillSelectUrgente(value);
    }

    @And("^the user fiils the Radio input \"([^\"]*)\"$")
    public void theUserFiilsTheRadioInput(String value) throws Throwable {
        processosRegister.fillRadioInput(value);
    }

    @And("^the user fills the assistente social input \"([^\"]*)\"$")
    public void theUserFillsTheAssistenteSocialInput(String assistente) throws Throwable {
        processosRegister.fillAssistente(assistente);
    }

    @And("^the user fills the data entrada input \"([^\"]*)\"$")
    public void theUserFillsTheDataEntradaInput(String dataEntrada) throws Throwable {
        processosRegister.fillDataEntrada(dataEntrada);
    }

    @And("^the user fills the data saida input \"([^\"]*)\"$")
    public void theUserFillsTheDataSaidaInput(String dataSaida) throws Throwable {
        processosRegister.fillsDataSaida(dataSaida);
    }

    @And("^the user fills the data agendamento input \"([^\"]*)\"$")
    public void theUserFillsTheDataAgendamentoInput(String agendamento) throws Throwable {
        processosRegister.fillAgendamento(agendamento);
    }

    @And("^the user fills the status input \"([^\"]*)\"$")
    public void theUserFillsTheStatusInput(String status) throws Throwable {
        processosRegister.fillStatus(status);

    }

    @And("^the user fills the observacao input \"([^\"]*)\"$")
    public void theUserFillsTheObservacaoInput(String obs) throws Throwable {
        processosRegister.fillObs(obs);
    }

    @And("^the user clicks on Register new Processo$")
    public void theUserClicksOnRegisterNewProcesso() {
        processosRegister.clickSalvar();
        processosRegister.saveIdProcess();
    }

    @And("^the user should see \"([^\"]*)\" message$")
    public void theUserShouldSeeMessage(String msg) throws Throwable {
        Assert.assertEquals(msg, processRegisterSuccess.verificaMensagemSucesso());
    }

    @Then("^the user clicks on show button$")
    public void theUserClicksOnShowButton() {
        String idButton = processosRegister.getLastProcess();
        processosPage.showProcesso(idButton);
    }

    @Then("^the user should see numero processo with value equal \"([^\"]*)\"$")
    public void theUserShouldSeeNumeroProcessoWithValueEqual(String numeroProcesso) throws Throwable {
        Assert.assertEquals(numeroProcesso, readPageProcess.verificaNumeroProcesso());
    }

    @And("^the user clicks on editar button$")
    public void theUserClicksOnEditarButton() {
        String idButton = processosRegister.getLastProcess();
        processosPage.updateProcess(idButton);
    }

    @And("^the user clicks on delete button$")
    public void theUserClicksOnDeleteButton() {
        String idButton = processosRegister.getLastProcess();
        processosPage.deleteProcess(idButton);
    }

    @And("^the user confirms delete$")
    public void theUserConfirmsDelete() {
        processosPage.confirmDelete();
    }

    @Then("^the user should not see last process code$")
    public void theUserShouldNotSeeLastProcessCode() {
        Assert.assertFalse("There is a proccess with this code" + processosRegister.getLastProcess(), processosPage.existProcess(processosRegister.getLastProcess()));
    }

    @Then("^the user should see in the same page \"([^\"]*)\" message$")
    public void theUserShouldSeeInTheSamePageMessage(String message) throws Throwable {
        Assert.assertEquals(message, processosRegister.verificaMsgErro());
    }

    @And("^the user clicks on Salvar new Processo$")
    public void theUserClicksOnSalvarNewProcesso() {
        processosRegister.clickSalvar();
    }
}
