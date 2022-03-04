public abstract class Product {
    // fields

    private String name;
    private double price;
    private String description;
    private int quantity;

    // need 2 constructors. One without args and one with.

    public Product(){}
    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

//

    // include a method named calculateProductTotal( ) which calculates the product subtotal for the order.

    public abstract double calculateProductTotal(); //{
        // price * quantity
//        double subtotal = price * quantity;
//        return subtotal;

//    }


    //getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
