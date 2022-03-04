public class Cappuccino extends Product {


    //fields:       add the boolean attributes peppermint and whippedCream

    boolean peppermint;
    boolean whippedCream;

    //constructor:   no-arg constructor which calls the super constructor and assigns  to false.

    public Cappuccino(){
        super();
        this.peppermint = false;
        this.whippedCream = false;
    }

    //Create a constructor which accepts five attributes


    public Cappuccino(String name, double price, String description, boolean peppermint, boolean whippedCream){
        super(name, price, description);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    // In the calculateProductSubtotal method, add $2.00 to each item with
    // peppermint and add $1.00 to each item with whipped cream.


    @Override
    public double calculateProductTotal() {
        double price = super.getPrice();
        int quantity = super.getQuantity();

        if(peppermint == true){
            price = price + 2;
        }
        if(whippedCream == true) {
            price = price + 1;
        }

        double subtotal = price * quantity;

        return subtotal;
    }
}
