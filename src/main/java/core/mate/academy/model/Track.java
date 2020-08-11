package core.mate.academy.model;

public class Track extends Machine {
    private int power;
    private String producer;

    public int getPower() {
        return power;
    }

    public String getProducer() {
        return producer;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public void doWork() {
        System.out.println("Track started to work");
    }
}
