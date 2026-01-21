package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();

        Excavator caterpillar320 = new Excavator();
        caterpillar320.setPower(172);

        Excavator komatsuPC210LC = new Excavator();
        komatsuPC210LC.setPower(165);

        Excavator volvoEC220E = new Excavator();
        volvoEC220E.setPower(175);

        excavators.add(caterpillar320);
        excavators.add(komatsuPC210LC);
        excavators.add(volvoEC220E);

        return excavators;
    }
}
