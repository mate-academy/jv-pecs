package core.mate.academy.impl;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.ColorSupplier;
import core.mate.academy.model.ModelSupplier;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private final ModelSupplier modelSupplier = new ModelSupplier();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            bulldozerList.add(new Bulldozer(
                    modelSupplier.getRandomModel(),
                    colorSupplier.getRandomColor()));
        }
        return bulldozerList;
    }
}
