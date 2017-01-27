/**
 * Created by DAM on 27/1/17.
 */
public class Package {

    private int idpackage;
    private String customer;
    private truckdriver truckdriver;
    private City city;

    public Package(int idpackage, String customer, truckdriver truckdriver, City city) {
        this.idpackage = idpackage;
        this.customer = customer;
        this.truckdriver = truckdriver;
        this.city = city;
    }

    public Package() {
    }

    public int getIdpackage() {
        return idpackage;
    }

    public void setIdpackage(int idpackage) {
        this.idpackage = idpackage;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public truckdriver getTruckdriver() {
        return truckdriver;
    }

    public void setTruckdriver(truckdriver truckdriver) {
        this.truckdriver = truckdriver;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
