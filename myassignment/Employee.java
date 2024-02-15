package myassignment;

public class Employee
{
    private int employeeNo;
    private String employeeName;
    private double employeeSalary;
    private String employeeDepartment;
    private static String employeeCompany;

    // Constructor for setting non static values
    Employee(int empNo,String empName,double empSalary,String empDepartment)
    {
        this.employeeNo = empNo;
        this.employeeName = empName;
        this.employeeSalary = empSalary;
        this.employeeDepartment = empDepartment;
    }
    public static void setCompany(String empCompany)
    {
        employeeCompany = empCompany;
    }
    public static String getCompany()
    {
        return employeeCompany;
    }
    // getters
    public int getEmpNo()
    {
        return employeeNo;
    }
    public String getEmpName()
    {
        return employeeName;
    }
    public double getEmpSalary()
    {
        return employeeSalary;
    }
    public String getEmpDepartment()
    {
        return employeeDepartment;
    }
}
