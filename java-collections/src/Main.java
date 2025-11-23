import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== JAVA COLLECTIONS EXAMPLES ===\n");
        
        listExamples();
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        queueExamples();
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        stackExamples();
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        setExamples();
        System.out.println("\n" + "=".repeat(40) + "\n");
        
        mapExamples();
    }

    static void listExamples() {
        System.out.println("1. LIST EXAMPLES");
        System.out.println("- Ordered, allows duplicates, maintains insertion order\n");

        System.out.println("ArrayList (Dynamic array):");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add(1, "Mango");
        System.out.println("  add(): " + fruits);
        System.out.println("  get(2): " + fruits.get(2));
        System.out.println("  size(): " + fruits.size());
        System.out.println("  contains(\"Apple\"): " + fruits.contains("Apple"));
        fruits.remove("Banana");
        System.out.println("  remove(\"Banana\"): " + fruits);

        System.out.println("\nLinkedList (Doubly linked list):");
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.addFirst(5);
        numbers.addLast(40);
        System.out.println("  add operations: " + numbers);
        System.out.println("  getFirst(): " + numbers.getFirst());
        System.out.println("  removeLast(): " + numbers.removeLast() + ", List: " + numbers);

        System.out.println("\nList iteration:");
        System.out.println("  forEach:");
        fruits.forEach(f -> System.out.println("    " + f));
        System.out.println("  iterator:");
        ListIterator<String> iter = fruits.listIterator();
        while (iter.hasNext()) {
            System.out.println("    " + iter.next());
        }
    }

    static void queueExamples() {
        System.out.println("2. QUEUE EXAMPLES");
        System.out.println("- FIFO (First In First Out)\n");

        System.out.println("LinkedList as Queue:");
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        System.out.println("  add(): " + queue);
        System.out.println("  peek(): " + queue.peek());
        System.out.println("  poll(): " + queue.poll() + ", Queue: " + queue);
        queue.offer("Task4");
        System.out.println("  offer(\"Task4\"): " + queue);

        System.out.println("\nPriorityQueue (Min-heap by default):");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(20);
        pq.add(30);
        pq.add(10);
        System.out.println("  Added: 50, 20, 30, 10");
        System.out.println("  poll() in order: ");
        while (!pq.isEmpty()) {
            System.out.println("    " + pq.poll());
        }

        System.out.println("\nPriorityQueue with custom comparator (max-heap):");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.add(50);
        maxHeap.add(20);
        maxHeap.add(30);
        maxHeap.add(10);
        System.out.println("  poll() in order: ");
        while (!maxHeap.isEmpty()) {
            System.out.println("    " + maxHeap.poll());
        }
    }

    static void stackExamples() {
        System.out.println("3. STACK EXAMPLES");
        System.out.println("- LIFO (Last In First Out)\n");

        Stack<String> stack = new Stack<>();
        stack.push("Book1");
        stack.push("Book2");
        stack.push("Book3");
        System.out.println("  push operations: " + stack);
        System.out.println("  peek(): " + stack.peek());
        System.out.println("  pop(): " + stack.pop() + ", Stack: " + stack);
        System.out.println("  search(\"Book1\"): " + stack.search("Book1"));
        System.out.println("  isEmpty(): " + stack.isEmpty());

        System.out.println("\nUsing Deque as Stack:");
        Deque<Integer> deque = new LinkedList<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("  push operations: " + deque);
        System.out.println("  pop(): " + deque.pop() + ", Deque: " + deque);
    }

    static void setExamples() {
        System.out.println("4. SET EXAMPLES");
        System.out.println("- Unordered, no duplicates, no null (TreeSet)\n");

        System.out.println("HashSet (Unordered):");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("JavaScript");
        hashSet.add("Java");
        System.out.println("  Added: Java, Python, JavaScript, Java");
        System.out.println("  HashSet: " + hashSet);
        System.out.println("  size(): " + hashSet.size());
        System.out.println("  contains(\"Python\"): " + hashSet.contains("Python"));

        System.out.println("\nTreeSet (Sorted):");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(10);
        treeSet.add(30);
        System.out.println("  Added: 50, 20, 40, 10, 30");
        System.out.println("  TreeSet (sorted): " + treeSet);
        System.out.println("  first(): " + ((TreeSet<Integer>) treeSet).first());
        System.out.println("  last(): " + ((TreeSet<Integer>) treeSet).last());

        System.out.println("\nSet operations:");
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        System.out.println("  set1: " + set1);
        System.out.println("  set2: " + set2);
        
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("  union: " + union);
        
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("  intersection: " + intersection);
        
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("  difference (set1 - set2): " + difference);
    }

    static void mapExamples() {
        System.out.println("5. MAP EXAMPLES");
        System.out.println("- Key-Value pairs, keys must be unique\n");

        System.out.println("HashMap (Unordered):");
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);
        System.out.println("  put(): " + map);
        System.out.println("  get(\"Bob\"): " + map.get("Bob"));
        System.out.println("  containsKey(\"Alice\"): " + map.containsKey("Alice"));
        System.out.println("  containsValue(30): " + map.containsValue(30));
        map.remove("Bob");
        System.out.println("  remove(\"Bob\"): " + map);

        System.out.println("\nTreeMap (Sorted by key):");
        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Zebra", "Z");
        treeMap.put("Apple", "A");
        treeMap.put("Mango", "M");
        System.out.println("  Added: Zebra, Apple, Mango");
        System.out.println("  TreeMap (sorted): " + treeMap);

        System.out.println("\nMap iteration:");
        System.out.println("  entrySet():");
        map.entrySet().forEach(e -> System.out.println("    " + e.getKey() + " -> " + e.getValue()));
        System.out.println("  keySet():");
        map.keySet().forEach(k -> System.out.println("    " + k));
        System.out.println("  values():");
        map.values().forEach(v -> System.out.println("    " + v));

        System.out.println("\nMap utility methods:");
        map.putIfAbsent("David", 35);
        System.out.println("  putIfAbsent(\"David\", 35): " + map);
        System.out.println("  getOrDefault(\"Eve\", 0): " + map.getOrDefault("Eve", 0));
        map.replace("Alice", 26);
        System.out.println("  replace(\"Alice\", 26): " + map);

        System.out.println("\nLinkedHashMap (Insertion order):");
        Map<String, Integer> linked = new LinkedHashMap<>();
        linked.put("First", 1);
        linked.put("Second", 2);
        linked.put("Third", 3);
        System.out.println("  LinkedHashMap: " + linked);
    }
}