package ManAndCloset;

public class Key {
    private Person hasKeyPers;
    private Closet hasKeyCloset;

    Key(Closet closet){
        this.hasKeyCloset = closet;
    }

    public void setKey(Person name) {
        this.hasKeyPers = name;
    }

    public Person getPerson() {
        return hasKeyPers;
    }

    public Closet getCloset() {
        return hasKeyCloset;
    }
}
