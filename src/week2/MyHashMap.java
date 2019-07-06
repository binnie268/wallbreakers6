package week2;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    private List<Integer> keys;
    private List<Integer> values;

    public MyHashMap() {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
    }

    public void put(int key, int value) {
        if(this.keys.contains(key)) {
            this.values.set(this.keys.indexOf(key), value);
        } else {
            this.keys.add(key);
            this.values.add(value);
        }
    }

    public int get(int key) {
        if(!this.keys.contains(key)) {
            return -1;
        } else {
            return this.values.get(this.keys.indexOf(key));
        }
    }

    public void remove(int key) {
        if(this.keys.contains(key)) {
            this.values.remove(this.keys.indexOf(key));
            this.keys.remove(Integer.valueOf(key));
        }
    }


}
