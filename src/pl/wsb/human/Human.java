package pl.wsb.human;
import pl.wsb.Car;
import pl.wsb.animal.Animal;

public class Human {
    String name;
    Car car;
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
}
