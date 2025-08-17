package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {

        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setCaterpillar("TruckCutterpiller");
        bulldozer.setLadle("Promtexservice");
        bulldozer.setName("Wirtgen");
        bulldozer.setColor("Red");
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozer);

        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setCaterpillar("cutterpillerTruck1");
        bulldozer1.setLadle("Promtexservice1");
        bulldozer1.setName("Wirtgen1");
        bulldozer1.setColor("White");
        bulldozerList.add(bulldozer1);

        return bulldozerList;
    }
}
