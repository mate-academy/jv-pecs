package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BuldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        Bulldozer bulldozer = new Bulldozer();
        for (int i = 0; i < 3; i++) {
            bulldozerList.add(bulldozer);
        }
        return bulldozerList;
    }
}
