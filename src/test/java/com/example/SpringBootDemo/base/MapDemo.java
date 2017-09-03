package com.example.SpringBootDemo.base;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

/**
 * Created by zhong on 2017/8/30.
 */
public class MapDemo {

    private static final Map<String, IntBinaryOperator> map = new HashMap<>();

    static {
        map.put("+", (i, j) -> i + j);
        map.put("-", (i, j) -> i - j);
        map.put("*", (i, j) -> i * j);
        map.put("/", (i, j) -> i / j);
    }

    public static void main(String[] args) {
        MapDemo demo = new MapDemo();
        System.out.println(demo.oper(1, 2, "+"));
        System.out.println(demo.oper(1, 2, "-"));
        System.out.println(demo.oper(1, 2, "*"));
        System.out.println(demo.oper(1, 2, "/"));
    }

    public int oper(int i, int j, String op) {
        return map.get(op).applyAsInt(i, j);
    }
}
