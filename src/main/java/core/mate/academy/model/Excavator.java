package core.mate.academy.model;

public class Excavator extends Machine {
    private String releaseCountry;
    private int age;

    public Excavator() {
    }

    public Excavator(String releaseCountry, int age) {

        this.releaseCountry = releaseCountry;
        this.age = age;
    }

    public String getReleaseCountry() {
        return releaseCountry;
    }

    public void setReleaseCountry(String releaseCountry) {
        this.releaseCountry = releaseCountry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
