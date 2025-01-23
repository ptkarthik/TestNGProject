package RestAssuredMiniValidations.venkatidea.pojos;

import java.util.Objects;

public class Criterions {
    private String criteria;
    private String value;

    @Override
    public int hashCode() {
        return Objects.hash(criteria, value, description);
    }

    private String description;

    @Override
    public String toString() {
        return "Criterions{" +
                "criteria='" + criteria + '\'' +
                ", value='" + value + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public Criterions() {

    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }


}
