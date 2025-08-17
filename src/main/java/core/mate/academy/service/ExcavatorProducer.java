package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> list = new ArrayList<>();
        list.add(createExcavator("Excavator red", "red", 3));
        list.add(createExcavator("Excavator blue", "blue", 2));
        list.add(createExcavator("Excavator green", "green", 4));
        return list;
    }

    private Excavator createExcavator(String name, String color, int height) {
        Excavator truck = new Excavator();
        truck.setName(name);
        truck.setColor(color);
        truck.setHeight(height);
        return truck;
    }
}
