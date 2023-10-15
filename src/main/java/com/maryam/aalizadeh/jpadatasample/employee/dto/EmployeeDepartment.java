package com.maryam.aalizadeh.jpadatasample.employee.dto;

public class EmployeeDepartment {
    private String firstName;
    private String lastName;
    private Double salary;
    private String departmentName;

    public EmployeeDepartment(String firstName, String lastName, Double salary, String departmentName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.departmentName = departmentName;
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "EmployeeDepartment{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
