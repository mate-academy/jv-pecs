package core.mate.academy.service;

import core.mate.academy.model.Excavator;

import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List get() {
        Excavator excavatorCat = new Excavator("Cat", 1000_000);
        Excavator excavatorVolvo = new Excavator("Volvo", 900_000);
        List<Excavator> excavatorList = List.of(excavatorCat, excavatorVolvo);
        return excavatorList;
    }
}
