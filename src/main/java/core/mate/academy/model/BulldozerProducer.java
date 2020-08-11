package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<Bulldozer>();
        bulldozerList.add(new Bulldozer(5,6.4f,"Maz","yellow"));
        bulldozerList.add(new Bulldozer(9,5.8f,"Cat","red"));
        bulldozerList.add(new Bulldozer(2,2.3f,"Mers","grey"));
        return bulldozerList;
    }
}
