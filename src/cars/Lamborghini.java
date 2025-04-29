package cars;
public class Lamborghini extends Car {
    public Lamborghini(Object isACOn,
                       Object isRadioOn,
                       Object areHeadlightsOn,
                       Object currentSpeed,
                       Object licensePlate,
                       Object year,
                       Object model,
                       Object make,
                       Object isUsed,
                       Object isElectric,
                       Object price,
                       Object color,
                       Object topSpeed,
                       Object name,
                       Object isEngineOn) {
        super((boolean) isACOn,
              (boolean) isRadioOn,
              (boolean) areHeadlightsOn,
              (int) currentSpeed,
              (String) licensePlate,
              (int) year,
              String.valueOf(model),
              String.valueOf(make),
              (boolean) isUsed,
              (boolean) isElectric,
              (double) price,
              (String) color,
              (int) topSpeed,
              String.valueOf(name),
              (boolean) isEngineOn
              );
    }

    public void scissorDoors() {
        System.out.println("Opening my large and flashy scissor doors.");
    }

    public void revEngine() {
        System.out.println("Vroom, vroom!");
    }
}
