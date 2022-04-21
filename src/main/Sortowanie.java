package main;

import java.util.*;

public class Sortowanie {
    public static void main(String[] args) {
//        HashSet<String> slowa = new HashSet<>();
//        slowa.add("Jeden");
//        slowa.add("Dwa");
//        slowa.add("Trzy");
//        slowa.add("Cztery");
//        System.out.println("Slowa HashSet: " + slowa);
//
//        TreeSet<String> slowa2 = new TreeSet<>();
//        slowa2.add("Jeden");
//        slowa2.add("Dwa");
//        slowa2.add("Trzy");
//        slowa2.add("Cztery");
//        System.out.println("Slowa TreeSet: " + slowa2);
//    }

        Map<String, String> slowa = new HashMap<>();
        slowa.put("one", "jeden");
        slowa.put("two", "dwa");
        slowa.put("three", "trzy");
        slowa.put("four", "cztery");
        slowa.put("five", "piec");

        for (Map.Entry<String, String> entry : slowa.entrySet()) {
            System.out.println("K: " + entry.getKey() + " " + " V: " + entry.getValue());
        }

        Map<String, String> slowa3 = sortByValues(slowa);
        System.out.println(" ");
        for (Map.Entry<String, String> entry3 : slowa3.entrySet()) {
            System.out.println("K: " + entry3.getKey() + " " + " V: " + entry3.getValue());
        }
    }

    private static HashMap sortByValues(Map map) {
        List list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o1)).getValue())
                        .compareTo(((Map.Entry) (o2)).getValue());
            }
        });
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}