package practise.restassured.hometask3.typicde.pojos;

import lombok.Data;

@Data
public class UserDetails {
    private int id;
    private String username;
    private String name;
    private String email;
    private UserAddress address;
    private String phone;
    private String website;
    private Company company;

    public UserDetails() {

    }

    public UserDetails(int id, String username, String name, String email, UserAddress address, String phone, String website, Company company) {
        this.id = id;
        this.username= username;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.website = website;
        this.company = company;
    }
}
