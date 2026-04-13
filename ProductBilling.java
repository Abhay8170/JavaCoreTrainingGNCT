//Polymorphism is the ability of an object to take on many forms. It allows us to perform a single action in different ways. In Java, there are two types of polymorphism: compile-time polymorphism (method overloading) and runtime polymorphism (method overriding).
public class ProductBilling {
    //Method 1: Billing for product one
    void bill(int price) {
        System.out.println("Total bill for 1 product: " + price);
    }
    //Method 2: Billing for product two
    void bill(int price1, int price2) {
        System.out.println("Total bill for 2 products: " + (price1 + price2));
    }  
    //Method 3: Billing for product three
    void bill(int price1, int price2, int price3) {
        System.out.println("Total bill for 3 products: " + (price1 + price2 + price3));
    }
    public static void main(String[] args) {
        //Step 1: Create object
        ProductBilling pb = new ProductBilling();
        //Step2: call overloaded methods
        pb.bill(500); // Billing for 1 product
        pb.bill(500, 200); // Billing for 2 products
        pb.bill(500, 200, 300); // Billing for 3 products
    }
}

/* This is a simple example of method overloading in Java. 
Observation: The same method name is used with different parameters to perform different tasks. 
 this problem is based on method overloading using polymorphism .
 */