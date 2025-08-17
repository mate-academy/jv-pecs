package model.producer;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        Excavator excavatorVolvo = new Excavator("Volvo");
        Excavator excavatorCat = new Excavator("Cat");
        Excavator excavatorDoosan = new Excavator("Doosan");
        excavators.add(excavatorVolvo);
        excavators.add(excavatorCat);
        excavators.add(excavatorDoosan);
        return excavators;
    }
}
