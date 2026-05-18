package restaurant;

class Pizza extends FoodItem {
    private String pizzaSize;

    public Pizza(String itemName, double price, String pizzaSize) {

        super(itemName, price);

        this.pizzaSize = pizzaSize;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    @Override
    void prepareFood() {

        System.out.println("Preparing Pizza...");
        System.out.println("Pizza Name: " + getItemName());
        System.out.println("Pizza Size: " + pizzaSize);
        System.out.println("Price: $" + price);
    }
}