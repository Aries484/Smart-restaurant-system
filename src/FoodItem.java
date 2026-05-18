package restaurant;

abstract class FoodItem {

    private String itemName;

    protected double price;

    public FoodItem(String itemName, double price) {

        this.itemName = itemName;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    abstract void prepareFood();
}