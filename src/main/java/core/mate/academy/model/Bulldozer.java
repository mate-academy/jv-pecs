package core.mate.academy.model;

import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bulldozeClass;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bulldozeClass) {
        super(name, color);
        this.bulldozeClass = bulldozeClass;
    }

    public String getBulldozeClass() {
        return bulldozeClass;
    }

    public void setBulldozeClass(String bulldozeClass) {
        this.bulldozeClass = bulldozeClass;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Machine> get() {
        Bulldozer bully = new Bulldozer("Cat","Yellow","Small");
        Bulldozer hurricane = new Bulldozer("Volvo","Blue","Large");
        Bulldozer caty = new Bulldozer("Cat","Yellow","Medium");
        return List.of(bully, hurricane, caty);
    }
}
