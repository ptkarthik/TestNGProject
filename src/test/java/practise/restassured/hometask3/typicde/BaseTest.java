package practise.restassured.hometask3.typicde;

import practise.restassured.hometask3.typicde.pojos.UserDetails;

import java.util.List;

public class BaseTest {
    public boolean returnTrueIfNamePresent(List<UserDetails> rootClass) {
        for (UserDetails j : rootClass) {
            if (j.getName().equalsIgnoreCase("Ervin Howell")) {
                return true;
            }
        }
        return false;
    }
}
