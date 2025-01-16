package oonbardingmodulesrevisit.collectionslearn.comparator;

import org.checkerframework.checker.units.qual.A;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientCode {
    public static void main(String[] args) {
        PlayerClass amy = new PlayerClass("Amy",100);
        PlayerClass david = new PlayerClass("David",100);
        PlayerClass heraldo= new PlayerClass("Heraldo",50);
        PlayerClass aakansha = new PlayerClass("Aakansha",75);
        PlayerClass aleksa = new PlayerClass("Aleksa",150);

        List<PlayerClass> listOfPlayerClass= new ArrayList<>();
        listOfPlayerClass.add(amy);
        listOfPlayerClass.add(david);
        listOfPlayerClass.add(heraldo);
        listOfPlayerClass.add(aakansha);
        listOfPlayerClass.add(aleksa);


        Collections.sort(listOfPlayerClass, new ComparatorSetup());
        System.out.println(listOfPlayerClass);
    }
}
