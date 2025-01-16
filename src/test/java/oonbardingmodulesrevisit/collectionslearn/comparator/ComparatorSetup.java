package oonbardingmodulesrevisit.collectionslearn.comparator;

import java.util.Comparator;

public class ComparatorSetup implements Comparator<PlayerClass> {

    @Override
    public int compare(PlayerClass o1, PlayerClass o2) {
        int scoreComparison = o2.getScore().compareTo(o1.getScore());
        if (scoreComparison == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return scoreComparison;
    }
}
