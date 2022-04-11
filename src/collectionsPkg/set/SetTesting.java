package collectionsPkg.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTesting {

    public static void main(String[] args) {

        Set<Integer> set=new HashSet<>();
        set.add(1);
        boolean status=set.add(1);
        System.out.println(status);
        set.add(2);
        set.add(3);
        set.add(null);

        System.out.println(set);

        Set<Integer> linkedHashset=new LinkedHashSet<>();
        linkedHashset.add(1000);
        linkedHashset.add(1);
        linkedHashset.add(1);
        linkedHashset.add(2);
        linkedHashset.add(3);
        linkedHashset.add(null);

        System.out.println(linkedHashset);

        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(1000);
        treeSet.add(1);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        System.out.println(treeSet);
        /*treeSet.add(null);*//*




        /*TreeSet<Integer> res = (TreeSet<Integer>)treeSet.descendingSet();*/

    }
}
