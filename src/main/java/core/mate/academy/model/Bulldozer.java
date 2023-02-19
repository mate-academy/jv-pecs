package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Bulldozer extends Machine {
    private static final int COUNT_BULLDOZERS = 3;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < COUNT_BULLDOZERS; i++) {
            bulldozers.add(new Bulldozer());
        }
        return bulldozers;
    }
}
