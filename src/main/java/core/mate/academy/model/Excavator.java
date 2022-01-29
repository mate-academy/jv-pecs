package core.mate.academy.model;

public class Excavator extends Machine {
    private String ownerCompany;
    private int year;

    public Excavator() {
    }

    public Excavator(String ownerCompany, int year) {
        this.ownerCompany = ownerCompany;
        this.year = year;
    }

    public String getOwnerCompany() {
        return ownerCompany;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
