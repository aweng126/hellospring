package Books;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kingwen on 2017/4/14.
 */
public class SimpleFinderImpl implements BookFinder {
    @Override
    public List findAll() {
        List books = new ArrayList();
        for(int i=0;i<20;i++){
            Book book=new Book();
            book.setAuthor("author"+i);
            book.setName("book"+i);
            books.add(book);
        }
        return books;
    }
}
