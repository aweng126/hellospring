package Books;

import java.util.Iterator;
import java.util.List;

/**
 * Created by kingwen on 2017/4/14.
 */
public class BookListenerImpl implements BookListener{
    BookFinder bookFinder;

    public void setBookFinder(BookFinder bookFinder) {
        this.bookFinder = bookFinder;
    }

    public BookListenerImpl() {
//        bookFinder=new SimpleFinderImpl();
    }

    @Override
    public Book[] findBooks(String name) {
        List books = bookFinder.findAll();
        for (Iterator iter = books.iterator(); iter.hasNext();) {
            Book book = (Book) iter.next();
            if(!book.getName().equals(name)){
                iter.remove();
            }
        }
        return (Book[])books.toArray(new Book[books.size()]);
    }
}
