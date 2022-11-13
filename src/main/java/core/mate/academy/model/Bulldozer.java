package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String scale;
    
    public Bulldozer() {
    }
    
    public String getScale() {
        return scale;
    }
    
    public void setScale(String scale) {
        this.scale = scale;
    }
    
    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
