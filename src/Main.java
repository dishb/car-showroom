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
                                    {false, false, false, 0, "LICENSE PLATE", 2019, "Huracán", "Lamborghini", false, false, 348773.00, "Verde Selvans", 199, "Huracán", false},
                                    {false, false, true, 0, "LICENSE PLATE", 2024, "i4", "BMW", false, false, 52800.00, "Alpine White", 130, "i4", false},
                                    {false, false, true, 0, "LICENSE PLATE", 2018, "M4 Coupe", "BMW", false, false, 80100.00, "Phytonic Blue Metallic", 155, "M4 Coupe", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2020, "G550", "Mercedes", false, false, 148250.00, "Obsidian Black Metallic", 130, "G550", false},
                                    {false, false, false, 0, "LICENSE PLATE", 2025, "G-Wagon", "Mercedes", false, false, 150000.00, "Emerald Green Metallic", 137, "G-Wagon", false},
                                    };
        ArrayList<Car> allCars = new ArrayList<Car>();
        for (Object[] row : carData) {
            Car car = new Car(row[0], row[1], row[2], row[3], row[4], row[5], row[6], row[7], row[8], row[9], row[10], row[11], row[12], row[13], row[14], row[15]);
        }

    Scanner in = new Scanner(System.in);
    boolean businessman = false;
    boolean customer = false;
    System.out.println("Welcome to our Car Showroom Simulator. Would you like to play as the businessman or the customer today?");
    String userResp1 = in.nextLine().toLowerCase();
        if (userResp1.equals("businessman")) {
            businessman = true;
            System.out.println("Let's get started! As a businessman, you can buy and sell the cars in your inventory. You currently have $100000 in your balance, as well as the following cars:");
        }

        if (userResp1.equals("customer")) {
            customer = true;
            System.out.println("Let's get started! As a customer, you can buy and sell the cars in your inventory. You currently have $500000 in your balance. Please select two cars to own for thi game:");
        }
    }
}