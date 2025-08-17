package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();

        Bulldozer bulldozer1 = new Bulldozer(5500, new String[]{"No Equipment"});
        bulldozer1.setName("bulldozer1");
        bulldozer1.setColor("Red");
        bulldozerList.add(bulldozer1);

        Bulldozer bulldozer2 = new Bulldozer(4500, new String[]{"loosening teeth", "slopes"});
        bulldozer1.setName("bulldozer2");
        bulldozer1.setColor("Yellow");
        bulldozerList.add(bulldozer2);

        Bulldozer bulldozer3 = new Bulldozer(5000, new String[]{"Expanders"});
        bulldozer1.setName("bulldozer3");
        bulldozer1.setColor("Green");
        bulldozerList.add(bulldozer3);

        return bulldozerList;
    }
}
