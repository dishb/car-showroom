package cars;
public class Toyota extends Car {
    public Toyota(Object isACOn,
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

    @Override
    public void setRadioOn(boolean isRadioOn) {
        if (this.getYear() < 2020) {
            System.out.println("This car is missing a radio");
        }
    }

    public void breakdown() throws Exception{
        throw new Exception("This Toyota is too durable to break down.");
    }
}
