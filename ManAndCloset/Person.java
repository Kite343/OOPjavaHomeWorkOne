package ManAndCloset;

import java.util.ArrayList;

public class Person {
    private String name;
    // Создать карман с ключами?
    private ArrayList<String> things;

    Person(String name){
        this.name = name;
        this.things = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    // человек берет себе вещь
    public void putThing(String thing){
        things.add(thing);
    }
    // человек отдает, кладет вещь куда-то
    public void takeThing(String thing){
        things.remove(thing);
    }

    public ArrayList<String> getThings(){
        return things;
    }

    
}
