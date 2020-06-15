package pl.wsb.device;

public class Car extends Device {
    private double price;


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
    public void turnOn() {
        System.out.println("car is turned on");
    }
}
