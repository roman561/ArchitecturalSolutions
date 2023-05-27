package edu.ua.khpi.architectural.solutions.lab6;

public class Company {
    private String name;
    private Department department;

    public Company(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Company(Department departments) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
