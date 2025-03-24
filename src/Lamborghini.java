public class Lamborghini extends Car {
    public Lamborghini(boolean isACOn,
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
                       boolean isEngineOn) {
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

    public void scissorDoors() {
        System.out.println("Opening my large and flashy scissor doors.");
    }

    public void revEngine() {
        System.out.println("Vroom, vroom!");
    }
}
