package ManAndCloset;

import java.util.ArrayList;

public class Closet {
    
    private Status doorSt;
    private Status lockSt;

    private ArrayList<String> things;

    //private ArrayList<Key> keys; //должен ли шкаф знать о созданных для него ключах? наверное нет...

    public Closet(){
        this.doorSt = Status.close;
        this.lockSt = Status.close;
        this.things = new ArrayList<String>();
        // this.keys = new ArrayList<>();
    }

    // public void addKey(Key key){
    //     keys.add(key);
    // }



    public Status getDoorStatus(){
        return doorSt;
    }

    public Status getLockStatus(){
        return lockSt;
    }

    public ArrayList<String> getThings(){
        return things;
    }

    @Override
    public String toString() {
        return "Шкаф " + doorSt.toString();
    }

    
    // оставить только функции для получения значений полей класса и для внесения измененияй, а все действия вынести в одтельный класс??? наверное, так будет удобней
    // Если хранить список ключей у шкафа или у человека, то не надо будет передавать ключ
    public void actionLockStatus(Status status, Person pers, Key key){
        if(status == lockSt){
            return;
        }
        else if (key.getPerson() == pers){
            this.lockSt = status;
        }
        else{
            System.out.println("нужен ключ");
        }
    }

    public void actionDoorStatus(Status status) {
        if(status == Status.close){
            this.doorSt = Status.close;
        }
        else if(doorSt == Status.close){
            if(lockSt == Status.close){
                System.out.println("нужен ключ");
            }
            else{this.doorSt = Status.open;}
        }
    }

    public void putThing(String thing){
        if(lockSt == Status.open){
            if(doorSt == Status.open){
                this.things.add(thing);
                System.out.println("Теперь вещь лежит в шкафу");
            }
            else{
                System.out.println("Дверь шкафа закрыта");
            }
        }
        else{
            System.out.println("Шкаф закрыт на замок");
        }
    }

    public void takeThing(String thing){
        if(lockSt == Status.open){
            if(doorSt == Status.open){
                if(things.contains(thing)){
                    things.remove(thing);
                    System.out.println("Вещь взята из шкафа");
                }
                else{
                    System.out.println("Такой вещи нет в шкафу");
                }
            }
            else{
                System.out.println("Дверь шкафа закрыта");
            }
        }
        else{
            System.out.println("Шкаф закрыт на замок");
        }
    }


    /*  Идея была в том, чтобы в main в if передать метод и если вещь получится
     положить, то в коде блока if убрать эту вещь у человека, если нет, то вещь останется у человека

     и противоположное действие, если нужная вещь есть в шкафу, то её взять, вернуть true - вещь взята,
      и в блоке кода if дать эту вещь человеку. Но при попытке реализации этого в main, просит static
    */
    // public boolean putThing(String thing){
    //     if(lockSt == Status.open){
    //         if(doorSt == Status.open){
    //             this.things.add(thing);
    //             return true;
    //         }
    //         else{
    //             System.out.println("Сначало откройте дверь");
    //             return false;
    //         }
    //     }
    //     else{
    //         System.out.println("Сначало откройте замок");
    //         return false;
    //     }
    // }

    // надо переписать, не учтена возможность закрытой двери
    // public boolean takeThing(String thing){
    //     if(things.contains(thing)){
    //         things.remove(thing);
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }

}
