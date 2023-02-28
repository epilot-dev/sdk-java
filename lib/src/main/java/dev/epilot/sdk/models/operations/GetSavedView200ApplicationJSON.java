package dev.epilot.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GetSavedView200ApplicationJSON {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("view")
    public dev.epilot.sdk.models.shared.SavedViewItem view;
    public GetSavedView200ApplicationJSON withView(dev.epilot.sdk.models.shared.SavedViewItem view) {
        this.view = view;
        return this;
    }
    
}
