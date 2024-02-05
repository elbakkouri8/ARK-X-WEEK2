package LibrarySystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public Library(Book book) {
        this.books.add(book);
    }

    public void Add(Book book) {
        this.books.add(book);
    }
    public void Add(ArrayList<Book> books) {
        this.books.addAll(books);
    }
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }


    public ArrayList<Book> getBooks() {
        return books;
    }

    public void discription(){
        for(Book b : this.books)
        System.out.println("Author : " + b.getAuthor() +"  Title : " + b.getTitle() +"  Isbn : " + b.getIsbn()+"  Year : " +b.getYear());
    }

}
