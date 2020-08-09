package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;

public class MainApp {
    public static void main(String[] args) {

        System.out.println(new MachineServiceImpl().getAll(Excavator.class));
        new MachineServiceImpl().getAll(Machine.class);
    }

}
