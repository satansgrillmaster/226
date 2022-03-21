package ch.zli.m225a.api21a;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CatTest {

    /*
    * given
    * when
    * then
    */

    @Test
    void short_constructor(){
        Cat cat = new Cat("black");
        assertEquals("black", cat.getColor());
        assertEquals("", cat.getName());
        assertEquals(Cat.CatState.hungry, cat.getState());

    }

    @Test
    void long_constructor(){
        Cat cat = new Cat("black", "Mogli");
        assertEquals("black", cat.getColor());
        assertEquals("Mogli", cat.getName());
        assertEquals(Cat.CatState.hungry, cat.getState());

    }

    @Test
    void set_name(){
        Cat cat = new Cat("black");
        cat.setName("Mogli");
        assertEquals("Mogli", cat.getName());
    }

    @Test
    void cat_sleep(){
        Cat cat = new Cat("black");
        cat.eat();
        cat.sleep();
        cat.play();
        assertEquals(Cat.CatState.hungry, cat.getState());
    }
}
