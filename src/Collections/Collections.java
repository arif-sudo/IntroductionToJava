package Collections;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

//The collections framework was designed to meet several goals
//  The framework had to be high-performance.
//      The implementations for the fundamental collections (dynamic arrays, linked lists, trees, and hashtables) were to be highly efficient.
//  The framework had to allow different types of collections to work in a similar manner and with a high degree of interoperability.
//  The framework had to extend and/or adapt a collection easily.

// Several standard implementations such as LinkedList, HashSet, and TreeSet are provided; and you may also implement your own collection, if you choose.

// A collections framework is a unified architecture for representing and manipulating collections.
// All collections frameworks contain:
//  Interfaces
//  Implementations, i.e., Classes
//  Algorithms

// In addition to collections, the framework defines several map interfaces and classes. Maps store key/value pairs.
// Although maps are not collections in the proper use of the term, but they are fully integrated with collections

public class Collections {
    public static void main(String[] args) {

        List lnkLst = new LinkedList();
        lnkLst.add("element1");
        lnkLst.add("element2");
        lnkLst.add("element3");
        lnkLst.add("element4");
        displayAll(lnkLst);

        List aryLst = new ArrayList();
        aryLst.add("x");
        aryLst.add("y");
        aryLst.add("z");
        aryLst.add("w");
        displayAll(aryLst);

        Set hashSet = new HashSet();
        hashSet.add("set1");
        hashSet.add("set2");
        hashSet.add("set3");
        hashSet.add("set4");
        displayAll(hashSet);

        SortedSet treeSet = new TreeSet(); // always sorted
        treeSet.add("1");
        treeSet.add("4");
        treeSet.add("3");
        treeSet.add("2");
        displayAll(treeSet);

        LinkedHashSet lnkHashset = new LinkedHashSet();
        lnkHashset.add("one");
        lnkHashset.add("two");
        lnkHashset.add("three");
        lnkHashset.add("four");
        displayAll(lnkHashset);

        Map map1 = new HashMap();
        map1.put("key1", "J");
        map1.put("key2", "K");
        map1.put("key3", "L");
        map1.put("key4", "M");
        displayAll(map1.keySet());
        displayAll(map1.values());

        SortedMap map2 = new TreeMap();// always sorted
        map2.put("key1", "JJ");
        map2.put("key2", "KK");
        map2.put("key3", "LL");
        map2.put("key4", "MM");
        displayAll(map2.keySet());
        displayAll(map2.values());

        LinkedHashMap map3 = new LinkedHashMap();
        map3.put("key1", "JJJ");
        map3.put("key2", "KKK");
        map3.put("key3", "LLL");
        map3.put("key4", "MMM");
        displayAll(map3.keySet());
        displayAll(map3.values());
    }
    static void displayAll(Collection col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }
        System.out.println();
    }
}

//Result:
//  element1 element2 element3 element4
//  x y z w
//  set1 set2 set3 set4
//  1 2 3 4
//  one two three four
//  key4 key3 key2 key1
//  M L K J
//  key1 key2 key3 key4
//  JJ KK LL MM
//  key1 key2 key3 key4
//  JJJ KKK LLL MMM