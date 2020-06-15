package pl.wsb.human;
import pl.wsb.car.Car;
import pl.wsb.animal.Animal;

public class Human {
    String name;
    private Car car;
    Animal pet;

    public Double salary;

    public Human(String name, Car car, Animal pet) {
        this.name = name;
        this.car = car;
        this.pet = pet;
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
                ", salary=" + salary +
                '}';
    }
}
