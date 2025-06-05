package core.mate.academy.model;

import core.mate.academy.service.MachineService;
import core.mate.academy.service.MachineServiceImpl;

public class Main {
    public static void main(String[] args) {
        MachineService<Machine> truckMachineService = new MachineServiceImpl();
        truckMachineService.getAll(Truck.class);
    }
}
