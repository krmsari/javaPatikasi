package Java102;

import Java102.Generic.ListelemeSinifi.MyList;
import Java102.Generic.Nullable;
import Java102.NestedveInnerClasses.NestedAndInner;

public class Main {
    public static void main(String[] args) {
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
