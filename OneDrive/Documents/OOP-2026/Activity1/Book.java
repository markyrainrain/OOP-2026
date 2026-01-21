package Activity1;

public class Book {
    String title;
    String author;
    String isbn;
    String publicationDate;
    String printBookInfo;

    public Book(String Booktitle,
            String Bookauthor,
            String Bookisbn,
            String BookpublicationDate,
            String BookprintBookInfo) {

        title = Booktitle;
        author = Bookauthor;
        isbn = Bookisbn;
        publicationDate = BookpublicationDate;

    }
    public Book(){}
        public void printBookInfo(){
        System.out.println("Book title: " + title);
        System.out.println("Bookauthor: " + author);
        System.out.println("Book isbn: " + isbn);
        System.out.println("Book publicationDate: " + publicationDate);
        System.out.println();
    }

    
}
  



