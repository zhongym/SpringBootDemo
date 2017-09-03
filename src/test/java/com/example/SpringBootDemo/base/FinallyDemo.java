package com.example.SpringBootDemo.base;

/**
 * Created by zhong on 2017/8/26.
 */
public class FinallyDemo {
    public static void main(String[] args) {
        int i = getI();
        System.out.println(i);
    }

    private static int getI() {
        int i = 0;
        try {
            i = 1;
            i = 1 / 0;
        } catch (Exception e) {
            i = 2;
        } finally {
            i = 3;
        }
        i = 4;
        return i;
    }
}
