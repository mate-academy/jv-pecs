package core.mate.academy.model;

public class Truck extends Machine {
    private int ipn;
    private String name;

    public Truck() {
    }

    public Truck(int ipn, String name) {
        this.ipn = ipn;
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getIpn() {
        return ipn;
    }

    public void setIpn(int ipn) {
        this.ipn = ipn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
