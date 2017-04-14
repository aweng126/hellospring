## 课程实验原因，初步学习spring框架。

1. 导入jar包的时候将spring目录下的spring***.jar**全部导入。
2. 需要另外导入**commons-logging-1.1.1.jar** 
   否则会报错 java.lang.ClassNotFoundException: org.apache.commons.logging.LogFactory
3. 面向接口编程 
   创建接口，降低耦合度，
   创建类实现对应的接口，实现方法
   在ApplicationContext.xml中进行配置，可以改变对应的bean的获取而我们的主体的文件不需要改动。
 
4. 一个层次的实现代码，不应该依赖于另外一个层次的实现代码
   我们一般说在java代码中决定具体使用哪个对象，但是这样就意味在自己的代码是要不断改动的，
   所以spring的意义在于将所有的这种配置信息，依赖信息放到我们的配置文件也就是xml文件，
   
5. sping是什么
   spring 是一个javabean的容器，放置一系列的javabean实例，通过spring提供的依赖注入的方式来进行管理之间的引用关系。
   依赖注入方式有
   构造方法注入，构造方法传入对应的需要依赖的实例，而这个实例在spring的配置文件中进行管理。
   ```
    <bean id="japanese" class="com.spring.service.impl.Japanese">  
        <!-- 使用构造注入 ，为Japanese实例注入SteelAxe实例-->  
        <constructor-arg ref="stoneAxe"/>  
    </bean>
   ```
设值方法注入，通过类的setter方法和spring配置文件中对应javabean对象的property属性来进行管理。
```
    <bean id="chinese" class="com.spring.service.impl.Chinese">  
        <!-- 将StoneAxe注入给axe属性 -->  
        <property name="axe" ref="stoneAxe" />  
        <property name="name" value="孙悟空"/>  
    </bean>  
   ```
关于依赖注入方法一个比较好的博客[Spring读书笔记-----Spring核心机制：依赖注入](http://blog.csdn.net/chenssy/article/details/8171427) 