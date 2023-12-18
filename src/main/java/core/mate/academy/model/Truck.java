package core.mate.academy.model;

public class Truck extends Machine {
    private boolean isHaveTrailer;

    public Truck() {
    }

    public boolean isHaveTrailer() {
        return isHaveTrailer;
    }

    public void setHaveTrailer(boolean haveTrailer) {
        isHaveTrailer = haveTrailer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
