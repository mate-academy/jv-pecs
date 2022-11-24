package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer();
        bulldozer1.setName("JDB");
        bulldozer1.setColor("Green");

        Bulldozer bulldozer2 = new Bulldozer();
        bulldozer2.setName("Volvo");
        bulldozer2.setColor("Red");

        Bulldozer bulldozer3 = new Bulldozer();
        bulldozer3.setName("CAT");
        bulldozer3.setColor("Black");

        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(bulldozer1);
        bulldozerList.add(bulldozer2);
        bulldozerList.add(bulldozer3);

        return bulldozerList;
    }
}
