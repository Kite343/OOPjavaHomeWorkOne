package ManAndCloset;

public class Main {
    public static void main(String[] args) {
        Closet closetOne = new Closet();
        Key keyOne = new Key(closetOne);
        Person vasya = new Person("Вася");

        vasya.putThing("шапка");
        vasya.putThing("футболка");
        vasya.putThing("джинсы");
        vasya.putThing("куртка");
        vasya.putThing("носки");

        System.out.println("Это " + vasya.getName() +
        "\nУ него есть: " + String.join(", ", vasya.getThings()));

        System.out.println(vasya.getName() + " решил положить " + vasya.getThings().get(0) + " в шкаф");
        closetOne.putThing(vasya.getThings().get(0));
        System.out.println(vasya.getName() + " открывает шкаф");
        closetOne.actionDoorStatus(Status.open);
        System.out.println(vasya.getName() + " берет ключ ");
        keyOne.setKey(vasya);
        System.out.println(vasya.getName() + " открывает шкаф");
        closetOne.actionLockStatus(Status.open, vasya, keyOne);
        closetOne.actionDoorStatus(Status.open);
        System.out.println(closetOne.toString());
        System.out.println(vasya.getName() + " кладёт " + vasya.getThings().get(0) + " в шкаф");
        closetOne.putThing(vasya.getThings().get(0));
        vasya.takeThing(vasya.getThings().get(0));
        System.out.println("теперь у  " + vasya.getName() +
        " есть: \n" + String.join(", ", vasya.getThings()));
        System.out.println("А в шкафу есть: " + String.join(", ", closetOne.getThings()));


        
    }

}

