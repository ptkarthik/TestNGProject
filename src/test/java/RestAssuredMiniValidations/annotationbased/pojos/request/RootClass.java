package RestAssuredMiniValidations.annotationbased.pojos.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RootClass {
    @JsonProperty("user_id")
    private String user_id;
    @JsonProperty("full_name")
    private String full_Name;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("contact_info")
    private Contacts contact_info;
    @JsonProperty("addresses")
    private List<Address> addresses;
    @JsonProperty("date_of_birth")
    private List<Address> date_of_birth;
    @JsonProperty("skills")
    private List<String> skills;
    @JsonProperty("preferences")
    private Preferences preferences;


}
