class Employee
{
    public String fullname;
    private double salary;

    public Employee(String fullname, double salary)
    {
        this.fullname=fullname;
        this.salary=salary;
    }
    public double GetSalary(){
        return salary;
    }


}
