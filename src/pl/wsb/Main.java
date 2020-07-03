package pl.wsb;

import pl.wsb.creatures.Pet;
import pl.wsb.device.*;
import pl.wsb.human.Human;

public class Main {

    public static void main(String[] args) throws Exception {
        Phone iPhone = new Phone("Apple", "8", 2017, 2000.00);
        Phone iPhoneX = new Phone("Apple", "X", 2017, 2000.00);
        iPhone.turnOn();
        iPhoneX.turnOn();

        Pet cat = new Pet("Cat", "cat", 2.0, 300.0);
        Pet dog = new Pet("Dog", "Dog", 20.0, 4000.0);
        ElectricCar teslaX = new ElectricCar("tesla", "Model X", 2020, 120300.0);
        DieselCar ford = new DieselCar("ford", "fiesta", 1990, 3125.0);
        DieselCar fiat = new DieselCar("fiat", "500", 2012, 50250.0);
        Human me = new Human("Wojtas", "Chamski", cat, ford, iPhone, 2000.00, 10000.00);
        Human notMe = new Human("Jan", "Kowalski", dog, teslaX, iPhoneX, 50000.0, 30000000.0);
        me.garage = new Car[5];
        notMe.garage = new Car[5];
        notMe.addCar(teslaX);
        //  cat.feed_double(4.0);
        System.out.println(cat.species);
        System.out.println(cat.weight);

        cat.walk();
        cat.walk();
        cat.walk();
        cat.walk();

        ford.compareTo(ford,fiat);
        System.out.println(cat);

        teslaX.sell(me, notMe);

        ford.turnOn();
        Phone szajsung = new Phone("Samsung", "GALAXY ES 78", 2034, 200000.0);
        szajsung.turnOn();

        fiat.refuel();
        ford.refuel();
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 1992, 500000.0);
        tesla.refuel();
        tesla.setPrice(2000000.0);

        LPGCar paseratti = new LPGCar("VW", "Paseratti", 1995, 2.5);
        paseratti.refuel();


        iPhone.installApp("instagram");
        iPhone.installApp("Uber", 8.0);
        iPhone.installApp("Facebook", 20.0, "192.168.0.1");
        iPhone.installApp(new String[]{ "Google", "9Gag", "Komixxy.pl"});
        iPhone.installApp("Youtube", "youtube.com");

        me.setInGarage(ford, 0);
        me.setInGarage(tesla, 1);
        me.setInGarage(paseratti, 2);
        me.isInGarage(fiat);

        System.out.println("value of all cars: " + me.valueOfCars() + "\n");

        me.removeCar(paseratti);
        me.removeCar(fiat);
        me.addCar(paseratti);

        for (Car i : me.garage) {
            if(i != null) {
                System.out.println(i);
            }
        }
    }
}
