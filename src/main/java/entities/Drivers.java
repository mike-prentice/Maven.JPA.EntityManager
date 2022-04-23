package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "drivers")
@Entity
public class Drivers {
    @Id
    @OneToMany()
    @GeneratedValue
    private int driver_id;
    private String firstName;
    private String lastName;
    private String address;
    private String state;
    private String country;

    public Drivers() {
    }

    public Drivers(int driver_id, String firstName, String lastName, String address, String state, String country) {
        this.driver_id = driver_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.country = country;
    }




    @Column(name="driverId")
    public int getDriver_id() {
        return driver_id;
    }

    public void setDriver_id(int driver_id) {
        this.driver_id = driver_id;
    }

    @Column(name="firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name="lastName")
    public String getLastName() {
        return lastName;
    }

    @Column(name="")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name="address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name="state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name="country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
