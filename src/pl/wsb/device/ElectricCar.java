package pl.wsb.device;

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
}
