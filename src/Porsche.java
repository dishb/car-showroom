public class Porsche extends Car {
    public Porsche(boolean isACOn,
                   boolean isRadioOn,
                   boolean areHeadlightsOn,
                   int currentSpeed,
                   String licensePlate,
                   int year,
                   String model,
                   String make,
                   boolean isUsed,
                   boolean isElectric,
                   double price,
                   String color,
                   int topSpeed,
                   String name,
                   boolean isEngineOn
                   ) {
        super(isACOn,
              isRadioOn,
              areHeadlightsOn,
              currentSpeed,
              licensePlate,
              year,
              model,
              make,
              isUsed,
              isElectric,
              price,
              color,
              topSpeed,
              name,
              isEngineOn
              );
    }

    public void repair() {
        int randInt = (int) (Math.random() * 40000) + 10000;
        System.out.println("The repair cost will be " + randInt + ".00 dollars."); 
    }
}