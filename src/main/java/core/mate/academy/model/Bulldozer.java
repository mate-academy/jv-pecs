package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String typeOfDump;
    private String pushFrame;
    private String looseningTeeth;

    public Bulldozer() {
    }

    public Bulldozer(String typeOfDump, String pushFrame, String looseningTeeth) {
        this.typeOfDump = typeOfDump;
        this.pushFrame = pushFrame;
        this.looseningTeeth = looseningTeeth;
    }

    public String getTypeOfDump() {
        return typeOfDump;
    }

    public String getPushFrame() {
        return pushFrame;
    }

    public String getLooseningTeeth() {
        return looseningTeeth;
    }

    public void setTypeOfDump(String typeOfDump) {
        this.typeOfDump = typeOfDump;
    }

    public void setPushFrame(String pushFrame) {
        this.pushFrame = pushFrame;
    }

    public void setLooseningTeeth(String looseningTeeth) {
        this.looseningTeeth = looseningTeeth;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
