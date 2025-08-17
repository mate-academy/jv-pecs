package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Caterpillar", "S12", "USA", 500));
        bulldozerList.add(new Bulldozer("Slun'Hun'Chai", "RT45X", "China", 450));
        bulldozerList.add(new Bulldozer("John Deere", "BN78", "USA", 600));
        return bulldozerList;
    }
}
