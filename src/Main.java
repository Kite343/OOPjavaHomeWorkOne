package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина");
        Person pavel = new Person("Павел");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        Person olga = new Person("Ольга");
        GeoTree gt = new GeoTree();
        gt.appendSpouse(pavel, irina);
        gt.appendChild(irina, vasya);
        gt.appendChild(irina, masha);
        gt.appendChild(pavel, masha);
        gt.appendChild(vasya, jane);
        gt.appendChild(vasya, ivan);
        gt.appendChild(masha, olga);

        System.out.println("Дети Ирины");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        System.out.println("Супруг Ирины");
        System.out.println(new Reserch(gt).spend(irina,
                Relationship.wife));
                
        System.out.println("Внуки Ирины");
        System.out.println(new Reserch(gt).getGrandchild(irina));
    }

}
