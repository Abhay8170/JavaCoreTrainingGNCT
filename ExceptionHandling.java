/*
Steps for handling exception in java
Step 1: Identify the code that may throw an exception 
*/
class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int result = 10/0; // this will throw arithmetic exception 
            System.out.println("Result:" + result);
        } catch (ArithmeticException e) { //Catching the specific exception only
           System.out.println("Error: Cannot divide by zero." + e.getMessage());
           //we can catch multiple exception by using multiple catch bolcks
        } catch (Exception e) { //catching any other exception that may occur as it is a parent class of all exception 
            // Exception class is the parent class of all exceptions, so it can catch any exception that is not caught by the previous catch block.
            //Types of Eception classes in java
            //2) Exception clas hierarchy in java
            //INdexOutOfBoundsException : in array if we try to access an index that is out of bounds
            //NullPointerException : when we try to access a method or variable of an object that is null
            //IOException : when we try to read or write a file that does not exist or is not accessible
            //FileNotFoundException : when we try to read a file that does not exist
            //NumberFormatException : when we try to convert a string to a number but the string is not a valid number
            // SQLException : when we try to connect to a database but the connection fails or the query is invalid
            System.out.println("An Unexpected error occurred: " + e.getMessage());

        } finally {
            //finally block is used to execute the code that must be executed regardless of whether an exception is thrown or not
            //it is used to close the resources like file, database connection etc.
            System.out.println("This block will always be executed.");
        }
    }
}

/*
Note: At a time we can handle more than 1 exception 
Scenario :
1) We are developing a software for a banking application. 
We can use exception handling to manage errors that may occur during transactions, such as insufficient funds, 
invalid account numbers, or network issues.
 By catching specific exceptions, we can provide meaningful error messages to the users and ensure
  that the application continues to run smoothly without crashing.
*/