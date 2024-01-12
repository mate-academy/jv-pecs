package core.mate.academy.model;

public class RussianWarship extends Machine implements Workable {
    @Override
    public void doWork() {
        System.out.print("Sinks");
    }
}
