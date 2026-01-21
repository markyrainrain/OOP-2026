package Activity1;

public class Main{
    public static void main(String[] args) {
        
        Book book1 = new Book();
        book1.title = ("Romeo and Juliet");
        book1.author = ("William Shakespeare");
        book1.isbn = ("9781451621709");
        book1.publicationDate = ("1597");

        Book book2 = new Book();
        book2.title = ("The Hobbit");
        book2.author = ("J.R.R. Tolkien");
        book2.isbn = ("978-0547928227");
        book2.publicationDate = ("September 21, 1937");
        
        book1.printBookInfo();
        book2.printBookInfo();
        
    }
}
   
