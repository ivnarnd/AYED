package org.example;

public class CircularQueue <T> extends Queue<T> {
    public T shift(){
        T tmp = this.dequeue();
        this.enqueue(tmp);
        return tmp;
    }
}
