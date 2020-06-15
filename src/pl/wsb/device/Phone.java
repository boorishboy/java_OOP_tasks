package pl.wsb.device;

import pl.wsb.device.Device;

public class Phone extends Device {


    public Phone(String producer, String model, int yearOfProduction) {
        this.model=model;
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("mobile is turned on");
    }
}
