package OOPS.Phase8_PracticeSet;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() { return key; }
    public V getValue() { return value; }

    public void setKey(K key) { this.key = key; }

    public void setValue(V value) { this.value = value; }

    public static <K, V> Pair<V, K> swapPair(Pair<K, V> pair) {
        return new Pair<>(pair.getValue(), pair.getKey());
    }
    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Age", 20);
        Pair<Integer, String> swapped1 = Pair.swapPair(p1);

        Pair<String, String> p2 = new Pair<>("Hello", "World");
        Pair<String, String> swapped2 = Pair.swapPair(p2);

        System.out.println("Original p1: " + p1);
        System.out.println("Swapped p1: " + swapped1);

        System.out.println("Original p2: " + p2);
        System.out.println("Swapped p2: " + swapped2);
    }
}