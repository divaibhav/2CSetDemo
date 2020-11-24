/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Nov-20
 *  Time: 11:10 AM
 */
package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Creating a set which hold integer objects, and perform some methods using HashSet
 */
public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//capacity = 16 & load factor = 0.75
        //adding elements in set
        System.out.println(set.add(10));
        System.out.println(set.add(20));
        System.out.println(set.add(10));
        System.out.println(set.add(8));
        System.out.println(set.add(103));
        System.out.println(set.add(50));
        //printing set
        System.out.println(set);

        //traversing the set
        //using for each loop
        System.out.println("for each loop");
        for(Integer element : set){
            System.out.print(element + ", ");
        }
        //by using iterator
        System.out.println();
        System.out.println("iterator");
        //only print odd elements.
        Iterator<Integer> itr = set.iterator();
        while (itr.hasNext()){
            Integer i = itr.next();
            if(i % 2 != 0) {
                System.out.print(i +", ");
            }
        }
        System.out.println();

        ArrayList<Integer> list = new ArrayList<>();
        //initializing the list using for loop and Math.random()

        for (int i = 0; i < 10 ; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println("list = " + list);

        //adding all the elements of list in set
        set.addAll(list);
        System.out.println("set = " + set);
        System.out.println(set.size());

        //removing an element from set
        System.out.println(set.remove(1000));
        System.out.println(set.remove(103));
        System.out.println("set = " + set);



    }
}
