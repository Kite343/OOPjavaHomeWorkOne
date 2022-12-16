package src;
import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void appendChild(Person parent, Person children) {
        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }

    public void appendSpouse(Person husband, Person wife) {
        tree.add(new Node(husband, Relationship.husband, wife));
        tree.add(new Node(wife, Relationship.wife, husband));
    }

}
