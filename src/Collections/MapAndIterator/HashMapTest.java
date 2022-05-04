package Collections.MapAndIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Double> hashMap = new HashMap<>();
        String str;
        double balance;

        hashMap.put("Джон", 4323.43);
        hashMap.put("Стивен", -133.0);
        hashMap.put("Ник",10343.4);
        hashMap.put("Кэсси", 24.5);
        hashMap.put("Натали", 548.96);

        Set<String> keySet = hashMap.keySet();

/*        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            str = iterator.next();
            System.out.println(str + ":" + hashMap.get(str));
        }*/
        //вариант с итератором

        for (String s : keySet) {
            str = s;
            System.out.println(str + ":" + hashMap.get(str));
        }

        balance = hashMap.get("Ник");
        hashMap.put("Ник", balance + 1000);
        System.out.println("\nНовый остаток на балансе Ника: " + hashMap.get("Ник"));
    }
}
