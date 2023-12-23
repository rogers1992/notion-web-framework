package automation.notion.ui.hooks;

import automation.notion.core.ui.portals.trello.pages.board.BoardPage;
import automation.notion.core.ui.portals.trello.pages.board.BoardMenuPage;
import automation.notion.core.ui.portals.trello.pages.board.CloseBoardPage;
import io.cucumber.java.After;

public final class Boardhooks {
    @After("@deleteBoard")
    public void deleteBoard(){
        BoardPage boardPage = new BoardPage();
        boardPage.clickOnShowMenuBoardButton();
        BoardMenuPage boardMenuPage = new BoardMenuPage();
        boardMenuPage.clickOnCloseBoardButton();
        boardMenuPage.clickOnCloseButton();
        CloseBoardPage closeBoardPage = new CloseBoardPage();
        closeBoardPage.clickOnPermanentlyDeleteBoardLink();
        closeBoardPage.clickOnDeleteButton();


    }

}
