package RestAssuredMiniValidations.annotationbased.pojos.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
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
