package automation.core.ui.webdrives;

public enum WebDriverTypes {
    CHROME("CHROME"),
    FIREFOX("FIREFOX");



    private final String word;

    /**
     * Initializes WebDriver types enum.
     *
     * @param word original word.
     */
    WebDriverTypes(final String word) {
        this.word = word;
    }

    /**
     * Gets the enum word value.
     *
     * @return original word.
     */
    public String val() {
        return word;
    }
}
