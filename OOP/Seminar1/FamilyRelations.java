package Java.Seminars.Seminar1;

import java.util.*;

public class FamilyRelations {
    protected Map<Human, Human> relation;
    protected Human son;
    protected Human daughter;
    protected Human mather;

    public FamilyRelations(Human son, Human mather) {
        this.son = son;
        this.mather = mather;
        this.relation = new HashMap<>();
        this.relation.put(son, mather);
    }

    public FamilyRelations() {
        this.son = null;
        this.mather = null;
    }

    public Set<Human> getAllsons(Human mather) {
        return getKeys(this.relation, mather);
    }

    public void addRelation(Human son, Human mather) {
        this.relation.put(son, mather);
    }


    public static <K, V> Set<K> getKeys(Map<K, V> map, V value) {
        Set<K> keys = new HashSet<>();
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                keys.add(key);
            }
        }
        return keys;
    }
}
