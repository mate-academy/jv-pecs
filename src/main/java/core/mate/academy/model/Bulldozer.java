package core.mate.academy.model;

public class Bulldozer extends Machine {
    private Integer weighBlade;
    private String typeTracks;

    public Bulldozer(Integer weighBlade, String typeTracks) {
        this.weighBlade = weighBlade;
        this.typeTracks = typeTracks;
    }

    public Bulldozer() {
    }

    public Integer getWeighBlade() {
        return weighBlade;
    }

    public void setWeighBlade(Integer weighBlade) {
        this.weighBlade = weighBlade;
    }

    public String getTypeTracks() {
        return typeTracks;
    }

    public void setTypeTracks(String typeTracks) {
        this.typeTracks = typeTracks;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
