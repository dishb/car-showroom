import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final Object[][] carData = {{false, false, false, 0, "NONITRO", 2025, "GR Supra", "Toyota", false, false, 56250.00, "Renaissance Red 2.0", 155, "Supra", false},
                                    {false, false, false, 0, "U BROKI", 2025, "750S", "McLaren", false, false, 312585.00, "Ventura Orange", 206, "750S", false},
                                    {false, false, false, 0, "NINE 11", 2026, "911 Carrera", "Porsche", false, false, 132930.00, "Oak Green Metallic Neo", 183, "911 Carrera", false},
                                    {false, false, false, 0, "FAM$CAR", 2026, "Cayenne", "Porsche", false, false, 91890.00, "Montego Blue Metallic", 154, "Cayenne", false},
                                    {false, false, false, 0, "FAM CAR", 2024, "Land Cruiser", "Toyota", false, false, 55950.00, "Meteoor Shower", 109, "Land Cruiser", false},
                                    {false, false, false, 0, "GT58MCL", 2024, "GTS", "McLaren", false, false, 219400.00, "Onyx Black", 203, "GTS", false},
                                    {false, false, false, 0, "MORALES", 2024, "Spyder", "Lamborghini", false, false, 302939.00, "Verde Selvans", 202, "Spyder", false},
                                    {false, false, false, 0, "JACKPOT", 2019, "Huracán", "Lamborghini", false, false, 348773.00, "Verde Selvans", 199, "Huracán", false},
                                    {false, false, true, 0, "ELECTRI", 2024, "i4", "BMW", false, false, 52800.00, "Alpine White", 130, "i4", false},
                                    {false, false, true, 0, "NOTURN1", 2018, "M4 Coupe", "BMW", false, false, 80100.00, "Phytonic Blue Metallic", 155, "M4 Coupe", false},
                                    {false, false, false, 0, "DUBAI$$", 2020, "G550", "Mercedes", false, false, 148250.00, "Obsidian Black Metallic", 130, "G550", false},
                                    {false, false, false, 0, "THEHULK", 2025, "G-Wagon", "Mercedes", false, false, 150000.00, "Emerald Green Metallic", 137, "G-Wagon", false},
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

        boolean roleSelected = false;
        boolean businessman = false;
        boolean customer = false;
        Scanner in = new Scanner(System.in);
        String userResponse = Utilities.getStringInput("\nWelcome to our Car Showroom Simulator. Would you like to play as the businessman or the customer today? (businessman / customer)",
                                                       new String[] {"businessman", "customer"}, in
                                                       );

        if (userResponse.equals("businessman")) {
            customer = false;
            businessman = true;
            roleSelected = true;
            String name = Utilities.getStringInput("What is the name of your showroom?",
                                                   new String[] {}, in
                                                   );
            String city = Utilities.getStringInput("What city is the showroom located in?",
                                                   new String[] {"yes", "no"}, in
                                                   );
            String state = Utilities.getStringInput("What state is the showroom located in?",
                                                    new String[] {"yes", "no"}, in
                                                    );
            String country = Utilities.getStringInput("What country is the showroom located in?",
                                                      new String[] {"yes", "no"}, in
                                                      );
            int numRooms = Utilities.getIntInput("How many rooms are in the showroom?", 
                                                 new Integer[] {}, in
                                                 );
            Showroom showroom = new Showroom(true, name, city, state, country, numRooms, 1000000.00, 1);
            showroom.setCars(allCars);

            System.out.println("Let's get started! As a businessman, you can buy and sell the cars in your inventory. You currently have $1,000,000 in your balance, as well as the following cars:");
            for (int i = 0; i < showroom.getCars().size(); i++) {
                System.out.println((i + 1 ) + ". " + showroom.getCars().get(i).toString());
            }

            Car randCar = showroom.getCars().get((int) Math.random() * (showroom.getCars().size() + 1));
            String firstAction = Utilities.getStringInput("A customer enters the showroom. They own a " + randCar.getMake() + " " + randCar.getName() + ", which costs " + randCar.getPrice() + ". What would you like to do? (buy / sell)",
                                                          new String[] {"buy","sell"}, in
                                                          );
            if (firstAction.equals("buy")) {
                showroom.buy(randCar);
                System.out.println("You bought " + randCar.getName());
                System.out.println("Congratulations! You currently have " + showroom.getBalance() + " in your account.");
            } else if (firstAction.equals("sell")) {
                System.out.println("Which car would you like to sell? You can sell one of the following cars:");
                for (int i = 0; i < showroom.getCars().size(); i++) {
                    System.out.println((i + 1 ) + ". " + showroom.getCars().get(i).toString() + ": " + showroom.getCars().get(i).getPrice());
                }

                String[] carOptions = new String[showroom.getCars().size()];
                for (int i = 0; i < showroom.getCars().size(); i++) {
                    carOptions[i] = String.valueOf(showroom.getCars().get(i));
                }

                System.out.println("Choose the number of the car that you would like to sell");
                
                userResponse = Utilities.getStringInput("",
                                                       carOptions, in
                                                       );
                for (int i = 0; i < carOptions.length; i++) {
                    if (userResponse.equals(Integer.toString(i))) {
                        showroom.sell(showroom.getCars().get(i).getName());
                        System.out.println("You sold " + showroom.getCars().get(i).toString() + ": " + showroom.getCars().get(i).getPrice());
                        System.out.println("Congratulations! Your new balance is: $" + showroom.getBalance());
                        break;
                    }
                }
            }

            userResponse = Utilities.getStringInput("Do you want to spin the Wheel of Fortune? (yes / no)",
                                                    new String[] {"yes", "no"}, in
                                                    );
            if (userResponse.equals("yes")) {
                String prize = Gambling.spinWheel();
                if (prize.equals("jackpot")) {
                    System.out.println("Congratulations, you won the jackpot: a brand new Lamborghini Huracán!");
                    showroom.addCar(allCars.get(8));
                } else {
                    System.out.println("Congratulations, you won $" + prize + "!");
                    showroom.setBalance(showroom.getBalance() + Double.parseDouble(prize));
                }
            }

            userResponse = Utilities.getStringInput("Do you want to upgrade your car showroom to level " + showroom.getShowroomLevel() + "? It will cost $10,000 but raises the price of each car by $500" ,
                                                    new String[] {"yes", "no"}, in
                                                    );
            if (userResponse.equals("yes")) {
                if (showroom.getBalance() > 10000) {
                    showroom.upgradeLevel();
                } else {
                    System.out.println("Error, insufficient funds.");
                }
            }

        } else if (userResponse.equals("customer")) {
            customer = true;
            businessman = false;
            roleSelected = true;

            String firstName = Utilities.getStringInput("What is your first name?",
                                                        new String[] {}, in
                                                        );
            
            String lastName = Utilities.getStringInput("What is your last name?",
                                                       new String[] {}, in
                                                       );
            
            int age = Utilities.getIntInput("How old are you?",
                                            new Integer[] {}, in
                                            );
            
            Visitor player = new Visitor(firstName, lastName, age, 500000.00);

            System.out.println("Let's get started, " + player.getFirstName() + " " + player.getLastName() + "! As a customer, you can buy and sell the cars in your inventory. You currently have $500,000 in your balance. First, you'll have to buy a car to start the game. Please select a car to own for this game from the list below:");
            for (int i = 0; i < allCars.size(); i++) {
                System.out.println((i + 1) + ". " + allCars.get(i).toString());
            }

            Integer[] possibleCars = new Integer[allCars.size()];
            for (int i = 0; i < allCars.size(); i++) {
                possibleCars[i] = i + 1;
            }

            int chooseCar = Utilities.getIntInput("", possibleCars, in);
            for (int i = 0; i < allCars.size(); i++) {
                if (chooseCar - 1 == i){
                    System.out.println("You selected " + allCars.get(i).toString() + ": $" + allCars.get(i).getPrice() + ".");
                    break;
                }
            }
            
            userResponse = Utilities.getStringInput("Would you like to buy this car? (yes / no)",
                                                    new String[] {"yes", "no"}, in
                                                    );
            if (userResponse.equals("yes")) {
                player.buy(allCars.get(chooseCar - 1));
                System.out.println("You now own " + player.getCarsOwned().size() + " car(s).");
            }

            userResponse = Utilities.getStringInput("Do you want to spin the Wheel of Fortune? (yes / no)",
                                                    new String[] {"yes", "no"}, in
                                                    );
            if (userResponse.equals("yes")) {
                String prize = Gambling.spinWheel();
                if (prize.equals("jackpot")) {
                    System.out.println("Congratulations, you won the jackpot: a brand new Lamborghini Huracán!");
                    player.addCar(allCars.get(8));
                } else {
                    System.out.println("Congratulations, you won $" + prize + "!");
                    player.setBalance(player.getBalance() + Double.parseDouble(prize));
                }
            }

            userResponse = Utilities.getStringInput("Would you like to sell a car? (yes / no)",
                                                    new String[] {"yes", "no"}, in
                                                    );
            if (userResponse.equals("yes")) {
                System.out.println("Which car would you like to sell? You can sell one of the following cars:");
                for (int i = 0; i < player.getCarsOwned().size(); i++) {
                    System.out.println((i + 1 ) + ". " + player.getCarsOwned().get(i).toString() + ": " + player.getCarsOwned().get(i).getPrice());
                }
                
                String[] carOptions = new String[player.getCarsOwned().size()];
                for (int i = 0; i < player.getCarsOwned().size(); i++) {
                    carOptions[i] = String.valueOf(player.getCarsOwned().get(i));
                }

                System.out.println("Choose the number of the car that you would like to sell");
                
                userResponse = Utilities.getStringInput("",
                                                        carOptions, in
                                                        );
                for (int i = 0; i < carOptions.length; i++) {
                    if (userResponse.equals(Integer.toString(i))) {
                        System.out.println("You sold " + player.getCarsOwned().get(i).toString() + ": " + player.getCarsOwned().get(i).getPrice());
                        player.sell(player.getCarsOwned().get(i));
                        System.out.println("Congratulations! Your new balance is: $" + player.getBalance());
                        System.out.println("You now own " + player.getCarsOwned().size() + "car(s).");
                        break;
                    }
                }
            }
        }
    }
}
