package oops.SOLID.openClosePrinciple.before.employees;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

    public EmployeeType getEmployeeType() {
        return EmployeeType.FULL_TIME;
    }
}
