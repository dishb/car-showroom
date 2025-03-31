public class Porsche extends Car {
    public Porsche(Object isACOn,
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

    public void repair() {
        int randInt = (int) (Math.random() * 40000) + 10000;
        System.out.println("The repair cost will be " + randInt + ".00 dollars."); 
    }
}
