package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final Excavator excavator1 = new Excavator("HX520AL", "yellow", "Wheeled Excavator");
    private final Excavator excavator2 = new Excavator("HX300AL", "green", "Hydraulic Excavator");
    private final Excavator excavator3 = new Excavator("HX220AL", "black", "Dragline Excavator");
    private final List<Excavator> excavatorList = List.of(excavator1, excavator2, excavator3);

    @Override
    public List<Excavator> get() {
        return excavatorList;
    }
}
