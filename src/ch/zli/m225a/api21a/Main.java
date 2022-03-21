package ch.zli.m225a.api21a;

public class Main {

    public static void main(String[] args){

        Cat mogli = new Cat("tiger","Mogli");

        mogli.eat();
        mogli.sleep();

        System.out.println(mogli.getName());
        System.out.println(args[0]);
    }
}
