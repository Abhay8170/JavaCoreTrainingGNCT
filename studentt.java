//to create a class with student details roll no. , name, marks and display them using object
//step1: declare student attributes
//step 2 : create a class to display fields
//step3: create an object of student class 
// Step 2: Create a class to display fields
public class Student {
    // Step 1: Declare student attributes
    int rollNo;
    String name;
    double marks;
    // Method to display student details 
    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
    public static void main(String[] args) {
        // Step 3: Create an object of Student class
        Student s1 = new Student();
        
        // Assigning values to the object's attributes
        s1.rollNo = 1;
        s1.name = "Abhay Sharma";
        s1.marks = 85.5;
        // Call display method
        s1.displayDetails();    
    }
}
