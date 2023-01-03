package core.mate.academy.impl;

import core.mate.academy.model.Excavator;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private final ModelSupplier modelSupplier = new ModelSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator(
                modelSupplier.getRandomModel(),
                colorSupplier.getRandomColor()));
        excavatorList.add(new Excavator(
                modelSupplier.getRandomModel(),
                colorSupplier.getRandomColor()));
        excavatorList.add(new Excavator(
                modelSupplier.getRandomModel(),
                colorSupplier.getRandomColor()));
        return excavatorList;
    }
}
