package Books;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.List;

/**
 * Created by kingwen on 2017/4/14.
 */
public class BookTest  {
    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookListener bl = (BookListener) beanFactory.getBean("booklistener");
        Book[] books = bl.findBooks("book3");
        if(books != null){
            for(int i=0; i<books.length; i++){
                System.out.println("书《"+books[i].getName()+"》的作者是："+books[i].getAuthor());
            }
        }

    }
}
