package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String manufacturerMachine;
    private String functionMachine;
    private int issueMachine;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String manufacturerMachine,
                     String functionMachine, int issueMachine) {
        super(name, color);
        this.manufacturerMachine = manufacturerMachine;
        this.functionMachine = functionMachine;
        this.issueMachine = issueMachine;
    }

    public String getManufacturerMachine() {
        return manufacturerMachine;
    }

    public void setManufacturerMachine(String manufacturerMachine) {
        this.manufacturerMachine = manufacturerMachine;
    }

    public String getFunctionMachine() {
        return functionMachine;
    }

    public void setFunctionMachine(String functionMachine) {
        this.functionMachine = functionMachine;
    }

    public int getIssueMachine() {
        return issueMachine;
    }

    public void setIssueMachine(int issueMachine) {
        this.issueMachine = issueMachine;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
