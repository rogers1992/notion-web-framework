package automation.notion.core.ui.portals.trello.helpers;

import automation.core.ui.environment.EnvironmentManager;
import automation.notion.core.ui.portals.trello.pages.login.*;

import java.util.Arrays;
import java.util.stream.Stream;

public final class LoginHelper {
    private LoginHelper(){}

    public static void loginUserInPortal(String portalWeb, String userType) {
        var index = 0;
        Stream<PortalWeb> portalWebStream =
                Arrays.stream(PortalWeb.values()).filter(pw -> pw.val().equalsIgnoreCase(portalWeb));
        Stream<UserTypes> userTypesStream =
                Arrays.stream(UserTypes.values()).filter(u -> u.val().equalsIgnoreCase(userType));

        loginUserInPortal(portalWebStream.toList().get(index), userTypesStream.toList().get(index));
    }
    public static void loginUserInPortal(PortalWeb portalWeb, UserTypes userTypes){
        /*EnvironmentManager environmentManager = EnvironmentManager.getInstance();
        environmentManager.setPortalWeb(PortalWeb.TRELLO.val());
        environmentManager.setUserType(UserTypes.TRELLO_USER_PASSSWORD.val());

        LoginUserPasswordPage loginUserPasswordPage = LoginFactory.createLoginPage(portalWeb, userTypes);
        loginUserPasswordPage.loginUserInPortal();*/
        LoginFromTrelloPage loginFromTrelloPage = LoginFactory.createLoginFromTrelloPage();
        loginFromTrelloPage.loginUserFromTrello();
    }
}
