package .models.operations;

import .utils.SpeakeasyMetadata;
public class GetActivityQueryParams {
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=operations_from")
    public Long operationsFrom;
    public GetActivityQueryParams withOperationsFrom(Long operationsFrom) {
        this.operationsFrom = operationsFrom;
        return this;
    }
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=operations_size")
    public Long operationsSize;
    public GetActivityQueryParams withOperationsSize(Long operationsSize) {
        this.operationsSize = operationsSize;
        return this;
    }
}