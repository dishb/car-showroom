import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car i4 = new BMW(false, 
                         true, 
                         false, 
                         0, 
                         "LIME", 
                         2025, 
                         "i4", 
                         "BMW", 
                         true, 
                         false, 
                         52800, 
                         "grey", 
                         130,
                         "i4", 
                         false
                         );
        Car G550 = new Mercedes(false, 
                                false, 
                                false, 
                                0, 
                                "BENZ", 
                                2025, 
                                "G550", 
                                "Mercedes", 
                                false, 
                                false, 
                                148250, 
                                "black", 
                                130,
                                "G550", 
                                false
                                );
        
        final Object[][] carData = {{false, false, false, 0, "90903", 2016, "Supra", "Toyota", false, false, 35999.00, "white", 155, "Supra", false},
                                    {false, false, true, 0, "P1111", 2011, "P1", "McLaren", true, false, 1300000.00, "black", 217, "P1", false},
                                    {false, true, false, 0, "LOTUS", 2011, "911", "Porsche", false, false, 120100.00, "light pink", 183, false},
                                    {false, false, false, 24, "LIME", 2024, "Spyder", "Lamborghini", false, false, 302939.00, "lime green", 202, "Spyder", false },
                                    {false, false, false, "MONEY", 2025, "i4", "BMW", },
                                    {},
                                    };
        ArrayList<Car> allCars = new ArrayList<Car>();
    }
}
