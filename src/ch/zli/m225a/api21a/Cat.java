package ch.zli.m225a.api21a;

/** Javadoc comment */

public class Cat {

    protected enum CatState {hungry, playful, sleepy}

    private final String color;
    private String name;
    private CatState state;

    // short cunstructor
    public Cat(String color){
        this(color,"");
    }

    // long constructor
    public Cat(String color, String name){
        this.color = color;
        this.name = name;
        state = CatState.hungry;
    }

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public CatState getState() {
        return state;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void sleep(){
        if (state == CatState.sleepy){
            state = CatState.playful;
        }
    }

    public void play(){
        if (state == CatState.playful){
            state = CatState.hungry;
        }
    }

    public void eat(){
        if (state == CatState.hungry){
            state = CatState.sleepy;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", state=" + state +
                '}';
    }
}
