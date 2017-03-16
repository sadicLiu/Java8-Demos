package com.liuhy.b.lambda_expressions;

import com.liuhy.b.lambda_expressions.interfaces.PersonFactory;

/**
 * 类的构造方法同样存在方法指针，也可以赋值给其他方法
 */
public class Lambda_0400_ConstructorReference {

    public static void main(String[] args) {
        PersonFactory<Person> factory = Person::new;
        Person person = factory.create("zhangsan", "123");
        System.out.println(person);
    }

}
