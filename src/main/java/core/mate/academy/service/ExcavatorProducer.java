package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("Caterpillar 336DL");
        excavator1.setColor("Yellow");
        excavator1.setLengthStick(3200);
        excavator1.setVolumeBucket(600);

        Excavator excavator2 = new Excavator();
        excavator2.setName("Liebherr R9150B");
        excavator2.setColor("Yellow");
        excavator2.setLengthStick(3400);
        excavator2.setVolumeBucket(800);

        return new ArrayList<>(Arrays.asList(excavator1, excavator2));
    }
}
