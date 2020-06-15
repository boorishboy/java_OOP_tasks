package pl.wsb.animal;

public class Animal implements Feedable {
    public final String species;
    public Double weight;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
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
}
