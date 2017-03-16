package com.liuhy.c.optional;

import java.util.Optional;

public class UserService {
    private UserDao userDao = new UserDao();

    public void findByNameOldVersion(String username) {
        User user = userDao.findByNameOldVersion(username);

        /*
        * 传统方式的问题就出在这里，如果忘记判断null值的话，很可能出现空指针
        * */
        if (null == user) {
            System.out.println("this user is not exists!");
        } else {
            System.out.println("find user success!");
        }
    }

    public void findByNameNewVersion(String username) {
        /*
        * 这里user可能没有值，要进行空值判断
        * 如果直接调用get()方法，会抛出java.util.NoSuchElementException
        * 这比空指针异常要好的多，因为信息更明确
        * */
        Optional<User> user = userDao.findByNameNewVersion(username);

        if (user.isPresent()) {
            System.out.println(user.get().getUsername());
        } else {
            System.out.println("this user is not exists!");
        }
    }
}
