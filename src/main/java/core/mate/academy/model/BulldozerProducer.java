package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer001 = new Bulldozer(585.25, "Bulldozer546", "Orange");
        Bulldozer bulldozer002 = new Bulldozer(660.45, "Bulldozer100", "Gray");
        Bulldozer bulldozer003 = new Bulldozer(680.55, "Bulldozer110", "Green");
        return List.of(bulldozer001, bulldozer002, bulldozer003);
    }
}
