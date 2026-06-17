package by.class7;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0,"1ый");
        map.put(1,"второй");
        map.put(2,"третий");
        map.put(3,"4ый");
        map.put(4,"5ый");
        map.put(5,"6ой");
        map.put(6,"7ой");
        map.put(7,"8ой");
        map.put(8,"9ый");
        map.put(9,"10ый");

        List<String> newList = new ArrayList<>();
        for (Map.Entry<Integer,String> thing : map.entrySet()){
            if (thing.getKey() > 5){
                newList.add(thing.getValue());
            }
        }
        int key = 1;
        Set<Integer> keyList= map.keySet();
        for(Integer e :keyList ) {
            String value = map.get(e);
            if(value.length() > 5){
                key = key * e;
            }
        }
        System.out.println("перемножили: " + key);


    }
}
