package Main;

import Beans.Sample;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kingwen on 2017/4/14.
 */
public class ClientTest {
    public static void main(String[] args) {
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Sample sample= (Sample) beanFactory.getBean("sample");
        int result =sample.compute(3,4);
        System.out.println(result);
    }
}
