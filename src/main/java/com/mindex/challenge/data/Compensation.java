package com.mindex.challenge.data;

public class Compensation {

    private String compensationId;

    private String employeeId;

    private String salary;

    private String effectiveDate;

    public Compensation() {
    }

    public Compensation(String compensationId, String employeeId, String salary, String effectiveDate) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.effectiveDate = effectiveDate;
    }

    public void setCompensationId(String compensationId) {
        this.compensationId = compensationId;
    }

    public String getCompensationId() {
        return compensationId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate =  effectiveDate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

}
