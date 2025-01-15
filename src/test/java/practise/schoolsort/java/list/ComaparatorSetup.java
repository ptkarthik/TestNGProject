package practise.schoolsort.java.list;

import java.util.Comparator;

public class ComaparatorSetup implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
