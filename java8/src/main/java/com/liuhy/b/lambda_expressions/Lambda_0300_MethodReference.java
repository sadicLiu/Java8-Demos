package com.liuhy.b.lambda_expressions;

import com.liuhy.b.lambda_expressions.interfaces.Converter;

/**
 * 方法的引用（::）
 *
 * 首先明确一点：当我们定义FunctionalInterface时，这个接口中只有一个方法
 * 当在函数中使用这个接口时，我们可以用Lambda表达式的形式实现这个唯一的方法
 *
 * 方法引用允许你把一个已有的方法的指针直接赋值给这个唯一方法
 */
public class Lambda_0300_MethodReference {

    public static void main(String[] args) {
        // 把Integer.valueOf()方法的指针赋给convert方法
        Converter<String, Integer> converter = Integer::valueOf;
        Integer result = converter.convert("123");
        System.out.println(result);
    }

}
