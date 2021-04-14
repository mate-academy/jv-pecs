package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    @Override
    public List<Machine> get() {
        Bulldozer bully = new Bulldozer("Cat","Yellow","Small");
        Bulldozer hurricane = new Bulldozer("Volvo","Blue","Large");
        Bulldozer caty = new Bulldozer("Cat","Yellow","Medium");
        return List.of(bully, hurricane, caty);
    }
}
