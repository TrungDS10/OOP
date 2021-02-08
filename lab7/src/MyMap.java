import java.util.*;
public class MyMap<K extends Object, V extends Object>{
    private Map<K, V>map = new HashMap<>();

    public void put(K key, V value){
        map.put(key, value);
    }

    public V get(K key){
        return map.get(key);
    }

    public void printAllValue() {
        for (K key : map.keySet()) {
            System.out.printf("Key: %s\t-> Value: %s\n", key, map.get(key));
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {


        MyMap mapObject = new MyMap();
        mapObject.put('1', 1);
        mapObject.put('2', 2);
        mapObject.put(2, "KeyInteger");
        mapObject.put("SOME KEY", 9.2328);
        mapObject.printAllValue();


        MyMap<Integer, String> mapGeneric = new MyMap();
        mapGeneric.put(1, "1");
        mapGeneric.put(2, "2");
        try {
            mapGeneric.put(3, "3");
        }
        catch (RuntimeException e) {
            System.out.println("Map putting ERROR at key \"3\"");
        }
        mapGeneric.printAllValue();

    }
}