package automation.notion.core.ui.portals.trello.pages.board;

import automation.core.ui.environment.EnvironmentManager;
import automation.core.ui.webdrives.WebDriverManager;
import automation.notion.core.ui.portals.trello.pages.TrelloHomePage;
import automation.notion.core.ui.portals.trello.pages.login.LoginFactory;
import automation.notion.core.ui.portals.trello.pages.login.LoginFromTrelloPage;
import automation.notion.core.ui.portals.trello.pages.login.PortalWeb;
import automation.notion.core.ui.portals.trello.pages.login.UserTypes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoardPageTest {

    @AfterEach
    void teardown(){
        WebDriverManager.getInstance().quitWebDriver();
    }
    @Test
    void createBoardPageTest(){
        //Given
        EnvironmentManager environmentManager = EnvironmentManager.getInstance();
        environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
        environmentManager.setUserType(UserTypes.TRELLO_USER_PASSSWORD.val());

        //When
        TrelloHomePage trelloHomePage = TrelloHomePage.getInstance();
        trelloHomePage.goToLogin();
        LoginFromTrelloPage loginFromtrelloPage = LoginFactory.createLoginFromTrelloPage();
        loginFromtrelloPage.loginUserFromTrello();

        CreateBoardPage createBoardPage = new CreateBoardPage();
        createBoardPage.clickOnCreateNewBoardButton();
        createBoardPage.fillOnBoardTitleField("BoardTitleTestFromSelenium");
        createBoardPage.clickOnCreateButton();
        BoardPage boardPageCreated = new BoardPage();
        boardPageCreated.getBoardTitle();

        //then
        Assertions.assertEquals("BoardTitleTestFromSelenium", boardPageCreated.getBoardTitle() );
    }
}
