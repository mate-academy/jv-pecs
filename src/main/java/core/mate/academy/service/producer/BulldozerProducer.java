package core.mate.academy.service.producer;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList();
        bulldozerList.add(new Bulldozer("Bul1", "yello", 120));
        bulldozerList.add(new Bulldozer("Bul2", "green", 121));
        bulldozerList.add(new Bulldozer("Bul3", "y", 12));
        bulldozerList.add(new Bulldozer("Bul4", "g", 11));
        return bulldozerList;
    }
}
