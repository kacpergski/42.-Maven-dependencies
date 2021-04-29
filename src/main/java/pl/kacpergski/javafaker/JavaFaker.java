package pl.kacpergski.javafaker;

import com.github.javafaker.Faker;

public class JavaFaker {
    public static void main(String[] args) {
        int size = 1_000;
        Address [] addresses = new Address[size];
        Faker faker = new Faker();
        // generate
        for (int i = 0; i < addresses.length; i++) {

            String city = faker.address().city();
            String street = faker.address().streetName();
            String streetNumber = faker.address().buildingNumber();
            addresses[i] = new Address (city,street,streetNumber);
        }

        // display
        for (Address address: addresses) {
            System.out.println(address);
        }

    }
}
