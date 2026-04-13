import java.io.*;

// Step 1: Serializable class
class Student implements Serializable {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class DeserializationDemo {
    public static void main(String[] args) {

        // =========================
        // SERIALIZATION (Object → File)
        // =========================
        try {
            Student s1 = new Student(101, "Abhay Sharma");

            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("Serialization Done ✅");

        } catch (Exception e) {
            System.out.println(e);
        }

        // =========================
        // DESERIALIZATION (File → Object)
        // =========================
        try {
            FileInputStream fis = new FileInputStream("student.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("Deserialization Done ✅");
            System.out.println("ID: " + s2.id);
            System.out.println("Name: " + s2.name);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
/*
 * This is a simple example of deserializing an object from a file in Java.
 * The code demonstrates how to read a serialized Student object from a file and print its details.
    * Note: Make sure that the file "student.txt" exists and contains a serialized Student object before running the deserialization part of the code. Also, ensure that the Student class is defined in the same way as it was during serialization.           
 */