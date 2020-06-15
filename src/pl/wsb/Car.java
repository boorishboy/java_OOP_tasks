package pl.wsb;

public class Car {
    String producer;
    String model;
    private double price;


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
}
