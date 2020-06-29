package pl.wsb.creatures;
import pl.wsb.human.Human;
import pl.wsb.interfaces.Soldable;

public abstract class Animal implements Feedable, Soldable{
    public final String species;
    public Double weight;
    private Double price;
    private String name;

    public Animal(String name, String species, Double weight, Double price) {
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.price = price;

    }

    @Override
    public Double feed() throws Exception {
        System.out.println("thank your for feeding me");
        return ++weight;
    }

    @Override
    public void feed_double(double fw) throws Exception {
        if (weight <= 0) {
            System.out.println("The animal is dead ( ͡° ͜ʖ ͡°)");
        } else {
            weight += fw;
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }

    public void walk() {
        if (weight > 2.0) {
            System.out.println("thank you very much for such a nice walk");
            --weight;
        } else {
            System.out.println("The animal is dead ( ͡° ͜ʖ ͡°)");
        }
    }


    @Override
    public boolean sell(Human buyer, Human seller) throws Exception {
        if (seller.getPet().price <= buyer.getCash()) {
            buyer.minusCash(seller.getPet().price);
            seller.plusCash(seller.getPet().price);
            buyer.setPet(seller.getPet());
            seller.setPet(null);
            System.out.println("Your pet has new owner");
            return true;
        } else {
            System.out.println("Not enough cash");
            return false;
        }
    }
}
