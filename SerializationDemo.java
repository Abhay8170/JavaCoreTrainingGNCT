//wap  to saving save object to a file using serialization  
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.Serializable;
// step 1: student class must implement serializable
   class Student implements Serializable {
    int id;
    String name;
    Student(int id, String name)
     {
        this.id = id;
        this.name = name;
    }
   }
   public class SerializationDemo {
      public static void main(String[] args) {
         try {
            // step 2: create student object
            Student s1 = new Student(101, "Abhay Sharma");
            // step 3: Create file output stream 
            FileOutputStream fos = new FileOutputStream("student.ser");
            //Step 4: Wraqp with ObjectOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // step 5: write object to file
            oos.writeObject(s1);
            //Step 6: close the streams
            oos.close();
            fos.close();
            System.out.println("Student object serialized and saved to file successfully.");
         } catch (IOException e) {
            System.out.println("An error occurred while saving the student object.");
            e.printStackTrace();
         }
      }
   }
