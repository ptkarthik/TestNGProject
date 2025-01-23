package RestAssuredMiniValidations.annotationbased.pojos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class ContactInfo {
    @JsonProperty("email")
    private String email;

    @JsonProperty("phone_numbers")
    private List<String> phoneNumbers;
}
