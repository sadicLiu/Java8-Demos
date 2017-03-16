package com.liuhy.b.lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lambda表达式用在替换匿名内部类上
 */
public class Lambda_0100_SortExample {

    static List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

    /*
    * 旧版本的sort方法
    * 需要以匿名内部类的方式创建一个Comparator
    * */
    public static void oldVersionSort(List list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
    }

    /*
    * 使用Lambda表达式
    * */
    public static void newVersionSort(List list) {
        // 版本1
        Collections.sort(list, (String a, String b) -> {
            return b.compareTo(a);
        });

        // 版本2
        Collections.sort(list, (String a, String b) -> b.compareTo(a));

        // 版本3
        Collections.sort(list, Comparator.reverseOrder());

    }

    public static void main(String[] args) {
        System.out.println(names);

        // oldVersionSort(names);
        // newVersionSort(names);

        /*
        * List now has a sort method.
        * */
        names.sort((a, b) -> b.compareTo(a));

        System.out.println(names);
    }
}
