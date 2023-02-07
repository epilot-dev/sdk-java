package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
public class GetSavedView200ApplicationJson {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view")
    public dev.epilot.sdk.models.shared.SavedViewItem view;
    public GetSavedView200ApplicationJson withView(dev.epilot.sdk.models.shared.SavedViewItem view) {
        this.view = view;
        return this;
    }
}