package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BuildozerProducer implements MachineProducer<Bulldozer> {
    private final String[] bulldozerNames = {"John Deere", "CAT"};
    private final String[] bulldozerColors = {"Yellow", "Orange"};

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < bulldozerNames.length; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setName(bulldozerNames[i]);
            bulldozer.setColor(bulldozerColors[i]);
            bulldozers.add(bulldozer);
        }
        return List.of(bulldozers.toArray(new Bulldozer[0]));
    }
}
