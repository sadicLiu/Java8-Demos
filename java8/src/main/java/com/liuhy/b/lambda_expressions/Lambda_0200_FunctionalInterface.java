package com.liuhy.b.lambda_expressions;

import com.liuhy.b.lambda_expressions.interfaces.Converter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Functional Interfaces
 */
public class Lambda_0200_FunctionalInterface {

    /*
    * @FunctionalInterface
    * public interface Comparator<T>
    *
    * 上面是Comparator接口的声明，这也是Lambda实现的机制
    *
    * */
    public static void compare(List list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
    }

    public static void main(String[] args) {
        /*
        * 使用自己定义的函数接口
        * */
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer result = converter.convert("123");
        System.out.println(result);
    }
}
