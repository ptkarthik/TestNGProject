package RestAssuredMiniValidations.venkatidea.pojos;

import java.util.List;
import java.util.Objects;

public class RootClass {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RootClass rootClass = (RootClass) o;
        return Objects.equals(criterias, rootClass.criterias) && Objects.equals(criterions, rootClass.criterions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criterias, criterions);
    }

    public RootClass() {

    }

    private List<Criteria> criterias;
    private List<List<Criterions>> criterions;

    public List<List<Criterions>> getCriterions() {
        return criterions;
    }

    public void setCriterions(List<List<Criterions>> criterions) {
        this.criterions = criterions;
    }

    public List<Criteria> getCriterias() {
        return criterias;
    }

    public void setCriterias(List<Criteria> criterias) {
        this.criterias = criterias;
    }


}
