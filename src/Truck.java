/**
 * Created by DAM on 27/1/17.
 */
public class Truck {

    private String idtruck;
    private String model;
    private int capacity;
    private truckdriver truckdriver;

    public Truck() {
    }

    public Truck(String idtruck, String model, int capacity, truckdriver truckdriver) {
        this.idtruck = idtruck;
        this.model = model;
        this.capacity = capacity;
        this.truckdriver = truckdriver;
    }

    public String getIdtruck() {
        return idtruck;
    }

    public void setIdtruck(String idtruck) {
        this.idtruck = idtruck;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public truckdriver getTruckdriver() {
        return truckdriver;
    }

    public void setTruckdriver(truckdriver truckdriver) {
        this.truckdriver = truckdriver;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "idtruck='" + idtruck + '\'' +
                ", model='" + model + '\'' +
                ", capacity=" + capacity +
                ", truckdriver=" + truckdriver.getName()+
                '}';
    }
}
