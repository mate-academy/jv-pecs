package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    private Excavator excavator1 = new Excavator();
    private Excavator excavator2 = new Excavator("diesel", 134.4);
    private Excavator excavator3 = new Excavator("electric", 207.2);

    public Excavator getExcavator1() {
        return excavator1;
    }

    public Excavator getExcavator2() {
        return excavator2;
    }

    public Excavator getExcavator3() {
        return excavator3;
    }

    public void setExcavator1(Excavator excavator1) {
        this.excavator1 = excavator1;
    }

    public void setExcavator2(Excavator excavator2) {
        this.excavator2 = excavator2;
    }

    public void setExcavator3(Excavator excavator3) {
        this.excavator3 = excavator3;
    }

    @Override
    public List<Excavator> get() {
        ArrayList<Excavator> listOfExcavators = new ArrayList<>();
        listOfExcavators.add(excavator1);
        listOfExcavators.add(excavator2);
        listOfExcavators.add(excavator3);
        return listOfExcavators;
    }
}
