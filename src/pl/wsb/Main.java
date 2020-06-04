package pl.wsb;

import pl.wsb.animal.Animal;

public class Main {

    public static void main(String[] args) throws Exception {
        Animal cat = new Animal("Cat", 5.0);

      //  cat.feed_double(4.0);
        System.out.println(cat.species);
        System.out.println(cat.weight);

        cat.walk();
        cat.walk();
        cat.walk();
        cat.walk();
    }
}
