package pl.wsb.animal;

public interface Feedable {
    Double feed() throws Exception;

    public void feed_double(double foodWeight) throws Exception;
}