package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private static final List<Bulldozer> BULLDOZER_LIST = createBulldozerList();

    public List<Bulldozer> get() {
        return BULLDOZER_LIST;
    }

    private static List<Bulldozer> createBulldozerList() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setColor("Color" + i);
            bulldozer.setName("name" + i);
            bulldozers.add(bulldozer);
        }
        return bulldozers;
    }
}
