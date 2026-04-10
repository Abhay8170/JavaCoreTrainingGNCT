//methodto find sum of multiple numbers
//wap to build methods for adding substracing multiplication and division and so on of two numbers
//Step 1: Declare two numbers
//method 1: a+b
//method 2: a-b
//method 3: a*b
//method 4: a/b
public class twonumbers {
    //method 1:
    public static int add(int a , int b){
        return a+b;
    }
    //method 2:
    public static int subtract(int a , int b){
        return a-b;
    }
    //method 3:
    public static int multiplication(int a , int b){
        return a*b;
    }
    //method 4:
    public static double division(int a , int b){
        return a/b;
    }
    public static void main(String[] args){
        //declare two numbers 
        int a = 20; 
        int b = 10;
        //call the method to print result
        System.out.println("Addition:" + add(a, b));
        System.out.println("Subtraction:" + subtract(a, b));
        System.out.println("multiplication:" + multiplication(a, b));
        System.out.println("division:" + division(a, b));
    }
    
}
