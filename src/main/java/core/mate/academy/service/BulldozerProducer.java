package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    private String bulldozerName1 = "Shaulin";
    private String bulldozerName2 = "Herbatiy";
    private String bulldozerColor1 = "RED";
    private String bulldozerColor2 = "BLUE";
    private double bulldozerWeight1 = 85.1;
    private double bulldozerWeight2 = 123.4;
    private double bulldozerLength1 = 15.4;
    private double bulldozerLength2 = 18.3;

    @Override
    public List<Bulldozer> get() {
        Bulldozer bulldozer1 = new Bulldozer(bulldozerName1, bulldozerColor1,
                bulldozerWeight1, bulldozerLength1);
        Bulldozer bulldozer2 = new Bulldozer(bulldozerName2, bulldozerColor2,
                bulldozerWeight2, bulldozerLength2);
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozer1);
        bulldozers.add(bulldozer2);
        return bulldozers;
    }
}
