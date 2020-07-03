package pl.wsb.device;

import pl.wsb.human.Human;
import pl.wsb.interfaces.Soldable;

public abstract class Device implements Soldable {

    String producer;
    String model;
    int yearOfProduction;
    double price;

    public void turnOn(){
    }


    public abstract void sell() throws Exception;

    public abstract void sell(Human buyer, Human seller, Double price) throws Exception;
}
