package edu.ua.khpi.architectural.solutions.lab6;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Name1", 5000);
        Employee e2 = new Employee("Name2", 3000);
        Employee e3 = new Employee("Name3", 3500);
        Employee e4 = new Employee("Name4", 2500);
        Employee e5 = new Employee("Name5", 2000);
        Employee e6 = new Employee("Name6", 3000);

        Department itDepartment = new Department("IT", List.of(new Employee[]{e1, e2, e3}));
        Department hrDepartment = new Department("HR", List.of(new Employee[]{e4, e5, e6}));
        Company company = new Company(new Department[]{itDepartment, hrDepartment});

        SalaryReportVisitor salaryReportVisitor = new SalaryReportVisitor();
        company.accept(salaryReportVisitor);
        itDepartment.accept(salaryReportVisitor);
    }
}
