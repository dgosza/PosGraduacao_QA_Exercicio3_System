package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginFail;
import pages.LoginImpacta;
import pages.LoginSuccessImpacta;
import support.BaseSteps;

public class LoginImpactaSteps extends BaseSteps {

    private LoginImpacta login = new LoginImpacta(driver);
    private LoginSuccessImpacta loginSuccess = new LoginSuccessImpacta(driver);

    @Given("^the user is on the login page$")
    public void theUserIsOnTheLoginPage() {
        login.openPage();
    }

    @And("^the user fills login equal \"([^\"]*)\"$")
    public void theUserFillsLoginEqual(String user) throws Throwable {
        login.fillLogin(user);
    }

    @And("^the user fills password equal \"([^\"]*)\"$")
    public void theUserFillsPasswordEqual(String password) throws Throwable {
        login.fillPassword(password);
    }

    @When("^the user clicks on Login button$")
    public void theUserClicksOnLoginButton() {
        login.clickLogin();
    }

    @Then("^the user should see \"([^\"]*)\" into success page$")
    public void theUserShouldSeeIntoSuccessPage(String message) throws Throwable {
        Assert.assertEquals(message, loginSuccess.getResult());
    }
}
