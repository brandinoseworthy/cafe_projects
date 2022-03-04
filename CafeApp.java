import java.util.Scanner;

public class CafeApp {

    public static void main(String[] args) {


        //Rewrite the CafeApp class to utilize the Scanner class to accept orders for each product and, as before,
        // print the name, description, quantity, and product subtotal for each item along with the sales subtotal,
        // sales tax, and sales total.

        Coffee item1 = new Coffee("Coffee", 2.2, "Chocolate",  true, false);
        Espresso item2 = new Espresso("Espresso", 2, "Foamy", true, true);
        Cappuccino item3 = new Cappuccino("Cappuccino", 2.75, "Rich", false, true);


        //Use the Scanner class to prompt the user for the quantity of each product
        //then print the name, description and product subtotal for each after each prompt.


        Scanner input = new Scanner(System.in);

        System.out.printf("\nHow much %s would you like to purchase? ", item1.getName());
        item1.setQuantity(input.nextInt());
        System.out.printf("%-15s %-15s Subtotal: $%.2f\n", item1.getName(), item1.getDescription(), item1.calculateProductTotal());


        System.out.printf("\nHow much %s would you like to purchase? ", item2.getName());
        item2.setQuantity(input.nextInt());
        System.out.printf("%-15s %-15s Subtotal: $%.2f\n", item2.getName(), item2.getDescription(), item2.calculateProductTotal());


        System.out.printf("\nHow much %s would you like to purchase? ", item3.getName());
        item3.setQuantity(input.nextInt());
        System.out.printf("%-15s %-15s Subtotal: $%.2f\n", item3.getName(), item3.getDescription(), item3.calculateProductTotal());


        //Print the sales subtotal, sales tax and sales total before exiting the application.
        double totalSubtotal = item1.calculateProductTotal() + item2.calculateProductTotal() + item3.calculateProductTotal();
        double salesTax =  totalSubtotal *.0625;
        double salesTotal = totalSubtotal + (1 + salesTax);

        System.out.printf("\nSubtotal: $%.2f\nSales Tax: $%.2f\nSales Total: $%.2f\n", totalSubtotal, salesTax, totalSubtotal);







    }// end method


} // end class
