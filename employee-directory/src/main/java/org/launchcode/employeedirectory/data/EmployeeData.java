package org.launchcode.employeedirectory.data;

import org.launchcode.employeedirectory.models.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeData {

    private static final Map<Integer, Employee> employees = new HashMap<>();

    public static void add(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public static void remove(int id) {
        if (employees.containsKey(id)) {
            employees.remove(id);
        }
    }

    public static Employee getById(int id) {
        return employees.get(id);
    }


    public static Collection<Employee> getAll() {
        return employees.values();
    }

}
