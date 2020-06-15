package pl.wsb.car;

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

    public void compareTo(Car car1, Car car2) {
        if(car1.equals(car2)) {
            System.out.println("cars are the same \n");
        }else{
            System.out.println("cars are different \n");
        }
    }
}
