package Java102;

import Java102.Generic.ListelemeSinifi.MyList;
import Java102.Generic.Nullable;
import Java102.NestedveInnerClasses.NestedAndInner;

public class Main {
    public static void main(String[] args) {


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
