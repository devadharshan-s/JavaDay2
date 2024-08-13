package Assignment;

public class Employee {
    String name;
    int id;
    int salary;

    Employee(){
        this.name = "";
        this.id = 0;
        this.salary = 0;
    }

    Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayEmployeeInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 10, 500);
        emp1.displayEmployeeInfo();
    }
}
