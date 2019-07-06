package week2;

public class Main {
    public static void main(String[] args) {
        MyHashMap newMap = new MyHashMap();
        newMap.put(1,1);
        newMap.put(2,2);
        newMap.get(1);
        newMap.get(3);
        newMap.put(2,1);
        newMap.get(2);
        newMap.remove(2);
        newMap.get(2);
        System.out.println(newMap.get(0));
        System.out.println(newMap);
    }
}
