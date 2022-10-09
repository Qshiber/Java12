package Exercise03Vehicles;

public class Locomotive extends Train {

    private Wagon attachedWagon;

    public Locomotive(String name, Integer maxNumberOfPassengers, Train train, Wagon attachedWagon) {
        super(name, FuelType.ELECTRIC, maxNumberOfPassengers);
        this.attachedWagon = attachedWagon;
    }

    public Integer getAttachedWagonAmount() {
        Wagon currentWagon = attachedWagon;
        Integer wagonsAmount = 0;
        while (currentWagon != null) {
            wagonsAmount++;
            currentWagon = currentWagon.getAttachedWagon();
        }
        return wagonsAmount;
    }

}
