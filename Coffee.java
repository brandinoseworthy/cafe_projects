public class Coffee extends Product{

    //fields:       add the boolean attributes, sugar and milk.

    boolean sugar;
    boolean milk;

    //constructor:   no-arg constructor which calls the super constructor and assigns this.milk and this.sugar to false.

    public Coffee(){
        super();
        this.milk = false;
        this.sugar = false;
    }

// Create a constructor which accepts five attributes
// (three from Product and two from Coffee) and passes three arguments to the super constructor and assign this.milk
// and this.sugar to the arguments passed to the constructor.

    public Coffee(String name, double price, String description, boolean milk, boolean sugar){
        super(name, price, description);
        this.milk = milk;
        this.sugar = sugar;
    }


// Create getters and setters for the two added attributes.

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }


// Implement the calculateProductSubtotal method.

  // abstract method
   @Override
    public double calculateProductTotal() {
       double price = super.getPrice();
       int quantity = super.getQuantity();
        double subtotal = price * quantity;

        return subtotal;
    }
}
