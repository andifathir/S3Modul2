package Tugas.Modified;

public class Employee extends Person implements EmployeeInterface {
    private String employeeName;
    private int employeeAge;
    private double salary;
    private String JobDescription;

    public Employee(EmployeeInfo employeeInfo) {
        this.employeeName = employeeInfo.employeeName();
        this.employeeAge = employeeInfo.employeeAge();
        this.salary = employeeInfo.salary();
        JobDescription = employeeInfo.jobDescription();
    }

    @Override
    public void printEmployeeInfo(){
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Age : " + employeeAge);
        System.out.println("Salary : " + salary);
        System.out.println("Job desc : " + JobDescription);
    }

    @Override
    public double calculateAnnualSalary(){
        return  salary * 12;
    }

    @Override
    public  void applyRaise(double raisePercentage){
        salary += (salary * raisePercentage / 100);
    }
}
