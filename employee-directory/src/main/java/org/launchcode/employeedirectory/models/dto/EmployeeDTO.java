package org.launchcode.employeedirectory.models.dto;

import org.launchcode.employeedirectory.models.Employee;

import javax.validation.constraints.NotNull;

public class EmployeeDTO {

    @NotNull
    private Employee employee;

    public EmployeeDTO() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
