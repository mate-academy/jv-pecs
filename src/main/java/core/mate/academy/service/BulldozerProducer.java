package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer extends Bulldozer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("Yellow", "CAT", 17855, "Cat C3.6"));
        bulldozerList.add(new Bulldozer("Red", "CAT", 18976, "Cat C3.8"));
        return bulldozerList;
    }
}
