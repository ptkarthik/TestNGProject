package RestAssuredMiniValidations.annotationbased.pojos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Preferences {
    @JsonProperty("newsletter_opt_in")
    private boolean newsletterOptIn;

    @JsonProperty("preferred_contact_method")
    private String preferredContactMethod;

    @JsonProperty("language")
    private String language;
}
