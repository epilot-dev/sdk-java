package .models.shared;


public enum RetryStrategyEnum {
    RETRY_AND_RESUME("RETRY_AND_RESUME"),
    RETRY_AND_STOP("RETRY_AND_STOP");

    public final String value;

    private RetryStrategyEnum(String value) {
        this.value = value;
    }
}
