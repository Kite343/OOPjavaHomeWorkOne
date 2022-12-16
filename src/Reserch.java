package src;
import java.util.ArrayList;

public class Reserch {
    // ArrayList<String> result = new ArrayList<>();
    ArrayList<Node> tree;
    
    

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<String> spend(Person p, Relationship re) {
        ArrayList<String> result = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                result.add(t.p2.fullName);
            }
        }
        return result;
    }

    public ArrayList<Person> getPers(Person p, Relationship re) {
        ArrayList<Person> resPers = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == re) {
                resPers.add(t.p2);
            }
        }
        return resPers;
    }

    public ArrayList<String> getGrandchild(Person p) {
        ArrayList<String> grandchild = new ArrayList<>();
        for (Node t : tree) {
            if (t.p1.fullName == p.fullName && t.re == Relationship.parent) {
                grandchild.addAll(spend(t.p2, Relationship.parent));
            }
        }        
        return grandchild;
    }
    
}
