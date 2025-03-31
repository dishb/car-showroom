public class Car {
    private boolean isACOn;
    private boolean isRadioOn;
    private boolean areHeadlightsOn;
    private int currentSpeed;
    private String licensePlate;
    private int year;
    private String model;
    private String make;
    private boolean isUsed;
    private boolean isElectric;
    private double price;
    private String color;
    private int topSpeed;
    private String name;
    private boolean isEngineOn;

    public Car(Object isACOn,
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
               Object isEngineOn
               ) {
        this.isACOn = (boolean) isACOn;
        this.isRadioOn = (boolean) isRadioOn;
        this.areHeadlightsOn = (boolean) areHeadlightsOn;
        this.currentSpeed = (int) currentSpeed;
        this.licensePlate = String.valueOf(licensePlate);
        this.year = (int) year;
        this.model = String.valueOf(model);
        this.make = String.valueOf(make);
        this.isUsed = (boolean) isUsed;
        this.isElectric = (boolean) isElectric;
        this.price = (double) price;
        this.color = String.valueOf(color);
        this.topSpeed = (int) topSpeed;
        this.name = String.valueOf(name);
        this.isEngineOn = (boolean) isEngineOn;
    }

    public String toString() {
        return make + " " + model + " " + year;
    }

    public void toggleHeadlights() {
        areHeadlightsOn = !areHeadlightsOn;
    }

    public void toggleAC() {
        isACOn = !isACOn;
    }

    public void toggleRadio() {
        isRadioOn = !isRadioOn;
    }

    public void accelerate() {
        currentSpeed += 1;
    }

    public void brake() {
        currentSpeed -= 1;
    }

    public void startCar() {
        currentSpeed = 0;
    }

    public void stopCar() {
        currentSpeed = 0;
    }

    public void drive() {
        System.out.println(name + " is driving at " + currentSpeed + " mph.");
    }

    public boolean isACOn() {
        return isACOn;
    }

    public void setACOn(boolean isACOn) {
        this.isACOn = isACOn;
    }

    public boolean isRadioOn() {
        return isRadioOn;
    }

    public void setRadioOn(boolean isRadioOn) {
        this.isRadioOn = isRadioOn;
    }

    public boolean isAreHeadlightsOn() {
        return areHeadlightsOn;
    }

    public void setAreHeadlightsOn(boolean areHeadlightsOn) {
        this.areHeadlightsOn = areHeadlightsOn;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean isEngineOn) {
        this.isEngineOn = isEngineOn;
    }
}
