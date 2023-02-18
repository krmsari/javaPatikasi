package Java102.Generic.ListelemeSinifi;

import java.util.List;

public interface IList<T> {
    public void add(T value);
    public int size();
    public int getCapacity();
    public void delete(T value);
    public void set(int index, T value);
    public T get(int index);
    public void remove(int index);
    public void listed();
    public int indexOf(T data);
    public int lastIndexOf(T data);
    public boolean isEmpty();
    public T[] toArray();
    public void clear();
    public MyList<T> sublist(int start,int finish);
    public boolean contains(T data);
}
