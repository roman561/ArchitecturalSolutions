package edu.ua.khpi.architectural.solutions.lab6;

public interface ReportVisitor {
    void visit(Employee employee);
    void visit(Department department);
    void visit(Company company);
}
