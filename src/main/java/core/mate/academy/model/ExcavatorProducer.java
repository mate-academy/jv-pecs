package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private List<Excavator> excavatorList = new ArrayList<>();
    private Excavator excavator1 = new Excavator();
    private Excavator excavator2 = new Excavator();

    @Override
    public List<Excavator> get() {
        excavator1.setName("excavator_1");
        excavator1.setColor("Yellow");
        excavator1.setTypeBuckets("Auger");
        excavator1.setTypeExcavator("Long Reach");
        excavator2.setTypeFrame("Track frame");
        excavator2.setName("excavator_2");
        excavator2.setColor("Orange");
        excavator2.setTypeBuckets("Clamp");
        excavator2.setTypeExcavator("Dragline");
        excavator2.setTypeFrame("Track frame");
        excavatorList.add(excavator1);
        excavatorList.add(excavator2);
        return excavatorList;
    }
}
