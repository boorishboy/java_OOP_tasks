package pl.wsb.creatures;

public interface Feedable {
    Double feed() throws Exception;

    public void feed_double(double foodWeight) throws Exception;
}