package automation.notion.ui.steps;

import automation.notion.core.ui.portals.trello.helpers.LoginHelper;
import io.cucumber.java.en.Given;

public class LoginSteps {
    @Given("I login to {string} portal web with {string} credentials")
    public void iLoginToPortalWebWithCredentials(String portalWeb, String userType) {
        //it is very helpful separate Login test in order to use it to differents tests
        LoginHelper.loginUserInPortal(portalWeb, userType);

    }
}
