import java.util.ArrayList;

public class Visitor{

    private String firstName;
    private String lastName;
    private int age;
    private double balance;
    private ArrayList<Car> carsOwned;

    public Visitor(String firstName, String lastName, int age, double balance){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.balance = balance;
        this.carsOwned = new ArrayList<Car>();
    }

    public void buy(Car car){
        balance -= car.getPrice();
        carsOwned.add(car);
    }

    public void sell(Car car){
        balance += car.getPrice();
        carsOwned.remove(car);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Car> getCarsOwned() {
        return carsOwned;
    }

    public void setCarsOwned(ArrayList<Car> carsOwned) {
        this.carsOwned = carsOwned;
    }

}