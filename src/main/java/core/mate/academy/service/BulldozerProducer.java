package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer("Audi", "black", 5.5, 6.6, 4.4, 550);
        Bulldozer bulldozer2 = new Bulldozer();
        Bulldozer bulldozer3 = new Bulldozer("Volvo", "white", 5.6, 6.7, 4.6, 580);
        ArrayList<Bulldozer> bulldozerArrayList = new ArrayList<>();
        bulldozerArrayList.add(bulldozer1);
        bulldozerArrayList.add(bulldozer2);
        bulldozerArrayList.add(bulldozer3);
        return bulldozerArrayList;
    }
}
