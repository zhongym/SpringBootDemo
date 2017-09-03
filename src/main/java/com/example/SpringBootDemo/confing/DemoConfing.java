package com.example.SpringBootDemo.confing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhong on 2017/9/4.
 */
@Configuration
public class DemoConfing {
    public class A {
        {
            System.out.println("A()");
        }
    }

    public class B {
        A a;

        public void setA(A a) {
            this.a = a;
        }
    }

    public class C {
        A a;

        public void setA(A a) {
            this.a = a;
        }
    }

    @Bean
    public A a(){
        System.out.println("---->a()");
        return new A();
    }

    @Bean
    public B b(){
        B b = new B();
        b.setA(a());
        return b;
    }
    public C c(){
        C c = new C();
        c.setA(a());
        return c;
    }
}
