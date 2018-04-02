package data;

/**
 * Created by deshanchathusanka on 4/2/18.
 */
public class Vehicle implements Cloneable{
    private String brand;
    private String country;
    private Person owner;

    public Vehicle(String brand, String country,Person owner)
    {
        this.brand=brand;
        this.country=country;
        this.owner=owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        Vehicle vehicle = (Vehicle) super.clone();
        vehicle.owner = this.owner.clone();
        return vehicle;
    }
}
