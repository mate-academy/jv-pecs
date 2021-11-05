package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Bulldozer> get() {
        Bulldozer num1 = new Bulldozer("Bulldozer-B724", "Blue-Yellow", "Ukraine",
                "river dam building",2004);
        Bulldozer num2 = new Bulldozer("Buldozer-L34QB", "Green", "USA","road building",1975);
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(num1);
        bulldozerList.add(num2);
        return bulldozerList;
    }
}
