package automation.notion.core.ui.portals.trello.pages.login;

/**
 * Manages teh login pages build
 */
public final class LoginFactory {
    private LoginFactory(){

    }

    /**
     *
     * @param portalWeb the portal web name.
     * @param userTypes the credential type.
     * @return an instance of portal login page.
     */
    public static LoginUserPasswordPage createLoginPage(PortalWeb portalWeb, UserTypes userTypes) {
        if(portalWeb == PortalWeb.TRELLO){
            if(userTypes == UserTypes.TRELLO_USER_PASSSWORD){
                return new LoginUserPasswordPage();
            }
        }
        throw new IllegalArgumentException("Incorret portal we or user type.");
    }
}
