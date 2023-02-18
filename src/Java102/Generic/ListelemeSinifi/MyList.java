package Java102.Generic.ListelemeSinifi;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> implements IList<T> {

    private final int size = 10;
    private static int stable;
    private final T[] myList = (T[]) new Object[size];

    public MyList() {
        stable = 0;
    }

    public MyList(int capacity) {
        stable = capacity;
    }

    @Override
    public void add(T value) {
        myList[stable] = value;
        stable++;
        System.out.println(value + " listene eklendi.");
    }

    @Override
    public int size() {
        int interim = 0;
        for (T t : myList) {
            if (t != null) {
                interim++;
            }
        }
        System.out.println("Dizinin eleman sayısı: " + interim);
        return interim;
    }

    @Override
    public int getCapacity() {
        System.out.println("Dizinin kapasitesi: " + myList.length);
        return myList.length;
    }

    @Override
    public void delete(T value) {
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] == value) {
                myList[i] = null;
            }
            for (int j = i + 1; j < myList.length; j++) {
                if (myList[i] == null) {
                    myList[i] = myList[j];
                    myList[j] = null;
                }
            }
        }
        System.out.println(value + " değeri listenden kaldırıldı.");

    }

    @Override
    public void set(int index, T value) {
        myList[index] = value;
    }

    @Override
    public T get(int index) {
        System.out.println(index + ". değerin: " + myList[index]);
        return myList[index];
    }

    @Override
    public void remove(int index) {
        for (int i = 0; i < myList.length; i++) {
            if (i == index) {
                myList[i] = null;
            }
            for (int j = i + 1; j < myList.length; j++) {
                if (myList[i] == null) {
                    myList[i] = myList[j];
                    myList[j] = null;
                }
            }
        }
        System.out.println(index + ". değerin kaldırıldı.");
    }

    @Override
    public void listed() {
        for (T t : myList) {
            if (t != null) {
                System.out.print(t + ", ");
            }
        }
        System.out.println("\n Listen getirildi.");
    }

    @Override
    public int indexOf(T data) {
        int result = -1;
        for (int i = 0; i < myList.length; i++) {
            if (data == myList[i]) {
                result = i;
            }
        }
        if (result == -1){
            System.out.println(data + " değeri listede yok ! ");
        }else {
            System.out.println(data + " değerin baştan indeksi: " + result);
        }
        return result;
    }

    @Override
    public int lastIndexOf(T data) {
        int result = -1;
        for (int i = myList.length-1; 0 <= i; i--) {
            if (data == myList[i]) {
                result = i;
            }
        }
        if (result == -1){
            System.out.println(data + " değeri listede yok ! ");
        }else {
            System.out.println(data + " değeri sondan indeksi: " + result);
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        for (T t : myList) {
            if (t != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T[] toArray() {
        int size = size();
        T[] newArray = (T[]) new Object[size];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] != null) {
                newArray[i] = myList[i];
            }
        }
        return newArray;
    }

    @Override
    public void clear() {
        for (int i = 0; i < myList.length; i++) {
            myList[i] = null;
        }
        System.out.println("\n Liste temizlendi...");
    }

    @Override
    public MyList<T> sublist(int start, int finish) {
        MyList<T> newList = new MyList<>();
        for (int i=start;i<=finish;i++){
            newList.add(myList[i]);
        }
        System.out.println("Yeni liste oluşturuldu...");
        return newList;
    }

    @Override
    public boolean contains(T data) {
        for (T t : myList) {
            if (t == data) {
                return true;
            }
        }
        return false;
    }

}
