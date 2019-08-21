package com.spring5.lookup;

public interface Command<T> {

    void setState(T commandState);

    T execute();
}
