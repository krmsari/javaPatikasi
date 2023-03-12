package Java102;

import Java102.CollectionMap.Map.ValueKey;
import Java102.ExceptionHandling.TryCatch;
import Java102.Generic.ListelemeSinifi.MyList;
import Java102.Generic.Nullable;
import Java102.CollectionMap.Collection.HSet;
import Java102.NestedveInnerClasses.NestedAndInner;

public class Main {
    public static void main(String[] args) {

        ValueKey valueKey = new ValueKey();
        valueKey.map();

    }

    private static void collections() {
        HSet hSet = new HSet();
        hSet.linkedHashSet();
        hSet.hashSet();
    }

    private static void tryCatch() {
        TryCatch tryCatch = new TryCatch();
        tryCatch.exception();
    }

    private static void myList() {
        MyList<Integer> list = new MyList<>();
        list.add(12);
        list.add(178);
        list.add(1);
        list.add(15);
        list.add(13);
        list.listed();
        list.isEmpty();
        list.indexOf(13);
        list.lastIndexOf(12);
        list.listed();
        list.size();
        list.getCapacity();
        list.sublist(0,3).listed();
    }

    private static void genericNullable() {
        Integer i = 1;
        String s = "abc";
        Nullable<Integer> integerNullable = new Nullable<>(i);
        Nullable<String> stringNullable = new Nullable<>(s);
        integerNullable.run();
        stringNullable.run();
    }

    private static void nestedInner() {
        NestedAndInner nestedAndInner = new NestedAndInner();
        nestedAndInner.run();
    }
}
