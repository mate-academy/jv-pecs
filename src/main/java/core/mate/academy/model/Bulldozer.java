package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Bulldozer extends Machine {
    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> listOfBulldozers = new ArrayList<>();
        for (int i = 0; i < COUNT_OF_MACHINES; i++) {
            listOfBulldozers.add(new Bulldozer());
        }
        return listOfBulldozers;
    }
}
