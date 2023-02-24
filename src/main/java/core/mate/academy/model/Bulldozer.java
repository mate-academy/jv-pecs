package core.mate.academy.model;

import java.util.ArrayList;
import java.util.List;

public class Bulldozer extends Machine {
    private static final String BULDOZER_UNIQUE_FIELD = "buldozer";
    private List<Bulldozer> bulldozerStorage = new ArrayList<>();

    public Bulldozer() {
    }

    public List<Bulldozer> readStorage() {
        return bulldozerStorage;
    }

    public void putItemToStorage(Bulldozer bulldozer) {
        bulldozerStorage.add(bulldozer);
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
