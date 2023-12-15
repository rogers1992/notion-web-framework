package automation.notion.core.ui.portals.trello.pages.login;

import automation.core.ui.environment.EnvironmentManager;
import automation.core.ui.webdrives.WebDriverManager;
import automation.notion.core.ui.portals.trello.pages.startAtlassian.StartAtlassianPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Login User and Password Page Test")
public class LoginUserPasswordPageTest {
    @AfterEach
    void teardwon(){
        WebDriverManager.getInstance().quitWebDriver();
    }
    @Test
    void loginUserInPortal(){
        //Given
        EnvironmentManager environmentManager = EnvironmentManager.getInstance();
        environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
        environmentManager.setUserType(UserTypes.TRELLO_USER_PASSSWORD.val());
        //When
        LoginUserPasswordPage loginUserPasswordPage = new LoginUserPasswordPage();
        loginUserPasswordPage.loginUserInPortal();

        //Then
        StartAtlassianPage startAtlassianPage = new StartAtlassianPage();
        Assertions.assertTrue(startAtlassianPage.isSwitchToLabelDisplayed());
    }
}
