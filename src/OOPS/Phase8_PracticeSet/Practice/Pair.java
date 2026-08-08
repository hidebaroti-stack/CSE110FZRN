package OOPS.Phase8_PracticeSet.Practice;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() { return key; }
    public V getValue() { return value; }

    @Override
    public String toString() {
        return "(" + key + ", " + value + ")";
    }

    public static void main(String[] args) {
        Pair<String, Integer> studentScore = new Pair<>("Debaroti",95);
        Pair<String, String> capital = new Pair<>("Bangladesh", "Dhaka");

        System.out.println(studentScore);
        System.out.println(capital);
    }
}