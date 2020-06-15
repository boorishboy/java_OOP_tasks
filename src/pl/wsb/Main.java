package pl.wsb;

import pl.wsb.animal.Animal;
import pl.wsb.device.Car;
import pl.wsb.device.Phone;
import pl.wsb.human.Human;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("Cat", 5.0);
        Car ford = new Car("ford", "fiesta");
        Car fiat = new Car("fiat", "500");
        Human human = new Human("Wojtek", ford, cat);
      //  cat.feed_double(4.0);
        System.out.println(cat.species);
        System.out.println(cat.weight);

        cat.walk();
        cat.walk();
        cat.walk();
        cat.walk();

        ford.compareTo(ford,fiat);
        System.out.println(cat);

        ford.turnOn();
        Phone szajsung = new Phone("Samsung", "GALAXY ES 78", 2034);
        szajsung.turnOn();
    }
}
