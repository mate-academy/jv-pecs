package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavatorList = new ArrayList<>();
        excavatorList.add(new Excavator().setBucketRange(3).setBucketVolume(100));
        excavatorList.add(new Excavator().setBucketRange(5).setBucketVolume(200));
        excavatorList.add(new Excavator().setBucketRange(2).setBucketVolume(40));
        return excavatorList;
    }
}
