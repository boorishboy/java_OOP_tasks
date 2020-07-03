package pl.wsb.device;

import pl.wsb.human.Human;

public class LPGCar extends Car {
    public LPGCar(String producer, String model, int yearOfProduction, double price) {
        super(producer, model, yearOfProduction, price);
    }

    public LPGCar(String producer, String model) {
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
