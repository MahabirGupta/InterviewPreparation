package CollectionsFrameWork;

import java.util.*;

public class CollectionsFramework {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Mahabir");
        list.add("Gupta");
        list.add("Anish");
        list.add("Mahabir");
        list.add("Anishkaa");
        list.add("Gauri");
        System.out.println(list);

        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        System.out.println(linkedList);

        Set<String> set = new HashSet<>();
        set.addAll(list);
        System.out.println(set);

        Set<String> set1 = new LinkedHashSet<>();
        set1.addAll(list);
        System.out.println(set1);

        Set<String> set2 = new TreeSet<>();
        set2.addAll(list);
        System.out.println(set2);

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(1223);
        queue.add(42);
        queue.add(212);
        queue.add(-812);
        queue.add(8);
        queue.add(12);
        System.out.println(queue);

        Queue<Integer> queue1 = new LinkedList<>();
        queue1.addAll(queue);
        System.out.println(queue1);

        Deque<String> deque = new ArrayDeque<>();
        deque.addAll(list);
        System.out.println(deque);

        Deque<String> deque1 = new LinkedList<>();
        deque1.addAll(list);
        System.out.println(deque1);

        Map<String, Integer> map = new HashMap<>();
        map.put("Mahabir",1);
        map.put("Gupta",2);
        map.put("Anish",3);
//        map.put("Mahabir",4);
        map.put("Ansihkaa",5);
        map.put("Gauri",6);
        System.out.println(map);

        Map<String, Integer> map1 = new LinkedHashMap<>();
        map1.putAll(map);
        System.out.println(map1);

        Map<String, Integer> map2 = new TreeMap<>();
        map2.putAll(map);
        System.out.println(map2);

        Map<String, Integer> map3 = new Hashtable<>();
        map3.putAll(map);
        System.out.println(map3);












    }
}
