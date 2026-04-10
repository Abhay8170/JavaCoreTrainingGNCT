//to create constructor of employee class to initialise employee data
public class Constructor {
    //declare employee attributes
    int empId;
    String empName;
    double empSalary;
    //constructor to initialize employee data
    Constructor(int id, String name, double salary) {
        empId = id;
        empName = name;
        empSalary = salary; 
    }
    //method to display employee details
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSalary);
    }
    public static void main(String[] args) {
        //create an object of Constructor class and initialize employee data using constructor
        Constructor emp1 = new Constructor(101, "Abhay Sharma", 60000.0);
        //call method to display employee details
        emp1.displayEmployeeDetails();
    }
}
