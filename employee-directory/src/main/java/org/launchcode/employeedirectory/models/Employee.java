package org.launchcode.employeedirectory.models;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Employee {

    private int id;
    private static int nextId = 1;

    private String firstName;
    private String lastName;
    private String position;

    public Employee(String firstName, String lastName, String position) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public Employee() {
        this.id = nextId;
        nextId++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return firstName + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
