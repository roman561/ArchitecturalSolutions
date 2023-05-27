package edu.ua.khpi.architectural.solutions.lab6;

public class SalaryReportVisitor implements ReportVisitor {
    private double totalSalary = 0;

    public double getTotalSalary() {
        return totalSalary;
    }

    @Override
    public void visit(Employee employee) {
        totalSalary += employee.getSalary();
    }

    @Override
    public void visit(Department department) {
        for (Employee employee : department.getEmployees()) {
            employee.accept(this);
        }

    }

    @Override
    public void visit(Company company) {
        for (Department department : company.getDepartments()) {
            department.accept(this);
        }
    }
}
