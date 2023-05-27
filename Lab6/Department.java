package edu.ua.khpi.architectural.solutions.lab6;

public class Department {
    private String name;
    private Employee employee;

    public Department(String name, Employee employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
