package Java102.CollectionMap.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HSet {

    // HashSet icerisinde aynı degerden bir tane olabiliyor, bir deger 'null' olabilir.
    public void hashSet(){
        // çıkan değerlerin sırası rastgele
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(23);
        hashSet.add(3);
        hashSet.add(31);

        Iterator<Integer> iterator = hashSet.iterator();
        System.out.println("-----HashSet");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer t : hashSet){
            System.out.println(t);
        }
    }
    public void linkedHashSet(){
        // girenler ile çıkanlar aynı sıradadır, bir önceki ve bir sonraki elemanın yerlerini tutar

        LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();
        lhSet.add(2);
        lhSet.add(3);
        lhSet.add(3);
        lhSet.add(5);
        Iterator<Integer> iterator = lhSet.iterator();
        System.out.println("-----Linked");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Integer t : lhSet){
            System.out.println(t);
        }

    }
}
