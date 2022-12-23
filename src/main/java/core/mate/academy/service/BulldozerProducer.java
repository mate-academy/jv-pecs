package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {

    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozerList = new ArrayList<>();
        bulldozerList.add(new Bulldozer("MAZ", "Red", 20));
        bulldozerList.add(new Bulldozer("BILAZ", "Yellow", 30));
        bulldozerList.add(new Bulldozer("CAT", "Black", 40));
        return bulldozerList;
    }
}
