package ch.zli.m225a.api21a;

import java.util.ArrayList;
import java.util.List;

public class QueueList<T> {

    public static class QueueEmptyException extends RuntimeException{}
    public static class QueueFullException extends RuntimeException{}

    private int capacity;
    private ArrayList<T> elements;

    public QueueList(Integer capacity){
        this.capacity = capacity;
        elements = new ArrayList<>();
    }

    public void push(T element){
        if (elements.size() == capacity){
            throw new QueueFullException();
        }
        elements.add(element);
    }

    public T pop(){
        if (elements.size() == 0){
            throw new QueueEmptyException();
        }
        return elements.remove(elements.size() -1);
    }

    public int getCapacity(){return capacity;}

    public int getListSize(){
        return elements.size();
    }

}
