package ch.zli.m225a.api21a;

import java.util.List;

public class Queue<T> {

    private int capacity;
    private List<T> elements;

    public Queue(Integer capacity){
        this.capacity = capacity;
    }

    public void add(T element){};
    public int getCapacity(){return capacity;};

}
