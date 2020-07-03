package pl.wsb.device;

import pl.wsb.human.Human;

public class ElectricCar extends Car {
    public ElectricCar(String producer, String model, int yearOfProduction, double price) {
        super(producer, model, yearOfProduction, price);
    }

    public ElectricCar(String producer, String model) {
        super(producer, model);
    }

    @Override
    public void refuel() {

    }

    @Override
    public void sell() throws Exception {

    }

    @Override
    public boolean sell(Human buyer, Human seller) throws Exception {
        return false;
    }
}
