import java.util.ArrayList;

import cars.Car;

public class Showroom {
    private boolean isLuxury;
    private String name;
    private String city;
    private String state;
    private String country;
    private int numRooms;
    private ArrayList<Car> cars;
    private double balance;
    private int showroomLevel;

    public Showroom(boolean isLuxury,
                    String name,
                    String city,
                    String state,
                    String country,
                    int numRooms,
                    double balance,
                    int showroomLevel
                    ) {
        this.isLuxury = isLuxury;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.numRooms = numRooms;
        this.cars = new ArrayList<Car>();
        this.balance = balance;
        this.showroomLevel = showroomLevel;
    }

    public void addMoney(double money) {
        balance += money;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void upgradeLevel() {
        balance -= 10000;
        for (Car car : cars) {
            car.setPrice(car.getPrice() + 500.00);
        }
        
        showroomLevel++;
    }

    public Car sell(String name) {
        int customerHappy = (int) (Math.random() * 3) + 1;
        if (customerHappy == 1) {
            for (int i = 0; i < cars.size(); i++) {
                if (cars.get(i).getName().equals(name)) {
                    balance += cars.get(i).getPrice();
                    return cars.remove(i);
                }
            }
        }

        return null;
    }

    public Car sell(int index) {
        balance += cars.get(index).getPrice();
        return cars.remove(index);
    }

    public void buy(Car car) {
        balance -= car.getPrice();
        cars.add(car);
    }

    public boolean isLuxury() {
        return isLuxury;
    }

    public void setLuxury(boolean isLuxury) {
        this.isLuxury = isLuxury;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumRooms() {
        return numRooms;
    }

    public void setNumRooms(int numRooms) {
        this.numRooms = numRooms;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getShowroomLevel() {
        return showroomLevel;
    }

    public void setShowroomLevel(int showroomLevel) {
        this.showroomLevel = showroomLevel;
    }
}
