package core.mate.academy.model;

public class Excavator extends Machine {
    private int ipn;
    private String name;

    public Excavator() {
    }

    public Excavator(int ipn, String name) {
        this.ipn = ipn;
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public int getIpn() {
        return ipn;
    }

    public void setIpn(int ipn) {
        this.ipn = ipn;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
