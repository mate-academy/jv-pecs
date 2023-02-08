package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        Bulldozer komatsuD61ex24 = new Bulldozer(585.25, "D61EX_24", "Orange");
        Bulldozer komatsuD85px18 = new Bulldozer(660.45, "D85PX_18", "Gray");
        Bulldozer komatsuD8ttx16 = new Bulldozer(680.55, "DER19_23", "Green");
        return List.of(komatsuD61ex24, komatsuD85px18, komatsuD8ttx16);
    }
}
