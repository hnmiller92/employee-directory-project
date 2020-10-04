package org.launchcode.employeedirectory.models;

public enum EmployeeStatus {

    FULL("Full-time"),
    PART("Part-time"),
    PRN("PRN");

    private final String displayName;

    EmployeeStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
