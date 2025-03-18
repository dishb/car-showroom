import java.util.ArrayList;

public class Showroom {
    private boolean isLuxury;
    private String name;
    private String city;
    private String state;
    private String country;
    private int numRooms;
    private String currentRoom;
    private String[] rooms;
    private ArrayList<Car> cars;
    private int balance;

    public Showroom(boolean isLuxury, String name, String city, String state, String country, int numRooms, String currentRoom, String[] rooms, int balance) {
        this.isLuxury = isLuxury;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
        this.numRooms = numRooms;
        this.currentRoom = currentRoom;
        this.rooms = rooms;
        this.cars = new ArrayList<Car>();
        this.balance = 0;
    }

    public Car sell(String name) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getName().equals(name)) {
                balance += cars.get(i).getPrice();
                return cars.remove(i);
            }
        }

        return null;
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

    public String getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(String currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String[] getRooms() {
        return rooms;
    }

    public void setRooms(String[] rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
