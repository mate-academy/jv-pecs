package core.mate.academy.producer;

import core.mate.academy.enums.SuspensionTypes;
import core.mate.academy.enums.TransmissionTypes;
import core.mate.academy.model.Bulldozer;
import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> produce() {

        int indexSuspension = new Random().nextInt(SuspensionTypes.values().length);
        int indexTransmission = new Random().nextInt(TransmissionTypes.values().length);

        Bulldozer bulldozerCat = new Bulldozer();
        bulldozerCat.setBladeHeight(3);
        bulldozerCat.setBladeWidth(5);
        bulldozerCat.setSuspension(SuspensionTypes.values()[indexSuspension].toString());
        bulldozerCat.setTransmissionType(TransmissionTypes.values()
                [indexTransmission].toString());
        bulldozerCat.setName("CATERPILLAR");
        bulldozerCat.setColor("Yellow");

        Bulldozer bulldozerHyundai = new Bulldozer();
        bulldozerHyundai.setBladeHeight(3);
        bulldozerHyundai.setBladeWidth(5);
        bulldozerHyundai.setSuspension(SuspensionTypes.values()
                [indexSuspension].toString());
        bulldozerHyundai.setTransmissionType(TransmissionTypes.values()
                [indexTransmission].toString());
        bulldozerHyundai.setName("Hyundai");
        bulldozerHyundai.setColor("Black");

        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(bulldozerCat);
        bulldozers.add(bulldozerHyundai);

        return bulldozers;
    }
}
