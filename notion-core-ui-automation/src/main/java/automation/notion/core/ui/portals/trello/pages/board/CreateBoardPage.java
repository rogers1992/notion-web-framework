package automation.notion.core.ui.portals.trello.pages.board;

import automation.core.ui.base.BasePage;
import automation.notion.core.ui.portals.trello.pages.TrelloMainHomePage;
import automation.notion.core.ui.portals.trello.pages.login.LoginFromTrelloPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateBoardPage extends BasePage {
    @FindBy(css = "div[class = 'board-tile mod-add']")
    private WebElement createBoardBtn;
    @FindBy( css = "h2[class = 'TzntopStGOcVjM']")
    private WebElement createBoardLabelFromPage;
    @FindBy(css = "input[class = 'nch-textfield__input lsOhPsHuxEMYEb lsOhPsHuxEMYEb VkPAAkbpkKnPst']")
    private WebElement boardTitleField;
    @FindBy(css = "button[class='hY6kPzdkHFJhfG bxgKMAm3lq5BpA SdamsUKjxSBwGb SEj5vUdI3VvxDc']")
    private WebElement createButton;
    private String boardTitle;
    public void createBoard(){
        /*LoginFromTrelloPage login = new LoginFromTrelloPage();
        login.loginUserFromTrello();*/

        //checking if home page was loaded
        TrelloMainHomePage homePage = new TrelloMainHomePage();
        if(homePage.workSpaceIsDisplayed() == true){
            action.click(createBoardBtn);
            action.getText(createBoardLabelFromPage);
            action.setValue(boardTitleField, boardTitle);
            action.click(createButton);
        }
    }
    public void clickOnCreateNewBoardButton(){
        action.click(createBoardBtn);
    }
    public void fillOnBoardTitleField(String boardTitle){
        action.setValue(boardTitleField, boardTitle);
    }
    public void clickOnCreateButton(){
        action.click(createButton);
    }
}
