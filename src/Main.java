import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Object[][] carData = {{false, false, false, 0, "LICENSE PLATE", 2025, "GR Supra", "Toyota", false, false, 56250.00, "Renaissance Red 2.0", 155, "Supra", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2025, "750S", "McLaren", false, false, 312585.00, "Ventura Orange", 206, "750S", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2026, "911 Carrera", "Porsche", false, false, 132930.00, "Oak Green Metallic Neo", 183, "911 Carrera", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2026, "Cayenne", "Porsche", false, false, 91890.00, "Montego Blue Metallic", 154, "Cayenne", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2024, "Land Cruiser", "Toyota", false, false, 55950.00, "Meteoor Shower", 109, "Land Cruiser", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2024, "GTS", "McLaren", false, false, 219400.00, "Onyx Black", 203, "GTS", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2024, "Spyder", "Lamborghini", false, false, 302939.00, "Verde Selvans", 202, "Spyder", false},
                                    {false, false, false, 0, "JACKPOT", 2019, "Huracán", "Lamborghini", false, false, 348773.00, "Verde Selvans", 199, "Huracán", false},
                                    {false, false, true, 0, "LICENSE PLATE", 2024, "i4", "BMW", false, false, 52800.00, "Alpine White", 130, "i4", false},
                                    {false, false, true, 0, "LICENSE PLATE", 2018, "M4 Coupe", "BMW", false, false, 80100.00, "Phytonic Blue Metallic", 155, "M4 Coupe", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2020, "G550", "Mercedes", false, false, 148250.00, "Obsidian Black Metallic", 130, "G550", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2025, "G-Wagon", "Mercedes", false, false, 150000.00, "Emerald Green Metallic", 137, "G-Wagon", false},
                                    };
        ArrayList<Car> allCars = new ArrayList<Car>();
        Car car = null;
        for (Object[] row : carData) {
            if (row[7].equals("BMW")) {
                car = new BMW(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[13], row[14]);
            } else if (row[7].equals("Lamborghini")) {
                car = new Lamborghini(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[13], row[14]);
            } else if (row[7].equals("McLaren")) {
                car = new McLaren(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[13], row[14]);
            } else if (row[7].equals("Mercedes")) {
                car = new Mercedes(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[13], row[14]);
            } else if (row[7].equals("Porsche")) {
                car = new Porsche(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[13], row[14]);
            } else if (row[7].equals("Toyota")) {
                car = new Toyota(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[13], row[14]);
            }

            allCars.add(car);
        }

        for (Car temp : allCars) {
            System.out.println(temp.toString());
        }

        boolean roleSelected = false;
        boolean businessman = false;
        boolean customer = false;
        Scanner in = new Scanner(System.in);
        ArrayList<Car> inventory = new ArrayList<Car>();
        String userResponse = Utilities.getStringInput("Welcome to our Car Showroom Simulator. Would you like to play as the businessman or the customer today? (businessman / customer)",
                                                       new String[] {"businessman", "customer"}, in
                                                       );
        if (userResponse.equals("businessman")) {
            customer = false;
            businessman = true;
            roleSelected = true;
            int balance = 1000000;
            System.out.println("Let's get started! As a businessman, you can buy and sell the cars in your inventory. You currently have $1,000,000 in your balance, as well as the following cars:");
            for (int i = 0; i < allCars.size(); i++) {
                System.out.println((i + 1 ) + ". " + allCars.get(i).toString());
            }
            String firstAction = Utilities.getStringInput("A customer enters the showroom. They own a " + allCars.get((int)Math.random()*(allCars.size()+1)).getMake() + " " + allCars.get((int)Math.random()*(allCars.size()+1)).getName() + ", which costs " + allCars.get((int)Math.random()*(allCars.size()+1)).getPrice() + ". What would you like to do? (buy / sell)",
                                                          new String[] {"buy","sell"}, in
                                                          );
            if (firstAction.equals("buy")) {
                System.out.println("You bought " + allCars.get());
                balance -= allCars.get();
                System.out.println("You curre"tly have ) + balance + " in your account.";
            } else if(firstAction.equals("sell")) {
                
            }
        } else if (userResponse.equals("customer")) {
            customer = true;
            businessman = false;
            roleSelected = true;
            System.out.println("Let's get started! As a customer, you can buy and sell the cars in your inventory. You currently have $500,000 in your balance. Please select a car to own for this game from the list below:");
        
            for (int i = 0; i < allCars.size(); i++) {
                System.out.println((i + 1 ) + ". " + allCars.get(i).toString());
            }
            Integer[] possibleCars = new Integer[allCars.size()];
            for (int i = 0; i < allCars.size(); i++) {
                possibleCars[i] = i + 1;
            }
            int chooseCar = Utilities.getIntInput("", possibleCars, in);
            int numCarsOwned = 0;
            for (int i = 0; i < allCars.size(); i++) {
                if (chooseCar == i + 1){
                    System.out.println("You selected " + allCars.get(i).toString() + ": $" + allCars.get(i).getPrice());
                    numCarsOwned = i;
                }
            }
            userResponse = Utilities.getStringInput("Would you like to buy this car? (yes/no)",
                                                    new String[] {"yes", "no"}, in
                                                    );
            if (userResponse.equals("yes")) {
                numCarsOwned++;
                inventory.add(allCars.get(chooseCar));
                System.out.println("You now own " + numCarsOwned + " car(s).");
            } else if (userResponse.equals("no")) {
                System.out.println("Do you want to spin the wheel?");
            }
        }
    }
}
