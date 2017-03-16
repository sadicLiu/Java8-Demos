package com.liuhy.b.lambda_expressions;

import com.liuhy.b.lambda_expressions.interfaces.Converter;

/**
 * 普通方法同样可以使用方法指针
 */
public class Lambda_0301_MethodReference_General {

    public static void main(String[] args) {
        Person person = new Person();
        Converter<String, String> converter = person::sayHi;

        System.out.println(converter.convert("zhangsan"));

    }

}
