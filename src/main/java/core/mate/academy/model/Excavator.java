package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int size;

    public Excavator() {
    }

    public Excavator(int size) {
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public List<? extends Machine> get() {
        Excavator excavator1 = new Excavator(random.nextInt());
        Excavator excavator2 = new Excavator(random.nextInt());
        Excavator excavator3 = new Excavator(random.nextInt());
        List<Excavator> list = new ArrayList<>();
        list.add(excavator1);
        list.add(excavator2);
        list.add(excavator3);
        return list;
    }
}
