package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExcavatorProducer<T extends Excavator> implements MachineProducer<T> {
    private final String[] colors = new String[]{"red", "blue", "black",
            "orange", "grey", "green", "yellow"};
    private final String[] names = new String[]{"Volvo", "Freightliner", "Peterbilt",
            "JCB", "KOMATSU", "HITACHI", "CAT"};
    private final String[] motorTypes = new String[]{"diesel", "electric"};
    private final Random random = new Random();

    @Override
    public List<? extends Machine> get() {
        List<Excavator> list = new ArrayList<Excavator>();
        for (int i = 0; i < 3; i++) {
            Excavator excavator = new Excavator();
            excavator.setMotorType(motorTypes[random.nextInt(2)]);
            excavator.setName(names[random.nextInt(7)]);
            excavator.setColor(colors[random.nextInt(7)]);
            list.add(excavator);
        }
        return list;
    }
}
