
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;
import java.util.Currency;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = library.getChildrensBooks();

    String authorToFind = "L. Frank Baum";


    System.out.println("Books by " + authorToFind + ":");
    for (Book currentBook: childrensBooks) {
        if (currentBook.getAuthor().equals(authorToFind)) {
            System.out.println(currentBook.getTitle());
        }
    }


    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    int i = 0;
    while (i < childrensBooks.size()) {
        Book currentBook = childrensBooks.get(i);
        if (currentBook.getTitle().equals(bookToFind)) {
            minimumRating = currentBook.getRating();
        }
        i++;
    }

    System.out.println("The rating of Sky Island is " + minimumRating);

    System.out.println("Books with the same rating as" + bookToFind + ":");
    for (Book currentBook: childrensBooks) {
        if (currentBook.getRating() >= minimumRating) {
            System.out.println(currentBook.getTitle() + " by " + currentBook.getAuthor());
        }
    }


  }
}