package org.example;

public class DoubleEndedQueue <T> extends Queue<T> {
    public void enqueueFirst(T t) {
        this.data.add(0, t);
    }
}
