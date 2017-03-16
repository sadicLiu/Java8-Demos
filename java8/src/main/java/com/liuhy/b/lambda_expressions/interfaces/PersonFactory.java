package com.liuhy.b.lambda_expressions.interfaces;

import com.liuhy.b.lambda_expressions.Person;

public interface PersonFactory<P extends Person> {
    P create(String username, String password);
}
