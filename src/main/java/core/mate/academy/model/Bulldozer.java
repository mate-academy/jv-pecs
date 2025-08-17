package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String speed;
    public Bulldozer(String color , String name , String speed) {
        super(color , name);
        this.speed = speed;
    }


    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
