package pl.wsb.human;
import pl.wsb.device.Car;
import pl.wsb.animal.Animal;
import pl.wsb.device.Phone;

public class Human {
    String name;
    private Car car;
    Animal pet;
    private Phone phone;
    public Double salary;
    protected Double cash;

    public Human(String firstName, String lastName, double weight, Animal pet, Car vehicle, Phone mobile, double salary, Double cash) {
        this.name = name;
        this.car = car;
        this.pet = pet;
        this.phone = mobile;
        this.salary = salary;
        this.cash = cash;
    }

    public Phone getMobile() {
        return phone;
    }

    public void setMobile(Phone mobile) {
        this.phone = mobile;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void plusCash(Double cash) {
        this.cash += cash;
    }

    public void minusCash(Double cash) {
        this.cash += cash;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0) {
            throw new IllegalArgumentException("Hey what's wrong with you salary cannot be negative");
        }

        System.out.println("New data was sent to accounting system");
        System.out.println("It's necessary to take annex to agreement of Ms. Joanna from the office");
        System.out.println("Healthy Insurence and Tax Office got to know of salary change and there is no use to hide your real income");

        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.getSalary() > car.getPrice()) {
            System.out.println("The car has been purchased with cash.");
            this.car = car;
            return;
        }

        if(this.getSalary() > car.getPrice() / 12) {
            System.out.println("The car was purchased with a loan.");
            this.car = car;
            return;
        }

        System.out.println("You're poor. Better get an electric scooter.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", pet=" + pet +
                ", phone=" + phone +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }
}
