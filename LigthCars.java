package shaffel1;

public class LigthCars extends  Cars{
    private int dors;
    private String type;
    private boolean turbo;
    LigthCars(int dors, String type, boolean turbo, int wheels, String engine, boolean transmissionAuto) {
        super(wheels, engine, transmissionAuto);
        this.dors = dors;
        this.type = type;
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return dors + " " + type + " " + turbo + " " + getWheels() + " " + getEngine() + " " + isTransmissionAuto();
    }
}




