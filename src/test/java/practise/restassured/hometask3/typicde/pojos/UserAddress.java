package practise.restassured.hometask3.typicde.pojos;

import lombok.Data;

@Data
public class UserAddress {
    private String street;
    private String suite;
    private String city;
    private String zipcode;

    public UserAddress() {

    }

    public UserAddress(String street, String suite, String city, String zipcode, Geo geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    private Geo geo;
}
