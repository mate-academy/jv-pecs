package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private String excavatorName1 = "Jekky";
    private String excavatorName2 = "Oliver";
    private String excavatorColor1 = "Orange";
    private String excavatorColor2 = "Black";
    private int excavatorPower1 = 155;
    private int excavatorPower2 = 98;
    private double excavatorScoopVolume1 = 19;
    private double excavatorScoopVolume2 = 34;

    public List<Excavator> get() {
        Excavator excavator1 = new Excavator(excavatorName1, excavatorColor1,
                excavatorPower1, excavatorScoopVolume1);
        Excavator excavator2 = new Excavator(excavatorName2, excavatorColor2,
                excavatorPower2, excavatorScoopVolume2);
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(excavator1);
        excavators.add(excavator2);
        return excavators;
    }
}
