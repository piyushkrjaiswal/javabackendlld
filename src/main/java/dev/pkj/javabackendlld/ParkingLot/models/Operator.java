package dev.pkj.javabackendlld.ParkingLot.models;

public class Operator extends BaseModel {
    private String operatorName;
    private String empId;

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
