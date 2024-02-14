package myassignment;

public class EmployeeDemo
{
    public static void main(String[] args)
    {
        Employee mars = new Employee(101,"Mars","Development",450000);
        Employee jupiter = new Employee(102,"Jupiter","Marketing",350000);

        System.out.println("Employee Information:");
        System.out.println("EmpNo: " + mars.getEmpNo() + "\n"
                + "EmpName: " + mars.getEmpName() + "\n" + "EmpDepartment: " + mars.getEmpDepartment() + "\n" + "EmpSalary: " + mars.getEmpSalary());

        System.out.println("--------------------***-----------------------");
        System.out.print("EmpNo: " + jupiter.getEmpNo() + "\n"
                + "EmpName: " + jupiter.getEmpName() + "\n" + "EmpDepartment: " + jupiter.getEmpDepartment() + "\n" + "EmpSalary: " + jupiter.getEmpSalary());
    }
}
