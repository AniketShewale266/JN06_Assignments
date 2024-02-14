package myassignment;

public class Employee
{
    private int empNo;
    private String empName;
    private String empDepartment;
    private double empSalary;

    Employee(int empNo,String empName, String empDepartment,double empSalary)
    {
        this.empNo = empNo;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }

    public int getEmpNo()
    {
        return empNo;
    }
    public String getEmpName()
    {
        return empName;
    }
    public String getEmpDepartment()
    {
        return empDepartment;
    }
    public double getEmpSalary()
    {
        return empSalary;
    }
}
