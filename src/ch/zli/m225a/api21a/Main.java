package ch.zli.m225a.api21a;

public class Main {

    public static void main(String[] args){

        Cat mogli = new Cat("tiger","Mogli");
        QueueList<String> queueList = new QueueList<>(2);

        queueList.push("eis");
        queueList.push("zwei");
        try{
            queueList.push("drei");
        }
        catch (QueueList.QueueFullException e){
            System.out.println("Queue is full");
        }

        System.out.println(queueList.pop());
        System.out.println(queueList.pop());

        try{
            System.out.println(queueList.pop());
        }
        catch (QueueList.QueueEmptyException e){
            System.out.println("Queue is empty");
        }

    }
}
