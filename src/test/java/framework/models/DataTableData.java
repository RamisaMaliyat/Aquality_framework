package framework.models;

import lombok.Getter;

@Getter
public class DataTableData {
    private Double expectedDueSum;

    public double getExpectedDueSum() {
        return  expectedDueSum;
    }
}
