package com.liuhy.a.default_methods_for_interfaces;

public interface Formula {
    double calculate(int a);

    /*
    * 可以在接口中定义default方法
    * */
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
