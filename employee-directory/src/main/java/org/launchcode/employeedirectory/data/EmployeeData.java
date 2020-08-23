package org.launchcode.employeedirectory.data;

import org.launchcode.employeedirectory.models.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeData {

    private static final Map<Integer, Employee> employees = new HashMap<>();

    public static void add(Employee employee) {
        employees.put(employee.getId(), employee);
    }

}
