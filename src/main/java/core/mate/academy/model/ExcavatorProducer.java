package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {

    @Override
    public List<Excavator> get() {
        Excavator excavator1 = new Excavator();
        excavator1.setName("excavator_1");
        excavator1.setColor("Yellow");
        excavator1.setTypeBuckets("Auger");
        excavator1.setTypeExcavator("Long Reach");
        Excavator excavator2 = new Excavator();
        excavator2.setTypeFrame("Track frame");
        excavator2.setName("excavator_2");
        excavator2.setColor("Orange");
        excavator2.setTypeBuckets("Clamp");
        excavator2.setTypeExcavator("Dragline");
        excavator2.setTypeFrame("Track frame");
        List<Excavator> excavatorsList = new ArrayList<>();
        excavatorsList.add(excavator1);
        excavatorsList.add(excavator2);
        return excavatorsList;
    }
}
