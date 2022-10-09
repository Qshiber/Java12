package Exercise03Vehicles;

public class Wagon extends Train{

    private Wagon attachedWagon;
    public Wagon(String name, Integer maxNumberOfPassengers) {
        super(name, FuelType.MANUAL, maxNumberOfPassengers);

    }

    public void setAttachedWagon(Wagon attachedWagon){
        this.attachedWagon = attachedWagon;
    }

    public Wagon getAttachedWagon() {
        return attachedWagon;
    }
}
