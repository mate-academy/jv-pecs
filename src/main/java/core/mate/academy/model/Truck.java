package core.mate.academy.model;

public class Truck extends Machine {
    private int payload;
    private String purpose;

    public Truck() {
    }

    public Truck(int payload, String purpose) {
        this.payload = payload;
        this.purpose = purpose;
    }

    public int getPayload() {
        return payload;
    }

    public void setPayload(int payload) {
        this.payload = payload;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
