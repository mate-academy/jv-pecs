package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Bulldozer extends Machine {
    private List<Bulldozer> bulldozerStorage = new ArrayList<>();

    public Bulldozer() {
    }

    public List<Bulldozer> readStorage() {
        return bulldozerStorage;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public void initalizeStorage() {
        bulldozerStorage.add(new Bulldozer());
        bulldozerStorage.add(new Bulldozer());
        bulldozerStorage.add(new Bulldozer());
        bulldozerStorage.add(new Bulldozer());
        bulldozerStorage.add(new Bulldozer());
    }
}
