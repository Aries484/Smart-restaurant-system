package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<FoodItem> orders = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("===== SMART RESTAURANT SYSTEM =====");

            System.out.println("Choose Food Type:");
            System.out.println("1. Pizza");
            System.out.println("2. Burger");

            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1) {

                System.out.println("Enter Pizza Name:");
                String name = sc.nextLine();

                System.out.println("Enter Pizza Price:");
                double price = sc.nextDouble();
                sc.nextLine();

                System.out.println("Enter Pizza Size:");
                String size = sc.nextLine();

                FoodItem food = new Pizza(name, price, size);

                orders.add(food);
            }

            else if(choice == 2) {

                System.out.println("Enter Burger Name:");
                String name = sc.nextLine();

                System.out.println("Enter Burger Price:");
                double price = sc.nextDouble();

                System.out.println("Extra Cheese? true/false");
                boolean cheese = sc.nextBoolean();

                FoodItem food = new Burger(name, price, cheese);

                orders.add(food);
            }

            else {
                System.out.println("Invalid Choice!");
            }

            System.out.println("===== ORDER DETAILS ===== ");

            for(FoodItem food : orders) {

                food.prepareFood();

                System.out.println();
            }

        }

        catch(Exception e) {

            System.out.println("Invalid Input Entered!");
        }

        sc.close();
    }
}