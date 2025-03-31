public class Mercedes extends Car {
    public Mercedes(Object isACOn,
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

    public void hateBMW() {
        System.out.println("I hate BMW cars and their drivers!");
    }
}
