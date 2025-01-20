package practise.restassured.hometask3.typicde.pojos;

import lombok.Data;

@Data
public class Geo {
    private String lat;
    private String lng;

    public Geo() {

    }
    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }
}
