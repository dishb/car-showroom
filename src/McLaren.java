public class McLaren extends Car {
    public McLaren(boolean isACOn,
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

    public void slowDown() throws Exception {
        throw new Exception("Cannot slow down in a McLaren.");
    }

    public void lookAtMe() {
        System.out.println("Look at me! I love showing off and I own a expensive McLaren!");
    }

    public void butterFlyDoors() {
        System.out.println("Opening my large and flashy butterfly doors.");
    }
}
