//store marks of 5 students in an array and print them using loop
public class ArrayMarks {
    public static void main(String[] args) {
        int[] marks = {80, 70, 60, 50 ,90, 99, 55, 65, 86, 75};
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}
