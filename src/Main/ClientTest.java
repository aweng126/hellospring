package Main;

import Beans.Sample;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kingwen on 2017/4/14.
 * 面向实现编程测试
 */
public class ClientTest {
    public static void main(String[] args) {
        //获得beanFactory
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //取出sample对象
        Sample sample= (Sample) beanFactory.getBean("sample");
        //调用对应对象的方法
        int result =sample.compute(3,4);
       /* System.out.println(result);*/
    }
}
