package org.launchcode.employeedirectory.models;

import java.util.Objects;

public class Employee {

    private int id;
    private static int nextId = 1;

    private String name;
    private String position;

    public Employee(String name, String position) {
        this();
        this.name = name;
        this.position = position;
    }

    public Employee() {
        this.id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return name;
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
