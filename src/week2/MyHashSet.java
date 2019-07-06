package week2;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {

    private List<Integer> values;

    public MyHashSet() {
        this.values = new ArrayList<>();
    }

    public void add(int key) {
        if(!this.values.contains(key)) {
            this.values.add(key);
        }
    }

    public void remove(int key) {
        if(this.values.contains(key)) {
            this.values.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key) {

        return this.values.contains(key);
    }
}
