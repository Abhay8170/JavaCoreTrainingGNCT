//to show how instant variable differentiate from local variable 
//resolve variable conflicts 
/*public class instant {
   //Instance variable 
   int empId;
   String empName;
   //Constructor with same variable names as instance variables
    instant(int empId, String empName) {
        //Using 'this' keyword to refer to instance variables
        this.empId = empId; 
        this.empName = empName; 
    }
    //Display method 
    void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
    public static void main(String[] args) {
        //Creating object of instant class and initializing instance variables using constructor
        instant emp1 = new instant(101, "Abhay Sharma");
        //Calling display method to show employee details
        emp1.display();
    }
}*/



import java.util.Scanner;
public class instant {
   //Instance variable 
   int empId;
   String empName;
   //Constructor with same variable names as instance variables
    instant(int empId, String empName) {
        //Using 'this' keyword to refer to instance variables
        this.empId = empId; 
        this.empName = empName; 
    }
    //Display method 
    void display(){
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        instant emp1 = new instant(id, name);
        //Calling display method to show employee details
        emp1.display();
        sc.close();
    }
}
