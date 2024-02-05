package LibrarySystem;

public class FictionBook extends Book{

    public FictionBook(String title, String author, String isbn, int year) {
        super(title, author, isbn, year);
    }

    @Override
    public void description(){
        System.out.println(" "+ this.getAuthor() +" "+ this.getTitle() +" "+ this.getYear() );
    }

}
