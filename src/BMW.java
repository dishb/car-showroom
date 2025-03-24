public class BMW extends Car{
    public BMW(boolean isACOn,
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

    public void hateMercedes() {
        System.out.println("I hate Mercedes cars and their drivers!");
    }

    public void useTurnSignal() throws Exception {
        throw new Exception("BMW drivers don't use turn signals!");
    }
}
