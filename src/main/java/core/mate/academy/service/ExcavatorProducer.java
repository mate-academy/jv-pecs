package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator("Ed", "green", 2015);
    private Excavator excavator2 = new Excavator("Boo", "black", 2022);
    private Excavator excavator3 = new Excavator("Lipo", "white", 2019);
    private List<Excavator> excavators = List.of(excavator1, excavator2, excavator3);

    @Override
    public List<? extends Excavator> get() {
        return new ArrayList<>(excavators);
    }
}
