package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozerOne = new Bulldozer("John Deere","green");
        Bulldozer bulldozerSecond = new Bulldozer("CAT", "yellow");
        Bulldozer bulldozerTree = new Bulldozer("New Holland", "blue");

        List<Bulldozer> bulldozersList = new ArrayList<>();
        bulldozersList.add(bulldozerOne);
        bulldozersList.add(bulldozerSecond);
        bulldozersList.add(bulldozerTree);
        return bulldozersList;
    }
}
