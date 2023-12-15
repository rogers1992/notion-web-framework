package automation.notion.core.ui.portals.trello.pages.login;

public enum PortalWeb {
    TRELLO("TRELLO");
    private final String word;

    /**
    * Initializes Reserved words enum
    *
    * @param word original word.
    */
    PortalWeb(final String word){
        this.word = word;
    }
    /**
     * Gets the enum word value
     * @return original word
     * */
    public String val(){
        return word;
    }
}
