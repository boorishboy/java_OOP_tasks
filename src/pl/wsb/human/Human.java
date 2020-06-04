package pl.wsb.human;
import pl.wsb.Car;
import pl.wsb.animal.Animal;

public class Human {
    String name;
    Car car;
    Animal pet;

    public Human(String name, Car car, Animal pet) {
        this.name = name;
        this.car = car;
        this.pet = pet;
    }
}
