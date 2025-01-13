package practise.schoolsort.java8.map;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class ComparatorReverseOrder implements Comparator<StudentDetails> {
    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
        return o2.getStudentID().compareTo(o1.getStudentID());
    }

    @Override
    public Comparator<StudentDetails> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<StudentDetails> thenComparing(Comparator<? super StudentDetails> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<StudentDetails> thenComparing(Function<? super StudentDetails, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<StudentDetails> thenComparing(Function<? super StudentDetails, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<StudentDetails> thenComparingInt(ToIntFunction<? super StudentDetails> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<StudentDetails> thenComparingLong(ToLongFunction<? super StudentDetails> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<StudentDetails> thenComparingDouble(ToDoubleFunction<? super StudentDetails> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
