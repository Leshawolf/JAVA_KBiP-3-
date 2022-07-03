package zad2;

public class Department {
    private String nameDepartment;
    private int countWorkers;

    public Department(String nameDepartment, int countWorkers) {
        this.nameDepartment = nameDepartment;
        this.countWorkers = countWorkers;
    }

    public String getNameDepartment() {
        return nameDepartment;
    }

    public void setNameDepartment(String nameDepartment) {
        this.nameDepartment = nameDepartment;
    }

    public int getCountWorkers() {
        return countWorkers;
    }

    public void setCountWorkers(int countWorkers) {
        this.countWorkers = countWorkers;
    }
}
