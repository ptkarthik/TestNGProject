package myrepo.pojos;

import java.util.List;

public class RootClass {


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
