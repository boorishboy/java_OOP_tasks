package pl.wsb.device;

import pl.wsb.human.Human;

import java.util.Arrays;

public class Phone extends Device {

    public final static String SERVER_ADDRESS = "https://abcd.xyz";
    public final static String DEFAULT_VERSION = "8.16.4";
    public final static String DEFAULT_PROTOCOL = "TCP/IP";


    public Phone(String producer, String model, int yearOfProduction, double price) {
        this.model=model;
        this.producer=producer;
        this.yearOfProduction=yearOfProduction;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", price=" + price +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("mobile is turned on");
    }


    @Override
    public void sell() throws Exception {

    }

    @Override
    public boolean sell(Human buyer, Human seller) throws Exception {
        if (seller.getMobile().price<= buyer.getCash()) {
            buyer.minusCash(seller.getMobile().price);
            seller.plusCash(seller.getMobile().price);
            buyer.setMobile(seller.getMobile());
            seller.setMobile(null);
            System.out.println("Success");
            return true;
        } else {
            System.out.println("Not enough cash");
            return false;
        }
    }

    public void installApp(String appName){
        System.out.println("InstallApp method version 1 \nApp name: " + appName + "\n");
    }

    public void installApp(String appName, Double version) {
        System.out.println("InstallApp method version 2 \nApp name " + appName + " was installed on the version: " + version + "\n");
    }
    public void installApp(String appName, Double version, String HttpAddress){
        System.out.println("InstallApp method version 3 \nApp name: " + appName + "\nVersion of app: " + version + "\nHttp Address: " + HttpAddress + "\n");
    }

    public void installApp(String[] apps) {
            System.out.println("InstallApp method version 4 \nApps: " + Arrays.toString(apps) + "\n");
    }
    public void installApp(String appName, String url){
        System.out.println("InstallApp method version 5 \nApp name: " + appName + " \nApp URL: " + url + "\n");
    }

}
