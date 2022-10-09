package Exercise03Vehicles;

public class Locomotive extends Train{


    public Locomotive(String name, Integer maxNumberOfPassengers, Train train) {
        super(name, FuelType.ELECTRIC, maxNumberOfPassengers);

    }


}
