package com.liuhy.b.lambda_expressions.interfaces;

/*
* 这是自己声明的一个可以函数接口
* 里面只能有一个抽象方法
* */
@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}
