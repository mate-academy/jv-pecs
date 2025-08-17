package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        return List.of(new Excavator("DraglineExcavators", "Silver", "Dragline", 500),
                new Excavator("SuctionExcavators", "Blue", "Suction", 300),
                new Excavator("LongReachExcavators", "Green", "LongReach", 800));
    }
}
