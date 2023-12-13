package automation.notion.core.ui.portals.trello.pages.login;

public enum UserTypes {
    TRELLO_USER_PASSSWORD("TRELLO-USER-PASSWORD");
    private final String word;
    /**
     * Initializes Reserved Words enum.
     *
     * @param word original word
     */
    UserTypes(final String word){
        this.word = word;
    }
    /**
     * Get the enum word value
     *
     * @return original word
     */
    public String val(){ return word; }
}
