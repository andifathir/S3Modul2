package Tugas.Original;

public class Employee extends Person implements EmployeeInterface {

    public Employee(EmployeeInfo employeeInfo) {
        super(employeeInfo.employeeName(), employeeInfo.employeeAge(), employeeInfo.salary(), employeeInfo.jobDescription());
    }

    @Override
    public void printEmployeeInfo(){
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Age : " + employeeAge);
        System.out.println("Salary : $" + salary);
        System.out.println("Job desc : " + jobDescription);
    }

    @Override
    public double calculateAnnualSalary(){
        return  salary * 12;
    }

    @Override
    public  void applyRaise(double raisePercentage){
        salary += (salary * raisePercentage / 100);
    }

    private static record EmployeeInfo(String employeeName, int employeeAge, double salary, String jobDescription) {
    }
}
