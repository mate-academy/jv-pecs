package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        bulldozersList.add(new Bulldozer("U blade","Bulldozer1","white"));
        bulldozersList.add(new Bulldozer("S blade","Bulldozer2","red"));
        bulldozersList.add(new Bulldozer("S-U","Bulldozer3","black"));
        return bulldozersList;
    }
}
