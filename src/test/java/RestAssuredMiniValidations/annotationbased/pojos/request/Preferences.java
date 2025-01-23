package RestAssuredMiniValidations.annotationbased.pojos.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Preferences {
    @JsonProperty("newsletter_opt_in")
    private boolean newsletter_opt_in;
    @JsonProperty("preferred_contact_method")
    private String preferred_contact_method;
    @JsonProperty("language")
    private String language;

}
