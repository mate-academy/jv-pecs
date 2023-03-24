package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final List<Bulldozer> bulldozerList = new ArrayList<>();

    @Override
    public List<? extends Machine> get() {
        createBulldozerList();
        return bulldozerList;
    }

    private void createBulldozerList() {
        for (int i = 0; i < 3; i++) {
            Bulldozer bulldozer = new Bulldozer();
            bulldozer.setColor("Color" + i);
            bulldozer.setName("name" + i);
            bulldozerList.add(bulldozer);
        }
    }
}
