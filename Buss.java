package shaffel1;

public class Buss extends Cars {
    private int peaople;
    private String type;
    private boolean publicBuss;

    Buss(int peaople, String type, boolean publicBuss, int wheels, String engine, boolean transmissionAuto) {
        super(wheels, engine, transmissionAuto);
        this.type = type;
        this.peaople = peaople;
        this.publicBuss = publicBuss;
    }

    @Override
    public String toString() {
        return peaople + " " + type + " " + publicBuss + " " + getWheels() + " " + getEngine() + " " + isTransmissionAuto();
    }
}

