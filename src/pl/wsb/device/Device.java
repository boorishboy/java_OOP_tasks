package pl.wsb.device;

import pl.wsb.interfaces.Soldable;

public abstract class Device implements Soldable {

    String producer;
    String model;
    int yearOfProduction;
    double price;

    void turnOn(){
    }


    public abstract void sell() throws Exception;
}
