package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private int volume;

    public Bulldozer() {
    }

    public Bulldozer(int volume) {
        this.volume = volume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<? extends Machine> get() {
        Bulldozer bulldozer1 = new Bulldozer(random.nextInt());
        Bulldozer bulldozer2 = new Bulldozer(random.nextInt());
        Bulldozer bulldozer3 = new Bulldozer(random.nextInt());
        List<Bulldozer> list = new ArrayList<>();
        list.add(bulldozer1);
        list.add(bulldozer2);
        list.add(bulldozer3);
        return list;
    }
}
