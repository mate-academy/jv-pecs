package core.mate.academy.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final ModelSupplier modelSupplier = new ModelSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer(
                modelSupplier.getRandomModel(),
                colorSupplier.getRandomColor()));
        bulldozerList.add(new Bulldozer(
                modelSupplier.getRandomModel(),
                colorSupplier.getRandomColor()));
        bulldozerList.add(new Bulldozer(
                modelSupplier.getRandomModel(),
                colorSupplier.getRandomColor()));
        return bulldozerList;
    }
}
