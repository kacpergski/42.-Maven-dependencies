package pl.kacpergski.javafaker;

public class Address {
    private String city;
    private String street;
    private String streetNumber;

    public Address(String city, String street, String streetNumber) {
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}
