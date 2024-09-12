package core.mate.academy.model;

import core.mate.academy.service.MachineProducer;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    private List<Truck> list;

    public TruckProducer() {
        list = new ArrayList<>();
    }

    @Override
    public List<Truck> get() {
        list.add(new Truck(400,165000,"DAF"));
        list.add(new Truck(280,20000,"Scania"));
        list.add(new Truck(350,70000,"MAN"));
        return list;
    }
}
