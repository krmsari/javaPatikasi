package Java102.BookWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("kerem",3,"adsda",1244);
        Book book2 = new Book("abdulselam",73,"sadsda",1244);
        Book book3 = new Book("nisa",31,"ladsda",1244);
        Book book4 = new Book("şevval",5,"cadsda",1244);
        Set<Book> books = new TreeSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for (Book l:books) {
            System.out.println(l.getName());
        }


        //!!alphabetical order
        Set<Book> sortingNum = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getNumPage() - o2.getNumPage();
            }
        });
        sortingNum.addAll(books);
        for (Book l : sortingNum){
            System.out.println(l.getNumPage());
        }
    }
}
