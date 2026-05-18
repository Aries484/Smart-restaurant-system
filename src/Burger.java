package restaurant;

class Burger extends FoodItem {

    private boolean extraCheese;

    public Burger(String itemName, double price, boolean extraCheese) {

        super(itemName, price);

        this.extraCheese = extraCheese;
    }

    @Override
    void prepareFood() {

        System.out.println("Preparing Burger...");
        System.out.println("Burger Name: " + getItemName());
        System.out.println("Extra Cheese: " + extraCheese);
        System.out.println("Price: $" + price);
    }
}