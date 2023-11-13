import java.util.*;
class MyHashSet {
    private int size = 1000; // Define size as a class-level variable
    private List<List<Integer>> buckets; // Define buckets as a class-level variable

    public MyHashSet() {
        buckets = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    public void add(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        if (!bucket.contains(key)) { // Fix the typo here
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        bucket.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        return bucket.contains(key);
    }

    private int hash(int key) {
        return key % size;
    }
}