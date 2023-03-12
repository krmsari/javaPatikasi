package Java102.CollectionMap.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayL {

    public void array(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(26);
        arrayList.add(21);
        arrayList.add(23);
        arrayList.add(22);
        arrayList.add(null);
        Iterator<Integer> itr = arrayList.iterator();
        arrayList.contains(33); // false döner çünkü listenin içerisinde 33 yok
        
    }
}
