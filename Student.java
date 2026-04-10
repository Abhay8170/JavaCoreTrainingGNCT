// create a program to accept student name 
//character lenght
//Upper case
//Lower case
public class Student {
    public static void main(String[] args) {
        String studentName = "Abhay Sharma";
        //character length
        int length = studentName.length();
        System.out.println("Character Length: " + length);
        //Upper case
        String upperCaseName = studentName.toUpperCase();
        System.out.println("Upper Case: " + upperCaseName);
        //Lower case
        String lowerCaseName = studentName.toLowerCase();
        System.out.println("Lower Case: " + lowerCaseName);
    }
}
