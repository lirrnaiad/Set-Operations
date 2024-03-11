import java.util.HashSet;

public class SetBuilder {
    private HashSet<String> set;

    public SetBuilder() {
        this.set = new HashSet<>();
    }

    public HashSet<String> getSet() {
        return this.set;
    }

    public void populateSet(String elements) {
        String[] setElements = elements.split(" ");
        for(String element: setElements) {
            set.add(element);
        }
    }

    public HashSet<String> union(SetBuilder secondSet) {
        HashSet<String> setUnion = new HashSet<>(set);
        setUnion.addAll(secondSet.getSet());
        return setUnion;
    }

    public HashSet<String> intersection(SetBuilder secondSet) {
        HashSet<String> setIntersection = new HashSet<>(set);
        setIntersection.retainAll(secondSet.getSet());
        return setIntersection;
    }
}
