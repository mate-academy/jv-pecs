package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int individualNumber;
    private String name;

    public Bulldozer() {
    }

    public Bulldozer(int ipn, String name) {
        this.individualNumber = ipn;
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getIndividualNumber() {
        return individualNumber;
    }

    public void setIndividualNumber(int individualNumber) {
        this.individualNumber = individualNumber;
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
