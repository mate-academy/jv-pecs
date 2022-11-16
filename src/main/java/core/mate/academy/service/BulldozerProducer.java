package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        double audiBladeLength = 5.5;
        double audiBladeWidth = 6.6;
        double audiBladeHeight = 4.4;
        int audiBladeWeight = 550;
        Bulldozer bulldozer1 = new Bulldozer("Audi", "black", audiBladeLength,
                audiBladeWidth, audiBladeHeight, audiBladeWeight);
        Bulldozer bulldozer2 = new Bulldozer();
        double volvoBladeLength = 5.6;
        double volvoBladeWidth = 6.7;
        double volvoBladeHeight = 4.6;
        int volvoBladeWeight = 580;
        Bulldozer bulldozer3 = new Bulldozer("Volvo", "white",
                volvoBladeLength, volvoBladeWidth, volvoBladeHeight, volvoBladeWeight);
        List<Bulldozer> bulldozerArrayList = new ArrayList<>();
        bulldozerArrayList.add(bulldozer1);
        bulldozerArrayList.add(bulldozer2);
        bulldozerArrayList.add(bulldozer3);
        return bulldozerArrayList;
    }
}
