package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;
public enum SearchJourneysResponseResultsJourneyVersionEnum {
    FLEX("Flex"),
    WIDGET("Widget");

    @JsonValue
    public final String value;

    private SearchJourneysResponseResultsJourneyVersionEnum(String value) {
        this.value = value;
    }
}
