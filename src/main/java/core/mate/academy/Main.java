package core.mate.academy;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import core.mate.academy.service.MachineServiceImpl;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MachineServiceImpl impl = new MachineServiceImpl();
        List<Machine> m1 = impl.getAll(Truck.class);
        System.out.println(m1.get(0).getName());
        Excavator exc1 = new Excavator();
        exc1.setName("Test excavator");
        impl.fill(m1, exc1);
        System.out.println(m1.get(0).getName());
        impl.startWorking(m1);
    }
}
