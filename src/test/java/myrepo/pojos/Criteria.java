package myrepo.pojos;

import java.util.Objects;


public class Criteria {
    private String criteria;

    @Override
    public int hashCode() {
        return Objects.hash(criteria, description);
    }

    private String description;

    @Override
    public String toString() {
        return "Criteria{" +
                "criteria='" + criteria + '\'' +
                ", description='" + description + '\'' +
                '}';
    }



    public Criteria() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }


}
