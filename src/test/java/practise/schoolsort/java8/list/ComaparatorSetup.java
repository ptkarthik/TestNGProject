package practise.schoolsort.java8.list;

import java.util.Comparator;

public class ComaparatorSetup implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
