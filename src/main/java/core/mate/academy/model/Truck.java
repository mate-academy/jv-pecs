package core.mate.academy.model;

public class Truck extends Machine {
    private int ipn;
    private String mame;

    public Truck() {
    }

    public Truck(int ipn, String name) {
        this.ipn = ipn;
        this.mame = name;
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

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }
}
