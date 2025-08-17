package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Green" , "Pipa" , "50"));
        bulldozerList.add(new Bulldozer("Red" , "Peremoga" , "45"));
        bulldozerList.add(new Bulldozer("Black" , "Trak" , "35"));
        return bulldozerList;
    }
}
