package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    /**
     * In your implementations - create 2-3 models, add them to the list and return
     *
     * @return - the list of models
     */
    @Override
    public List<Machine> get() {
        Machine redBulldozer = new Bulldozer();
        redBulldozer.setName("Red");
        Machine greyBulldozer = new Bulldozer();
        greyBulldozer.setName("Grey");
        Machine blackBulldozer = new Bulldozer();
        blackBulldozer.setName("Black");

        List<Machine> bulldozerList = new ArrayList<>();
        bulldozerList.add(redBulldozer);
        bulldozerList.add(greyBulldozer);
        bulldozerList.add(blackBulldozer);

        return bulldozerList;
    }
}
