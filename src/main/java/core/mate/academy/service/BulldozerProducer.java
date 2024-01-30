package core.mate.academy.service;

import core.mate.academy.data.Bulldozers;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer = new Bulldozer();
        Bulldozers[] bulldozerNames = Bulldozers.values();
        List<Bulldozer> bulldozersList = new ArrayList<>();

        for (int i = 0; i < NUMBERS_OF_MODELS; i++) {
            String color = Machine.getRandomColor();
            String name = bulldozerNames[i].toString();
            bulldozer.of(color, name);
            bulldozersList.add(bulldozer);
        }
        return bulldozersList;
    }
}
