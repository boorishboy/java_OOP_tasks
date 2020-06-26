package pl.wsb;

import pl.wsb.animal.Animal;
import pl.wsb.device.Car;
import pl.wsb.device.Phone;
import pl.wsb.human.Human;

public class Main {

    public static void main(String[] args) throws Exception {
        Phone iPhone = new Phone("Apple", "8", 2017, 2000.00);
        iPhone.turnOn();

        Animal cat = new Animal("Cat", "cat", 2.0, 300.0);
        Car ford = new Car("ford", "fiesta");
        Car fiat = new Car("fiat", "500");
        Human me = new Human("Wojtas", "Chamski", 55.0, cat, ford, iPhone, 2000.00, 10000.00);

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
        Phone szajsung = new Phone("Samsung", "GALAXY ES 78", 2034, 200000.0);
        szajsung.turnOn();
    }
}
