//wap in which we create employee objects with shared company names using static variables 
/*public class Static {
    // Static variable
    static String companyName = "Tech Solutions";
    
    // Instance variables
    int empId;
    String empName;
    
    // Constructor
    Static(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    
    // Display method
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Company Name: " + companyName);
    }
    
    public static void main(String[] args) {
        Static emp1 = new Static(101, "Abhay Sharma");
        Static emp2 = new Static(102, "Azad Khan");
        
        emp1.display();
        emp2.display();
    }
}*/


import java.util.Scanner;
public class Static {
    // Static variable
    static String companyName = "Tech Solutions";
    
    // Instance variables
    int empId;
    String empName;
    
    // Constructor
    Static(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    
    // Display method
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Company Name: " + companyName);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID for Employee 1: ");
        int id1 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name for Employee 1: ");
        String name1 = sc.nextLine();
        System.out.print("Enter Employee ID for Employee 2: ");
        int id2 = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name for Employee 2: ");
        String name2 = sc.nextLine();
        Static emp1 = new Static(id1, name1);
        Static emp2 = new Static(id2, name2);
        emp1.display();
        emp2.display();   
        sc.close();
    }
}



