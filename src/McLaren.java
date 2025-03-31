public class McLaren extends Car {
    public McLaren(Object isACOn,
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
