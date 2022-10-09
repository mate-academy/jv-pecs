package core.mate.academy.model;

public class Excavator extends Machine {
    private boolean isMonoBoom;
    private boolean isKnuckleBoom;
    
    public Excavator() {
    }

    public Excavator(boolean isMonoBoom, boolean isKnuckleBoom) {
        super();
        this.isMonoBoom = isMonoBoom;
        this.isKnuckleBoom = isKnuckleBoom;
    }
    
    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
