import java.awt.print.Book;
import java.util.ArrayList;

class book{
    public String name,author;

    public book(String name, String author){
        this.name = name;
        this.author = author;

//        public String toString{
//            return "Book{"+
//                    "name='"+name + '\'' + ", author='" + author + '\''
//                    + '}';
//        }
    }
}
class mylibrary{
    public ArrayList<book> books;
    public mylibrary(ArrayList<book> books){
        this.books = books;
    }
    public void addBook(Book book){
        System.out.println("You Add book successfully in a library.");
    //    this.books.add(book);
    }
    public void issueBook(Book book, String issue_to){
        System.out.println("Book issue successfully."+issue_to);
      //  this.books.remove(book);
    }
    public void returnBook(Book b){
        System.out.println("The book haas been returned.");
      //  this.books.add(b);
    }
}

public class Librarymanagement {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();
       // Book b1 = new Book("First","Kishan");
    }
}
