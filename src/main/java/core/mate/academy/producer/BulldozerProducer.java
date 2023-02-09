package core.mate.academy.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer caterpillar = new Bulldozer();
        caterpillar.setBladeType("S");
        caterpillar.setOperatingWeight(2500);
        caterpillar.setColor("Yellow");
        caterpillar.setName("CAT");
        Bulldozer jansen = new Bulldozer();
        jansen.setBladeType("U");
        jansen.setOperatingWeight(3000);
        jansen.setColor("Red");
        jansen.setName("Jansen");
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(caterpillar);
        bulldozerList.add(jansen);
        return bulldozerList;
    }
}
