public class Mercedes extends Car{
    public Mercedes(boolean isACOn,
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

    public void hateBMW() {
        System.out.println("I hate BMW cars and their drivers!");
    }
}
