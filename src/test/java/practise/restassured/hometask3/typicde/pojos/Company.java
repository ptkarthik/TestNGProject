package practise.restassured.hometask3.typicde.pojos;

import lombok.Data;

@Data
public class Company {
    private String name;
    private String catchPhrase;

    public Company() {

    }
    public Company(String name, String catchPhrase, String bs) {
        this.name = name;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    private String bs;
}
