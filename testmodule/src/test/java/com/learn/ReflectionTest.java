package com.learn;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ReflectionTest {

    @Test
    public void testPrivateMethod(){
        MyLib test = new MyLib();
        int x = 5;
        int y=3;

        long testValue = callPrivateMethod(test, "product", 5);

        assertTrue(testValue == 10);
    }

    @Test
    public void testPrivateMethodWithMockito(){
        MyLib test = mock(MyLib.class);
        int n=5;
        when(test.sum(anyInt())).thenReturn(3l);
        when(test.combine(n)).thenCallRealMethod();

        long valueToTest = test.combine(5);

        assertTrue(valueToTest == 13);
    }

    public Long callPrivateMethod(Object obj, String methodName, Object... params){
        try {

            Method m = obj.getClass().getDeclaredMethod(methodName, new Class[]{int.class});
            m.setAccessible(true);
            return (long)m.invoke(obj, params);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
