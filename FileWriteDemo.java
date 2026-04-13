/* this is a simple example of writing an object to a file in Java.                                         
in which filewriter and IOException are imported 
to write this code some steps are to be followed
Step 1: Create a class 
Step 2: Open the file in write mode
Step 3: wirte the code and compile during which object will converted into byte conde ands it will get compiled
 */
import java.io.FileWriter;
import java.io.IOException;
//Student class (no need to make it public here)
class Student {
    int id; 
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    } 
}
public class FileWriteDemo 
{
    public static void main(String[] args)
     {
        //Step 1: Create student object
        Student student = new Student(1, "Abhay Sharma");
        //Step 2: Write student details to a file
        try {
            FileWriter fw = new FileWriter("student.txt");
            //write object data to file
            fw.write("Student ID: " + student.id + "\n");
            fw.write("Student Name: " + student.name + "\n");
            fw.close();
            System.out.println("Student details written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
    }
}
}
