package LibrarySystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Livre 1", "Auteur 1", "ISBN1",2020));
        books.add(new Book("Livre 2", "Auteur 2", "ISBN2",2021));
        books.add(new Book("Livre 3", "Auteur 3", "ISBN3",2022));
        books.add(new Book("Livre 4", "Auteur 4", "ISBN4",2023));
        books.add(new Book("Livre 5", "Auteur 5", "ISBN5",2024));

        FictionBook FB1 =new FictionBook("Fiction Book 1", "Auteur A", "ISBN1",2000);
        FictionBook FB2 =new FictionBook("Fiction Book 2", "Auteur B", "ISBN2",2001);
        FictionBook FB3 =new FictionBook("Fiction Book 3", "Auteur C", "ISBN3",2002);

        FB1.description();
        FictionBook NFB1 =new FictionBook("NON Fiction Book 1", "Auteur X", "ISBN1",2010);
        FictionBook NFB2 =new FictionBook("NON Fiction Book 2", "Auteur Y", "ISBN2",2011);
        FictionBook NFB3 =new FictionBook("NON Fiction Book 3", "Auteur Z", "ISBN3",2012);

        Library lib=new Library(books);
        lib.Add(FB1);
        lib.Add(FB2);
        lib.Add(FB3);
        lib.Add(NFB1);
        lib.Add(NFB2);
        lib.Add(NFB3);


        //lib.discription();
    }
}
