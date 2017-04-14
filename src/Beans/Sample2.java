package Beans;

/**
 * Created by kingwen on 2017/4/14.
 * 面向接口编程，
 */
public class Sample2 implements Compute {
    @Override
    public int compute(int i, int j) {
        return i*j;
    }
}
