package dev.epilot.sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CurrencyAttributeCurrency1
 * A currency configuration
**/
public class CurrencyAttributeCurrency1 {
    @JsonProperty("code")
    public String code;
    public CurrencyAttributeCurrency1 withCode(String code) {
        this.code = code;
        return this;
    }
    @JsonProperty("description")
    public String description;
    public CurrencyAttributeCurrency1 withDescription(String description) {
        this.description = description;
        return this;
    }
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flag")
    public String flag;
    public CurrencyAttributeCurrency1 withFlag(String flag) {
        this.flag = flag;
        return this;
    }
    @JsonProperty("symbol")
    public String symbol;
    public CurrencyAttributeCurrency1 withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
}
