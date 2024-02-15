package myassignment;

public class EmployeeDemo
{
    public static void main(String[] args)
    {
//        System.out.println(Employee.employeeCompany);
//        System.out.println(Employee.employeeCompany = "Infosys");
//        System.out.println(Employee.employeeCompany = "Wipro");

        Employee.setCompany("And Technologies"); // static

        Employee mars = new Employee(111,"Mars",600000,"Development");
        Employee jupiter = new Employee(112,"Jupiter",450000,"Marketing");
        Employee jack = new Employee(123,"Jack",350000,"Sales");
        Employee smith = new Employee(533,"Smith",600000,"Development");
        Employee John = new Employee(153,"John",550000,"HR");

        System.out.println("Employee Information Of: " + Employee.getCompany());
        System.out.println("******************************************");

        System.out.println("Employee No: " + mars.getEmpNo());
        System.out.println("Employee Name: " + mars.getEmpName());
        System.out.println("Employee Salary: " + mars.getEmpSalary());
        System.out.println("Employee Department: " + mars.getEmpDepartment());

        System.out.println("******************************************");
        System.out.println("Employee No: " + jupiter.getEmpNo());
        System.out.println("Employee Name: " + jupiter.getEmpName());
        System.out.println("Employee Salary: " + jupiter.getEmpSalary());
        System.out.println("Employee Department: " + jupiter.getEmpDepartment());
    }
}
