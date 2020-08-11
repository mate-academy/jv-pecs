package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BuldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List get() {
        List<Bulldozer> buldozers = new ArrayList<>();
        buldozers.add(new Bulldozer(100, 3, "FirstBuldozer", "Yellow"));
        buldozers.add(new Bulldozer(90, 2, "SecondBuldozer", "Blue"));
        buldozers.add(new Bulldozer(50, 1, "ThirdBuldozer", "Yellow"));
        return buldozers;
    }
}
