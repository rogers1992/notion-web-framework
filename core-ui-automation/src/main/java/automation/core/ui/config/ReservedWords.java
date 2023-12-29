package automation.core.ui.config;

enum ReservedWords {
    BROWSER("browser"),
    ENVIRONMENT_NAME("environmentName"),
    EXPLICIT_TIME("explicitTimeWait"),
    IMPLICIT_TIME("implicitTimeWait"),
    PAGE_LOAD_TIME("pageLoadTimeWait"),
    SLEEP_TIME("sleepWaitTime"),
    CHROME_DRIVER_VERSION("chromeDriverVersion"),
    FIREFOX_DRIVER_VERSION("firefoxDriverVersion"),
    WIDTH("width"),
    HEIGHT("height"),
    HEADLESS_MODE("headlessMode"),
    DOWNLOADS("downloads"),
    USERNAME("userName"),
    PASSWORD("userPassword");

    private final String word;

    /**
     * Initializes Reserved Words enum.
     *
     * @param word original word.
     */
    ReservedWords(final String word) {
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

