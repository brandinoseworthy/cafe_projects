public class Espresso extends Product {

    //fields:       add the boolean attributes extraShot and macchiato and complete the process as with the

    boolean extraShot;
    boolean macchiato;

    //constructor:   no-arg constructor which calls the super constructor and assigns  to false.

    public Espresso(){
        super();
        this.extraShot = false;
        this.macchiato = false;
    }

    //Create a constructor which accepts five attributes


    public Espresso(String name, double price, String description, boolean extraShot, boolean macchiato){
        super(name, price, description);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    // In the calculateProductSubtotal method, add $2.00 to each item with an extra shot and add $1.00
    // to each item made in macchiato style.

    @Override
    public double calculateProductTotal() {
        double price = super.getPrice();
        int quantity = super.getQuantity();

        if(extraShot == true){
            price = price + 2;
        }
        if(macchiato == true) {
            price = price + 1;
        }

        double subtotal = price * quantity;

        return subtotal;
        }

    }


