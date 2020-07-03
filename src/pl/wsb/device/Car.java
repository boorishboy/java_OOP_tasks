package pl.wsb.device;

import pl.wsb.human.Human;

public abstract class Car extends Device {
    public double price;


    public Car(String producer, String model, int yearOfProduction, double price) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.price = price;
    }

    public Car(String producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void compareTo(Car car1, Car car2) {
        if(car1.equals(car2)) {
            System.out.println("cars are the same \n");
        }else{
            System.out.println("cars are different \n");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    @Override
    public void sell(Human buyer, Human seller, Double price) throws Exception {
        if(!seller.hasACar(this)){
            throw new Exception("The seller doesn't have a car");
        }
        if(!buyer.hasAFreePlace()){
            throw new Exception("The buyer doesn't have free place");
        }
        if(buyer.cash < price){
            throw new Exception("you too poocr");
        }
        buyer.removeCar(this);
        seller.addCar(this);
        buyer.cash -= price;
        seller.cash += price;
        System.out.println("great, transaction is done");
    }

    public abstract void refuel();

}
