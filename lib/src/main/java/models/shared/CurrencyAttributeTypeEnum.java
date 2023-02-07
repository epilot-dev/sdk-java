package .models.shared;


public enum CurrencyAttributeTypeEnum {
    CURRENCY("currency");

    public final String value;

    private CurrencyAttributeTypeEnum(String value) {
        this.value = value;
    }
}
