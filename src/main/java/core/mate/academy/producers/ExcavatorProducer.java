package core.mate.academy.producers;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator("im123", "red", "pink", 123);
        Excavator excavator2 = new Excavator("im234", "purple", "yellow", 234);
        Excavator excavator3 = new Excavator("im345", "blue", "green", 345);
        return List.of(excavator1, excavator2, excavator3);
    }
}
