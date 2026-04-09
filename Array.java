// Create a class named Array and declare an array of integers with some values.
public class Array {
    public static void main(String[] args) {
        int[] numbers = {5, 2,8,1 ,9};

    } 
}
// Displaying the contents of the array
public class Array {
    public static void main(String[] args) {
        int[] numbers = {5, 2,8,1 ,9};
        System.out.println("Array Contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    } 
}
// Sort the array in ascending order and display the sorted array.
import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] numbers = {5, 2,8,1 ,9};
        System.out.println("Array Contents:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.println("\nSorted Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    } 
}