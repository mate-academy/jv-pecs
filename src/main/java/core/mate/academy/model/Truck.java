package core.mate.academy.model;

public class Truck extends Machine {
    private int individualNumber;
    private String name;

    public Truck() {
    }

    public Truck(int ipn, String name) {
        this.individualNumber = ipn;
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public int getIndividualNumber() {
        return individualNumber;
    }

    public void setIndividualNumber(int individualNumber) {
        this.individualNumber = individualNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
