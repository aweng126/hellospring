package Main;

import Beans.Compute;
import com.sun.org.apache.xpath.internal.SourceTree;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kingwen on 2017/4/14.
 * 面向接口编程测试
 */
public class ClientImpTest {
    public static void main(String[] args) {
        //获得beanFactory
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //取出sample对象
        Compute compute= (Compute) beanFactory.getBean("compute");
        //调用对应对象的方法
        int result1 =compute.compute(3,4);
        System.out.println(result1);
    }
}
