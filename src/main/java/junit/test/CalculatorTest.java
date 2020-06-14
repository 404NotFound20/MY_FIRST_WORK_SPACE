package junit.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    //初始化方法，申请测试资源，在所以测试方法之前执行
    @Before
    public void init(){
        System.out.println("测试开始");
    }
    //释放资源
    @After
    public void close(){
        System.out.println("测试结束");
    }

    //新建测试类
    @Test
    public void testAdd(){
        Calculator c=new Calculator();
        Assert.assertEquals(4,c.add(1,3));
    }
}
