package pl.wsb.interfaces;

import pl.wsb.human.Human;

public interface Soldable {
    boolean sell(Human buyer, Human seller) throws Exception;
}