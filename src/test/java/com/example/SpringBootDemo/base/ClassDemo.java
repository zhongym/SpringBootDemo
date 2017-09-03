package com.example.SpringBootDemo.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by zhong on 2017/8/20.
 */
interface A{
    void out();
}
class B implements A{

    @Override
    public void out() {
        System.out.println(this);
    }
}
public class ClassDemo {
    public static void main(String[] args) throws Exception {
        B b = new B();
        A a = A.class.cast(b);
        a.out();

        try (AutoCloseable fileInputStream = new FileInputStream("")) {

        }

        boolean instance = A.class.isInstance(b);
        System.out.println(instance);
        instance = B.class.isInstance(b);
        System.out.println(instance);
        boolean b1 = b instanceof B;
        System.out.println(b1);
        b1= b instanceof A;
        System.out.println(b1);

        boolean assignableFrom = A.class.isAssignableFrom(B.class);
        System.out.println(assignableFrom);

        assignableFrom = B.class.isAssignableFrom(A.class);
        System.out.println(assignableFrom);
    }
}
