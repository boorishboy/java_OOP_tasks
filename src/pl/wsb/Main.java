package pl.wsb;

import pl.wsb.creatures.Pet;
import pl.wsb.device.*;
import pl.wsb.human.Human;

public class Main {

    public static void main(String[] args) throws Exception {
        Phone iPhone = new Phone("Apple", "8", 2017, 2000.00);
        iPhone.turnOn();

        Pet cat = new Pet("Cat", "cat", 2.0, 300.0);
        DieselCar ford = new DieselCar("ford", "fiesta");
        DieselCar fiat = new DieselCar("fiat", "500");
        Human me = new Human("Wojtas", "Chamski", cat, ford, iPhone, 2000.00, 10000.00);
        me.garage = new Car[5];
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

        fiat.refuel();
        ford.refuel();
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 1992, 500000.0);
        tesla.refuel();


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


        System.out.println(me.getFromGarage(0) + ", " + me.getFromGarage(1) + ", " + me.getFromGarage(2));

    }
}
