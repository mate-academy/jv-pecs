package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String company;
    private int engineVolume;

    public Bulldozer() {
    }

    public Bulldozer(String company, int engineVolume) {
        this.company = company;
        this.engineVolume = engineVolume;
    }

    public String getCompany() {
        return company;
    }

    public Bulldozer setCompany(String company) {
        this.company = company;
        return this;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public Bulldozer setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
        return this;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
