package pl.wsb.human;
import pl.wsb.device.Car;
import pl.wsb.creatures.Animal;
import pl.wsb.device.Phone;

public class Human {
    String lastName;
    String name;
    public Car[] garage;
    private Car car;
    Animal pet;
    private Phone phone;
    public Double salary;
    public Double cash;
    private static int DEFAULT_GARAGE_SIZE = 5;

    public Human(String name, String lastName, Animal pet, Car car, Phone phone, double salary, Double cash) {
        this.name = name;
        this.lastName = lastName;
        this.pet = pet;
        this.phone = phone;
        this.salary = salary;
        this.cash = cash;
        this.car = car;
    }

    public Human() {
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }


    public Phone getMobile() {
        return phone;
    }

    public void setMobile(Phone mobile) {
        this.phone = mobile;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void plusCash(Double cash) {
        this.cash += cash;
    }

    public void minusCash(Double cash) {
        this.cash += cash;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0) {
            throw new IllegalArgumentException("Hey what's wrong with you salary cannot be negative");
        }

        System.out.println("New data was sent to accounting system");
        System.out.println("It's necessary to take annex to agreement of Ms. Joanna from the office");
        System.out.println("Healthy Insurence and Tax Office got to know of salary change and there is no use to hide your real income");

        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.getSalary() > car.getPrice()) {
            System.out.println("The car has been purchased with cash.");
            this.car = car;
            return;
        }

        if(this.getSalary() > car.getPrice() / 12) {
            System.out.println("The car was purchased with a loan.");
            this.car = car;
            return;
        }

        System.out.println("You're poor. Better get an electric scooter.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", pet=" + pet +
                ", phone=" + phone +
                ", salary=" + salary +
                ", cash=" + cash +
                '}';
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Double valueOfCars() {
        Double value = 0.0;
        for (Car car : garage) {
            if (car != null) {
                value += car.price;
            }
        }
        return value;
    }

    public Car getCar(Integer index) {
        return this.garage[index];
    }

    public void setCar(Car car, Integer index) {
        this.garage[index] = car;
    }

    public Car getFromGarage(Integer index) {
        return this.garage[index];
    }

    public boolean hasACar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAFreePlace() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public void setInGarage(Car car, Integer index) {
        this.garage[index] = car;
    }

    public boolean isInGarage(Car newCar) {
        for(Car car : garage){
            if(car == newCar){
                return true;
            }
        }
        return false;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
            }
        }
    }

    public void addCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                garage[i] = car;
                break;
            }
        }
    }
}

