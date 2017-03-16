package com.liuhy.c.optional;

import java.util.Optional;

public class UserDao {


    public User findByNameOldVersion(String username) {
        /*
        * 如果用户存在，返回此用户（模拟）
        * 如果用户不存在，返回null
        * */
        if (username.equals("zhangsan")) {
            return new User();
        } else {
            return null;
        }
    }

    /*
    * 利用JDK8提供的Optional接口，我们可以返回一个此类型的对象
    * 这样做的好处是给调用方一个明确的提示，我返回的结果可能为空（此用户不存在）
    *
    * Optional类中存在很多静态方法：
    *   of:         创建一个非空的Optional,如果传入空值会抛异常
    *   empty：     创建一个空的Optional
    *   ofNullable：创建一个Optional，如果指定的值为null，则返回一个空的Optional
    *               这个方法主要是用在调用过去的代码，因为这类代码可能返回null
    * */
    public Optional<User> findByNameNewVersion(String username) {
        if (username.equals("zhangsan")) {
            // Optional.of(null);   抛异常
            return Optional.of(new User());
        } else {
            return Optional.empty();
        }
    }
}
