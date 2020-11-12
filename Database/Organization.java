/**
 *
 * @author gavinnagra
 */
public class Organization {

    String name;
    String address;

    public Organization() {
    }

    public Organization(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String toString() {
        System.out.println("Organization Name: " + this.name + "\nAddress: "
                + this.address);
        return null;
    }
}
